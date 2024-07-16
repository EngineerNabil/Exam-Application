/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summercourse;

import java.awt.Color;
import javax.swing.ImageIcon;
import summercourse.Fweek.Fweek;

/**
 *
 * @author sheha
 */
public class PythonWeeks extends javax.swing.JFrame {

    /**
     * Creates new form PythonWeeks
     */
    public PythonWeeks() {
        initComponents();
        ImageIcon i_mica= new ImageIcon("icons8-python-20.png");
        this.setIconImage(i_mica.getImage());
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
        jLabel1 = new javax.swing.JLabel();
        w2 = new javax.swing.JLabel();
        w3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        w1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(39, 50, 56), 1, true));
        jPanel1.setMinimumSize(new java.awt.Dimension(910, 466));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/small_week.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(410, 4, 490, 450);

        w2.setFont(new java.awt.Font("Segoe UI Emoji", 3, 14)); // NOI18N
        w2.setForeground(new java.awt.Color(28, 46, 51));
        w2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        w2.setText("Week 2");
        w2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(244, 240, 241), new java.awt.Color(1, 66, 104)));
        w2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                w2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                w2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                w2MouseExited(evt);
            }
        });
        jPanel1.add(w2);
        w2.setBounds(160, 180, 90, 60);

        w3.setBackground(new java.awt.Color(228, 241, 247));
        w3.setFont(new java.awt.Font("Segoe UI Emoji", 3, 14)); // NOI18N
        w3.setForeground(new java.awt.Color(28, 46, 51));
        w3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        w3.setText("Week 3");
        w3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(244, 240, 241), new java.awt.Color(1, 66, 104)));
        w3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                w3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                w3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                w3MouseExited(evt);
            }
        });
        jPanel1.add(w3);
        w3.setBounds(160, 310, 90, 60);

        jPanel2.setBackground(new java.awt.Color(228, 241, 247));
        jPanel2.setLayout(null);
        jPanel1.add(jPanel2);
        jPanel2.setBounds(160, 180, 90, 60);

        jPanel3.setBackground(new java.awt.Color(228, 241, 247));
        jPanel3.setLayout(null);

        w1.setBackground(new java.awt.Color(209, 233, 237));
        w1.setFont(new java.awt.Font("Segoe UI Emoji", 3, 14)); // NOI18N
        w1.setForeground(new java.awt.Color(28, 46, 51));
        w1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        w1.setText("Week 1");
        w1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(244, 240, 241), new java.awt.Color(1, 66, 104)));
        w1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                w1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                w1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                w1MouseExited(evt);
            }
        });
        jPanel3.add(w1);
        w1.setBounds(0, 0, 90, 60);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(160, 60, 90, 60);

        jPanel4.setBackground(new java.awt.Color(228, 241, 247));
        jPanel4.setLayout(null);
        jPanel1.add(jPanel4);
        jPanel4.setBounds(160, 310, 90, 60);
        jPanel1.add(logo);
        logo.setBounds(320, 160, 100, 100);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-back-52 (2).png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 410, 60, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void w1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_w1MouseEntered
        w1.setForeground(new Color(230,85,68));
        ImageIcon f_icon = new ImageIcon("icons8-first-100.png");
        logo.setIcon(f_icon);
    }//GEN-LAST:event_w1MouseEntered

    private void w1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_w1MouseExited
        w1.setForeground(new Color(61,80,94));
        logo.setIcon(null);
    }//GEN-LAST:event_w1MouseExited

    private void w2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_w2MouseEntered
        w2.setForeground(new Color(230,85,68));
        ImageIcon s_icon = new ImageIcon("icons8-circled-2-100.png");
        logo.setIcon(s_icon);
    }//GEN-LAST:event_w2MouseEntered

    private void w2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_w2MouseExited
        w2.setForeground(new Color(61,80,94));
        logo.setIcon(null);
    }//GEN-LAST:event_w2MouseExited

    private void w3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_w3MouseEntered
        w3.setForeground(new Color(230,85,68));
        ImageIcon th_icon = new ImageIcon("icons8-circled-3-100.png");
        logo.setIcon(th_icon);
    }//GEN-LAST:event_w3MouseEntered

    private void w3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_w3MouseExited
        w3.setForeground(new Color(61,80,94));
        logo.setIcon(null);
    }//GEN-LAST:event_w3MouseExited

    private void w1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_w1MouseClicked
        new Week1_password().setVisible(true);
        
    }//GEN-LAST:event_w1MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        new Main().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void w2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_w2MouseClicked
        new Week2_password().setVisible(true);
        
    }//GEN-LAST:event_w2MouseClicked

    private void w3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_w3MouseClicked
        new Fweek_password().setVisible(true);        
    }//GEN-LAST:event_w3MouseClicked

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
            java.util.logging.Logger.getLogger(PythonWeeks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PythonWeeks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PythonWeeks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PythonWeeks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PythonWeeks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel w1;
    private javax.swing.JLabel w2;
    private javax.swing.JLabel w3;
    // End of variables declaration//GEN-END:variables
}
