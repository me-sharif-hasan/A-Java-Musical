/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musical_java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author ASUS
 */
public class giter extends javax.swing.JFrame {

    /**
     * Creates new form giter
     */
    public giter() {
        initComponents();
        btn1.setOpaque(false);
        btn2.setOpaque(false);
        btn3.setOpaque(false);
        btn4.setOpaque(false);
        btn5.setOpaque(false);
        btn6.setOpaque(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 720));
        jPanel1.setLayout(null);

        btn1.setBackground(new java.awt.Color(0, 0, 0));
        btn1.setBorder(null);
        btn1.setPreferredSize(new java.awt.Dimension(73, 15));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1);
        btn1.setBounds(330, 420, 575, 4);

        btn2.setBackground(new java.awt.Color(0, 0, 0));
        btn2.setAlignmentY(1.0F);
        btn2.setAutoscrolls(true);
        btn2.setBorder(null);
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2);
        btn2.setBounds(313, 412, 592, 4);

        btn3.setBackground(new java.awt.Color(0, 0, 0));
        btn3.setBorder(null);
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn3);
        btn3.setBounds(290, 404, 615, 4);

        btn4.setBackground(new java.awt.Color(0, 0, 0));
        btn4.setBorder(null);
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn4);
        btn4.setBounds(270, 395, 635, 4);

        btn5.setBackground(new java.awt.Color(244, 244, 244));
        btn5.setBorder(null);
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel1.add(btn5);
        btn5.setBounds(246, 387, 659, 4);

        btn6.setBackground(new java.awt.Color(0, 0, 0));
        btn6.setBorder(null);
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel1.add(btn6);
        btn6.setBounds(225, 378, 680, 4);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musical_java/img/git.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(1200, 720));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(200, 200, 950, 400);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musical_java/img/bg.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1200, 730);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1200, 720));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        try {
            FileInputStream Iaudio;
            Iaudio = new FileInputStream(new File ("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\Musical_Java\\src\\musical_java\\audio\\a.wav"));
            AudioStream Imusic = new AudioStream(Iaudio);
            AudioPlayer.player.start(Imusic);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(giter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(giter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        try {
            FileInputStream Iaudio;
             Iaudio = new FileInputStream(new File ("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\Musical_Java\\src\\musical_java\\audio\\a.wav"));
            AudioStream Imusic = new AudioStream(Iaudio);
            AudioPlayer.player.start(Imusic);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(giter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(giter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        try {
            FileInputStream Iaudio;
              Iaudio = new FileInputStream(new File ("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\Musical_Java\\src\\musical_java\\audio\\a.wav"));
            AudioStream Imusic = new AudioStream(Iaudio);
            AudioPlayer.player.start(Imusic);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(giter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(giter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        try {
            FileInputStream Iaudio;
              Iaudio = new FileInputStream(new File ("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\Musical_Java\\src\\musical_java\\audio\\a.wav"));
            AudioStream Imusic = new AudioStream(Iaudio);
            AudioPlayer.player.start(Imusic);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(giter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(giter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        try {
            FileInputStream Iaudio;
              Iaudio = new FileInputStream(new File ("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\Musical_Java\\src\\musical_java\\audio\\a.wav"));
            AudioStream Imusic = new AudioStream(Iaudio);
            AudioPlayer.player.start(Imusic);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(giter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(giter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        try {
            FileInputStream Iaudio;
             Iaudio = new FileInputStream(new File ("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\Musical_Java\\src\\musical_java\\audio\\a.wav"));
            AudioStream Imusic = new AudioStream(Iaudio);
            AudioPlayer.player.start(Imusic);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(giter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(giter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn4ActionPerformed

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
            java.util.logging.Logger.getLogger(giter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(giter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(giter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(giter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new giter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}