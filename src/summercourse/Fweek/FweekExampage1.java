/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summercourse.Fweek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import summercourse.javaMail;

/**
 *
 * @author sheha
 */
public class FweekExampage1 extends javax.swing.JFrame {

    /**
     * Creates new form FweekExampage1
     */
    public FweekExampage1() {
        initComponents();
        ImageIcon i_mica= new ImageIcon("icons8-python-20.png");
        this.setIconImage(i_mica.getImage());
        Connection      c = null;
        Statement       s = null;
        try {
            String       file = "ID\\login.txt";
            c = new javaMail().connect();
            s = c.createStatement();
            FileReader     fr = new javaMail().fileReader(file);
            BufferedReader br = new javaMail().bufferedReader(fr);         
            FileReader     fr1 = new javaMail().fileReader("ID\\Q1.txt");
            BufferedReader br1 = new javaMail().bufferedReader(fr);
            FileReader     fr2 = new javaMail().fileReader("ID\\Q2.txt");
            BufferedReader br2 = new javaMail().bufferedReader(fr);
            int number;
            String Q1=null;
            String Q2=null;
            while ((number = fr.read()) != -1) {
                char n=(char)number;
                System.out.println(n); 
            }
            if((Q1=br1.readLine())!= null){
                   if(Q1.equals("factorial()")){
                        f1.setSelected(true);
                        s1.setSelected(false);
                        th1.setSelected(false);
                    }else if (Q1.equals("func()")){
                        s1.setSelected(true);
                        f1.setSelected(false);
                        th1.setSelected(false);
                    }else if (Q1.equals("sqrt()")){
                        th1.setSelected(true);
                        f1.setSelected(false);
                        s1.setSelected(false);
                    }    
            }
            if((Q2=br1.readLine())!= null){
                    if(Q2.equals("int(True)")){
                        f2.setSelected(true);
                        s2.setSelected(false);
                        th2.setSelected(false);
                    }else if (Q2.equals("bool()")){
                        s2.setSelected(true);
                        f2.setSelected(false);
                        th2.setSelected(false);
                    }else if (Q2.equals("True=1")){
                        th2.setSelected(true);
                        s2.setSelected(false);
                        f2.setSelected(false);
                    }     
            }
            br.close();
            fr.close();
            br1.close();
            fr1.close();
            br2.close();
            fr2.close();
        }catch(Exception e){
        }finally{
            try {
                s.close();
                c.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }       
        }
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
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        s1 = new javax.swing.JRadioButton();
        th2 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        f2 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        f1 = new javax.swing.JRadioButton();
        th1 = new javax.swing.JRadioButton();
        s2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(39, 50, 56));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(39, 50, 56), 1, true));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("<<< Choose >>>");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(370, 10, 160, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(39, 50, 56));
        jLabel2.setText("1-How do you calculate the factorial of a number ?");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(19, 62, 620, 21);

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        s1.setBackground(new java.awt.Color(250, 250, 250));
        s1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        s1.setForeground(new java.awt.Color(39, 50, 56));
        s1.setText("func()");
        s1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1ActionPerformed(evt);
            }
        });
        jPanel2.add(s1);
        s1.setBounds(20, 90, 70, 23);

        th2.setBackground(new java.awt.Color(250, 250, 250));
        th2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        th2.setForeground(new java.awt.Color(39, 50, 56));
        th2.setText("True=1");
        th2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                th2ActionPerformed(evt);
            }
        });
        jPanel2.add(th2);
        th2.setBounds(20, 320, 120, 23);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(39, 50, 56));
        jLabel3.setText("2-How To cast a boolean to an integer in Python ?");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 190, 570, 21);

        f2.setBackground(new java.awt.Color(250, 250, 250));
        f2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        f2.setForeground(new java.awt.Color(39, 50, 56));
        f2.setText("int(True)");
        f2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f2ActionPerformed(evt);
            }
        });
        jPanel2.add(f2);
        f2.setBounds(20, 240, 120, 23);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-back-64.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4);
        jLabel4.setBounds(820, 350, 60, 50);

        f1.setBackground(new java.awt.Color(250, 250, 250));
        f1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        f1.setForeground(new java.awt.Color(39, 50, 56));
        f1.setText("factorial()");
        f1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f1ActionPerformed(evt);
            }
        });
        jPanel2.add(f1);
        f1.setBounds(20, 50, 100, 23);

        th1.setBackground(new java.awt.Color(250, 250, 250));
        th1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        th1.setForeground(new java.awt.Color(39, 50, 56));
        th1.setText("sqrt()");
        th1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                th1ActionPerformed(evt);
            }
        });
        jPanel2.add(th1);
        th1.setBounds(20, 130, 70, 23);

        s2.setBackground(new java.awt.Color(250, 250, 250));
        s2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        s2.setForeground(new java.awt.Color(39, 50, 56));
        s2.setText("bool()");
        s2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s2ActionPerformed(evt);
            }
        });
        jPanel2.add(s2);
        s2.setBounds(20, 280, 140, 23);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 50, 890, 410);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void s1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1ActionPerformed
        s1.setSelected(true);
        f1.setSelected(false);
        th1.setSelected(false);
    }//GEN-LAST:event_s1ActionPerformed

    private void th2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_th2ActionPerformed
        th2.setSelected(true);
        s2.setSelected(false);
        f2.setSelected(false);
    }//GEN-LAST:event_th2ActionPerformed

    private void f2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f2ActionPerformed
        f2.setSelected(true);
        s2.setSelected(false);
        th2.setSelected(false);
    }//GEN-LAST:event_f2ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        Connection      c = null;
        Statement       s = null;
        try {
            String   file = "ID\\login.txt";
            c = new javaMail().connect();
            s = c.createStatement();
            FileReader fr = new javaMail().fileReader(file);
            BufferedReader br = new javaMail().bufferedReader(fr);
            int number;
            File           file1 = new File("ID\\Q1.txt");
            FileWriter     fw1 = new FileWriter(file1);
            BufferedWriter bw1 = new BufferedWriter(fw1);
            File           file2 = new File("ID\\Q2.txt");
            FileWriter     fw2 = new FileWriter(file2);
            BufferedWriter bw2 = new BufferedWriter(fw2);
            while ((number = fr.read()) != -1) {
                char n=(char)number;
                System.out.println(n);
                if(f1.isSelected()){
                    bw1.write("factorial()");
                }else if(s1.isSelected()){
                    bw1.write("func()");
                }else if(th1.isSelected()){
                    bw1.write("sqrt()");
                }
                bw1.close();
                fw1.close();
                if(f2.isSelected()){
                    bw2.write("int(True)");
                }else if(s2.isSelected()){
                    bw2.write("bool()");
                }else if(th2.isSelected()){
                    bw2.write("True=1");
                }
                bw2.close();
                fw2.close();
            }
            boolean done = s.execute("commit");
            s.close();
            c.close();
            new FweekExampage2().setVisible(true);
            dispose();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }finally{
            try {
                s.close();
                c.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }       
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void f1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f1ActionPerformed
        f1.setSelected(true);
        s1.setSelected(false);
        th1.setSelected(false);
    }//GEN-LAST:event_f1ActionPerformed

    private void th1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_th1ActionPerformed
        th1.setSelected(true);
        s1.setSelected(false);
        f1.setSelected(false);
    }//GEN-LAST:event_th1ActionPerformed

    private void s2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s2ActionPerformed
        s2.setSelected(true);
        f2.setSelected(false);
        th2.setSelected(false);
    }//GEN-LAST:event_s2ActionPerformed

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
            java.util.logging.Logger.getLogger(FweekExampage1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FweekExampage1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FweekExampage1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FweekExampage1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FweekExampage1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JRadioButton f1;
    public javax.swing.JRadioButton f2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JRadioButton s1;
    public javax.swing.JRadioButton s2;
    public javax.swing.JRadioButton th1;
    public javax.swing.JRadioButton th2;
    // End of variables declaration//GEN-END:variables
}
