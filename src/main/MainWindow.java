/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import main.Elevator.Distance;
import main.Elevator.Mass;

/**
 *
 * @author Kylo55
 */
public class MainWindow extends javax.swing.JFrame {

  /**
   * Creates new form MainWindow
   */
  public MainWindow () {
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    massSlider = new javax.swing.JSlider();
    massSlider.setMajorTickSpacing(10);
    massSlider.setPaintTicks(true);
    massSlider.setPaintLabels(true);
    floorSlider = new javax.swing.JSlider();
    floorSlider.setMajorTickSpacing(1);
    floorSlider.setPaintTicks(true);
    floorSlider.setPaintLabels(true);
    massLabel = new javax.swing.JLabel();
    floorLabel = new javax.swing.JLabel();
    launchButton = new javax.swing.JButton();
    jPanel1 = new javax.swing.JPanel();
    jLabel9 = new javax.swing.JLabel();
    jLabel10 = new javax.swing.JLabel();
    jLabel11 = new javax.swing.JLabel();
    jLabel12 = new javax.swing.JLabel();
    jLabel13 = new javax.swing.JLabel();
    jLabel14 = new javax.swing.JLabel();
    jLabel15 = new javax.swing.JLabel();
    jLabel16 = new javax.swing.JLabel();
    jLabel17 = new javax.swing.JLabel();
    jLabel18 = new javax.swing.JLabel();
    jLabel19 = new javax.swing.JLabel();
    jLabel20 = new javax.swing.JLabel();
    jLabel21 = new javax.swing.JLabel();
    jLabel22 = new javax.swing.JLabel();
    jLabel23 = new javax.swing.JLabel();
    jLabel24 = new javax.swing.JLabel();
    jLabel25 = new javax.swing.JLabel();
    jLabel26 = new javax.swing.JLabel();
    jLabel27 = new javax.swing.JLabel();
    jPanel2 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    massSlider.setMinimum(1);

    floorSlider.setMaximum(10);
    floorSlider.setMinimum(1);
    floorSlider.setValue(1);

    massLabel.setText("Masa");

    floorLabel.setText("Odległość");

    launchButton.setText("Działaj");
    launchButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        launchButtonActionPerformed(evt);
      }
    });

    jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

    jLabel9.setText("jLabel9");

    jLabel10.setText("0");

    jLabel11.setText("0");

    jLabel12.setText("0");

    jLabel13.setText("0");

    jLabel14.setText("0");

    jLabel15.setText("0");

    jLabel16.setText("0");

    jLabel17.setText("0");

    jLabel18.setText("0");

    jLabel19.setText("Dystans");

    jLabel20.setText("Masa");

    jLabel21.setText("Blisko");

    jLabel22.setText("Średnio");

    jLabel23.setText("Daleko");

    jLabel24.setText("Mała");

    jLabel25.setText("Średnia");

    jLabel26.setText("Duża");

    jLabel27.setText("Zagregowana baza wiedzy");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(56, 56, 56)
            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel20)
              .addComponent(jLabel19)
              .addComponent(jLabel25)
              .addComponent(jLabel26)
              .addComponent(jLabel24))))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jLabel17)
                .addComponent(jLabel16)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(jLabel18)
              .addComponent(jLabel15)
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel22)
                .addComponent(jLabel11)))
            .addGap(101, 101, 101)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel13)
              .addComponent(jLabel14)
              .addComponent(jLabel12)
              .addComponent(jLabel23))
            .addGap(46, 46, 46))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jLabel27)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel27))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addGap(2, 2, 2)
                .addComponent(jLabel24)
                .addGap(18, 18, 18)
                .addComponent(jLabel25)
                .addGap(18, 18, 18)
                .addComponent(jLabel26))
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel23)
                .addGap(22, 22, 22)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
              .addComponent(jLabel22)
              .addGap(22, 22, 22)
              .addComponent(jLabel11)
              .addGap(18, 18, 18)
              .addComponent(jLabel18)
              .addGap(18, 18, 18)
              .addComponent(jLabel15)))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jLabel21)
            .addGap(22, 22, 22)
            .addComponent(jLabel10)
            .addGap(18, 18, 18)
            .addComponent(jLabel17)
            .addGap(18, 18, 18)
            .addComponent(jLabel16)))
        .addGap(27, 27, 27))
    );

    jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

    jLabel1.setText("Przyspieszenie");

    jLabel2.setText("Prędkość");

    jLabel3.setText("Pozostały dystans");

    jLabel4.setText("0");
    jLabel4.setToolTipText("");

    jLabel5.setText("0");
    jLabel5.setToolTipText("");

    jLabel6.setText("0");

    jLabel7.setText("Siła");

    jLabel8.setText("0");

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel3)
          .addComponent(jLabel7))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
          .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap())
      .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
          .addContainerGap()
          .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
            .addComponent(jLabel2))
          .addGap(28, 28, 28)
          .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
          .addContainerGap()))
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addGap(53, 53, 53)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(jLabel6))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel7)
          .addComponent(jLabel8))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
          .addContainerGap()
          .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jLabel1)
            .addComponent(jLabel4))
          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
          .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jLabel2)
            .addComponent(jLabel5))
          .addContainerGap(160, Short.MAX_VALUE)))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(launchButton)
        .addContainerGap())
      .addGroup(layout.createSequentialGroup()
        .addGap(29, 29, 29)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(massLabel)
              .addComponent(floorLabel))
            .addGap(31, 31, 31)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(massSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
              .addComponent(floorSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
          .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(90, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(massSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(massLabel))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(floorSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(floorLabel))
        .addGap(49, 49, 49)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
        .addComponent(launchButton))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void launchButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_launchButtonActionPerformed
  {//GEN-HEADEREND:event_launchButtonActionPerformed
    // TODO add your handling code here:
    final ElevatorForm elevatorForm = new ElevatorForm();
    elevatorForm.setVisible(true);
    elevatorForm.setMainWindow(this);
    elevatorForm.startMoving(floorSlider.getValue(), massSlider.getValue());
  }//GEN-LAST:event_launchButtonActionPerformed

  /**
   * @param args the command line arguments
   */
  public static void main (String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(() -> {
      new MainWindow().setVisible(true);
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel floorLabel;
  private javax.swing.JSlider floorSlider;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel11;
  private javax.swing.JLabel jLabel12;
  private javax.swing.JLabel jLabel13;
  private javax.swing.JLabel jLabel14;
  private javax.swing.JLabel jLabel15;
  private javax.swing.JLabel jLabel16;
  private javax.swing.JLabel jLabel17;
  private javax.swing.JLabel jLabel18;
  private javax.swing.JLabel jLabel19;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel20;
  private javax.swing.JLabel jLabel21;
  private javax.swing.JLabel jLabel22;
  private javax.swing.JLabel jLabel23;
  private javax.swing.JLabel jLabel24;
  private javax.swing.JLabel jLabel25;
  private javax.swing.JLabel jLabel26;
  private javax.swing.JLabel jLabel27;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JButton launchButton;
  private javax.swing.JLabel massLabel;
  private javax.swing.JSlider massSlider;
  // End of variables declaration//GEN-END:variables

  void updateLabels (Elevator elevator) {
//    jlabel4,5,6,8 przysp pre dys sil
    jLabel4.setText(elevator.getAcceleration() + "");
    jLabel5.setText(elevator.getSpeed() + "");
    jLabel6.setText(elevator.getCurrDistance() + "");
    jLabel8.setText(elevator.getCalculatedForce() + "");
    
    jLabel10.setText(elevator.getAggregatedKnowledge().get(Distance.CLOSE).get(Mass.SMALL) + "");
    jLabel11.setText(elevator.getAggregatedKnowledge().get(Distance.MEDIUM).get(Mass.SMALL) + "");
    jLabel12.setText(elevator.getAggregatedKnowledge().get(Distance.FAR).get(Mass.SMALL) + "");
    jLabel13.setText(elevator.getAggregatedKnowledge().get(Distance.FAR).get(Mass.MEDIUM) + "");
    jLabel14.setText(elevator.getAggregatedKnowledge().get(Distance.FAR).get(Mass.BIG) + "");
    jLabel15.setText(elevator.getAggregatedKnowledge().get(Distance.MEDIUM).get(Mass.BIG) + "");
    jLabel16.setText(elevator.getAggregatedKnowledge().get(Distance.CLOSE).get(Mass.BIG) + "");
    jLabel17.setText(elevator.getAggregatedKnowledge().get(Distance.CLOSE).get(Mass.MEDIUM) + "");
    jLabel18.setText(elevator.getAggregatedKnowledge().get(Distance.MEDIUM).get(Mass.MEDIUM) + "");
  }
}
