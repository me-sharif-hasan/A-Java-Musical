package com.iishanto.Guitar;
import com.iishanto.Settings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class GuitarUI{

    /**
     * Creates new form giter
     */
    JFrame guitar=null;
    boolean ctrl=false;
    public GuitarUI() {
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
        guitar=new JFrame();
        guitar.setResizable(false);
        addKeyEvent(guitar);

        guitar.setLayout(null);

        jPanel1 = new javax.swing.JPanel();
        addKeyEvent(jPanel1);

        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        addKeyEvent(btn1);addKeyEvent(btn2);addKeyEvent(btn3);addKeyEvent(btn4);addKeyEvent(btn5);addKeyEvent(btn6);

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        addKeyEvent(jPanel1);addKeyEvent(jLabel2);

        guitar.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 720));
        jPanel1.setLayout(null);

        btn1.setBackground(new java.awt.Color(0, 0, 0));
        btn1.setBorder(null);
        btn1.setPreferredSize(new java.awt.Dimension(73, 15));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if (!ctrl) return;
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
                if (!ctrl) return;
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2);
        btn2.setBounds(313, 412, 592, 4);

        btn3.setBackground(new java.awt.Color(0, 0, 0));
        btn3.setBorder(null);
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if (!ctrl) return;
                btn3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn3);
        btn3.setBounds(290, 404, 615, 4);

        btn4.setBackground(new java.awt.Color(0, 0, 0));
        btn4.setBorder(null);
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if (!ctrl) return;
                btn4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn4);
        btn4.setBounds(270, 395, 635, 4);

        btn5.setBackground(new java.awt.Color(244, 244, 244));
        btn5.setBorder(null);

        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if (!ctrl) return;
                btn5ActionPerformed(evt);
            }
        });
        jPanel1.add(btn5);
        btn5.setBounds(246, 387, 659, 4);

        btn6.setBackground(new java.awt.Color(0, 0, 0));
        btn6.setBorder(null);
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if (!ctrl) return;
                btn6ActionPerformed(evt);
            }
        });
        jPanel1.add(btn6);
        btn6.setBounds(225, 378, 680, 4);


        btn1.addMouseListener(new MouseListener() {
            ActionEvent ek;
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btn1.doClick();
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        btn2.addMouseListener(new MouseListener() {
            ActionEvent ek;
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btn2.doClick();
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        btn3.addMouseListener(new MouseListener() {
            ActionEvent ek;
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btn3.doClick();
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        btn4.addMouseListener(new MouseListener() {
            ActionEvent ek;
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btn4.doClick();
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        btn5.addMouseListener(new MouseListener() {
            ActionEvent ek;
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btn5.doClick();
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        btn6.addMouseListener(new MouseListener() {
            ActionEvent ek;
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btn6.doClick();
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });



        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guitar/git.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(1200, 720));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(200, 200, 950, 400);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guitar/bg.jpg"))); // NOI18N



        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1200, 730);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(guitar.getContentPane());
        guitar.getContentPane().setLayout(layout);
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

        guitar.setSize(new java.awt.Dimension(1200, 720));
        guitar.setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        Settings.getInstance().getSignal().write("guitar","a01e1guit");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        Settings.getInstance().getSignal().write("guitar","a03g1guit");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        Settings.getInstance().getSignal().write("guitar","a06e2guit");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        Settings.getInstance().getSignal().write("guitar","a05a1guit");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        Settings.getInstance().getSignal().write("guitar","a02b1guit");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        Settings.getInstance().getSignal().write("guitar","a04d1guit");
    }//GEN-LAST:event_btn4ActionPerformed


    public void showGuitar(){
        guitar.setVisible(true);
    }
    private void addKeyEvent(Component component){
        component.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("ok");
                ctrl=true;
            }

            @Override
            public void keyReleased(KeyEvent e) {
                ctrl=false;
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