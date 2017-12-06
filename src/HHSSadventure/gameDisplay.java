/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HHSSadventure;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author malij6756
 */
public class gameDisplay extends javax.swing.JFrame {

    private mainGame controller;
    private BufferedImage img;

    /**
     * Creates new form gameDisplay
     */
    public gameDisplay() {
        initComponents();
        controller = new mainGame(this);
        updateinfo();
        // Read the Text File
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftTurn = new javax.swing.JButton();
        moveForward = new javax.swing.JButton();
        rightTurn = new javax.swing.JButton();
        jImage1 = new HHSSadventure.JImage();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        leftTurn.setText("Left");
        leftTurn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftTurnActionPerformed(evt);
            }
        });

        moveForward.setText("Move");
        moveForward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveForwardActionPerformed(evt);
            }
        });

        rightTurn.setText("Right");
        rightTurn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightTurnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(leftTurn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(moveForward)
                .addGap(109, 109, 109)
                .addComponent(rightTurn))
            .addComponent(jImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jImage1, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(leftTurn)
                    .addComponent(moveForward)
                    .addComponent(rightTurn))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void moveForwardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveForwardActionPerformed
        LOL output = new LOL(null);
        try {
            img = ImageIO.read(new File("Images/images/" + output.getImgName()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        jImage1.setImage(img);
    }//GEN-LAST:event_moveForwardActionPerformed

    private void leftTurnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftTurnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_leftTurnActionPerformed

    private void rightTurnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightTurnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rightTurnActionPerformed
    private void updateinfo() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(gameDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gameDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gameDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gameDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gameDisplay().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private HHSSadventure.JImage jImage1;
    private javax.swing.JButton leftTurn;
    private javax.swing.JButton moveForward;
    private javax.swing.JButton rightTurn;
    // End of variables declaration//GEN-END:variables
}
