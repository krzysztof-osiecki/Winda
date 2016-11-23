package main;

import java.util.HashMap;
import java.util.Map;

public class Elevator {

//  <editor-fold desc="Static initialization">
  private static final Map<Distance, Map<Mass, Force>> KNOWLEDGE_BASE = new HashMap<>();
  private static final int MEDIUM_POINT = 75;
  private static final int CLOSE_POINT = 50;
  private static final int FAR_POINT = 100;
  private static final int CLOSE_MASS = 25;
  private static final int MEDIUM_MASS = 50;
  private static final int BIG_MASS = 75;
  //wartosc ostateczna to sila
  // a = F/m;

  static {
    Map<Mass, Force> close = new HashMap<>();
    close.put(Mass.BIG, Force.SLOWER);
    close.put(Mass.MEDIUM, Force.SLOWER);
    close.put(Mass.SMALL, Force.KEEPUP);
    Map<Mass, Force> medium = new HashMap<>();
    medium.put(Mass.BIG, Force.KEEPUP);
    medium.put(Mass.MEDIUM, Force.SLOWER);
    medium.put(Mass.SMALL, Force.SLOWER);
    Map<Mass, Force> far = new HashMap<>();
    far.put(Mass.BIG, Force.FASTER);
    far.put(Mass.MEDIUM, Force.FASTER);
    far.put(Mass.SMALL, Force.FASTER);
    KNOWLEDGE_BASE.put(Distance.CLOSE, close);
    KNOWLEDGE_BASE.put(Distance.MEDIUM, medium);
    KNOWLEDGE_BASE.put(Distance.FAR, far);
  }
//  </editor-fold>

//  <editor-fold desc="Fields">
  private final Map<Distance, Map<Mass, Double>> aggregatedKnowledge = new HashMap<>();
  private final int destFloor;
  private final int elevatorMass;
  private int currFloor;
  private double speed;
  private Map<Mass, Double> massAffiliation = new HashMap<>();
//  </editor-fold>

//  <editor-fold desc="Util/Enum">
  private static Double max (double... numbers) {
    double max = 0.0;
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] > max) {
        max = numbers[i];
      }
    }
    return max;
  }

  private static Double min (double... numbers) {
    double min = Double.MAX_VALUE;
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] < min) {
        min = numbers[i];
      }
    }
    return min;
  }

  private enum Distance {
    CLOSE, MEDIUM, FAR
  }

  private enum Mass {
    SMALL, MEDIUM, BIG
  }

  private enum Force {
    FASTER, KEEPUP, SLOWER
  }
//  </editor-fold>

//  <editor-fold desc="Constructor">
  public Elevator (int currFloor, int destFloor, int mass, int speed) {
    Map<Mass, Double> close = new HashMap<>();
    close.put(Mass.BIG, 0.);
    close.put(Mass.MEDIUM, 0.);
    close.put(Mass.SMALL, 0.);
    Map<Mass, Double> medium = new HashMap<>();
    medium.put(Mass.BIG, 0.);
    medium.put(Mass.MEDIUM, 0.);
    medium.put(Mass.SMALL, 0.);
    Map<Mass, Double> far = new HashMap<>();
    far.put(Mass.BIG, 0.);
    far.put(Mass.MEDIUM, 0.);
    far.put(Mass.SMALL, 0.);
    aggregatedKnowledge.put(Distance.CLOSE, close);
    aggregatedKnowledge.put(Distance.MEDIUM, medium);
    aggregatedKnowledge.put(Distance.FAR, far);
    this.currFloor = currFloor;
    this.destFloor = destFloor;
    this.elevatorMass = mass;
    this.speed = speed;
    massAffiliation = new HashMap<>();
    massAffiliation.put(Mass.SMALL, massSmallFunction(mass));
    massAffiliation.put(Mass.MEDIUM, massMediumFunction(mass));
    massAffiliation.put(Mass.BIG, massBigFunction(mass));
  }
//  </editor-fold>

//  <editor-fold desc="API">
  public double calculateMovement () {
    int currDistance = currFloor - destFloor;
    fuzzAndAggregate(currDistance);
    final Map<Force, Double> activationLevels = calculateActivationLevels();
    double calculatedForce = calculateForce(activationLevels);
    double acceleration = calculatedForce / (double) (elevatorMass + 50);
    speed = min(5, speed + acceleration);
    speed = speed < 1 ? 1 : speed;
    currFloor -= speed;
    System.out.println("Current speed: " + speed);
    return speed;
  }
//  </editor-fold>

// <editor-fold desc="Logic">
  private double calculateForce (Map<Force, Double> activationLevels) {
    double counter = 0;
    double denominator = 0;
    for (double currForce = -40; currForce <= 40; currForce += 1) {
      final double slowerResult = min(forceSlowerFunction(currForce), activationLevels.get(Force.SLOWER));
      final double mediumResult = min(forceMediumFunction(currForce), activationLevels.get(Force.KEEPUP));
      final double fasterResult = min(forceFasterFunction(currForce), activationLevels.get(Force.FASTER));
      double value = max(slowerResult, mediumResult, fasterResult);
      counter += value * currForce;
      denominator += value;
      int i = 0;
    }
    return counter / denominator;
  }

  private void fuzzAndAggregate (int currDistance) {
    Map<Distance, Double> distanceAffiliation = new HashMap<>();
    distanceAffiliation.put(Distance.FAR, distanceFarFunction(currDistance));
    distanceAffiliation.put(Distance.CLOSE, distanceCloseFunction(currDistance));
    distanceAffiliation.put(Distance.MEDIUM, distanceMediumFunction(currDistance));
    aggregatedKnowledge.entrySet().forEach(entry -> {
      final Distance distKey = entry.getKey();
      entry.getValue().entrySet()
        .stream()
        .map(inner -> inner.getKey())
        .forEachOrdered(massKey -> {
          aggregatedKnowledge.get(distKey).put(massKey, min(distanceAffiliation.get(distKey), massAffiliation.get(massKey)));
        });
    });
  }

  private Map<Force, Double> calculateActivationLevels () {
    Map<Force, Double> activationLevel = new HashMap<>();
    activationLevel.put(Force.SLOWER,
      max(
        aggregatedKnowledge.get(Distance.CLOSE).get(Mass.BIG),
        aggregatedKnowledge.get(Distance.CLOSE).get(Mass.MEDIUM),
        aggregatedKnowledge.get(Distance.MEDIUM).get(Mass.MEDIUM),
        aggregatedKnowledge.get(Distance.MEDIUM).get(Mass.SMALL)
      )
    );
    activationLevel.put(Force.KEEPUP,
      max(
        aggregatedKnowledge.get(Distance.CLOSE).get(Mass.SMALL),
        aggregatedKnowledge.get(Distance.MEDIUM).get(Mass.BIG)
      )
    );
    activationLevel.put(Force.FASTER,
      max(
        aggregatedKnowledge.get(Distance.FAR).get(Mass.BIG),
        aggregatedKnowledge.get(Distance.FAR).get(Mass.MEDIUM),
        aggregatedKnowledge.get(Distance.FAR).get(Mass.SMALL)
      )
    );
    return activationLevel;
  }
// </editor-fold>

//  <editor-fold desc="Membership functions">
  private double distanceCloseFunction (int distance) {
    if (distance <= CLOSE_POINT) {
      return 1;
    }
    if (distance >= MEDIUM_POINT) {
      return 0;
    }
    return (MEDIUM_POINT - distance) / (double) (MEDIUM_POINT - CLOSE_POINT);
  }

  private double distanceMediumFunction (int distance) {
    if (distance <= CLOSE_POINT) {
      return 0;
    }
    if (distance >= FAR_POINT) {
      return 0;
    }
    if (distance > CLOSE_POINT && distance <= MEDIUM_POINT) {
      return (distance - CLOSE_POINT) / (double) (MEDIUM_POINT - CLOSE_POINT);
    }
    return (FAR_POINT - distance) / (double) (FAR_POINT - MEDIUM_POINT);
  }

  private double distanceFarFunction (int distance) {
    if (distance <= MEDIUM_POINT) {
      return 0;
    }
    if (distance >= FAR_POINT) {
      return 1;
    }
    return (distance - MEDIUM_POINT) / (double) (FAR_POINT - MEDIUM_POINT);
  }

  private double massSmallFunction (int mass) {
    if (mass <= CLOSE_MASS) {
      return 1;
    }
    if (mass >= MEDIUM_MASS) {
      return 0;
    }
    return (MEDIUM_MASS - mass) / (double) (MEDIUM_MASS - 25);
  }

  private double massMediumFunction (int mass) {
    if (mass <= CLOSE_MASS) {
      return 0;
    }
    if (mass >= BIG_MASS) {
      return 0;
    }
    if (mass > CLOSE_MASS && mass <= MEDIUM_MASS) {
      return (mass - CLOSE_MASS) / (double) (MEDIUM_MASS - CLOSE_MASS);
    }
    return (BIG_MASS - mass) / (double) (BIG_MASS - MEDIUM_MASS);
  }

  private double massBigFunction (int mass) {
    if (mass <= MEDIUM_MASS) {
      return 0;
    }
    if (mass >= BIG_MASS) {
      return 1;
    }
    return (mass - MEDIUM_MASS) / (double) (BIG_MASS - MEDIUM_MASS);
  }

  //a = -40 b = -20 c = 0
  private double forceSlowerFunction (double force) {
    if (force <= -40) {
      return 0;
    }
    if (force >= 0) {
      return 0;
    }
    if (force > -40 && force <= -20) {
      return (force - -40) / (double) (0 - -40);
    }
    return (0 - force) / (double) (0 - -20);
  }

  private double forceMediumFunction (double force) {
    if (force <= -20) {
      return 0;
    }
    if (force >= 20) {
      return 0;
    }
    if (force > -20 && force <= 0) {
      return (force - -20) / (double) (0 - -20);
    }
    return (20 - force) / (double) (20 - 0);
  }

  private double forceFasterFunction (double force) {
    if (force <= 0) {
      return 0;
    }
    if (force >= 40) {
      return 0;
    }
    if (force > 0 && force <= 20) {
      return (force - 0) / (double) (20 - 0);
    }
    return (40 - force) / (double) (40 - 20);
  }
//  </editor-fold>
}
