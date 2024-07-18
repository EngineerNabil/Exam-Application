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
public class FweekExampage8 extends javax.swing.JFrame {

    /**
     * Creates new form FweekExampage8
     */
    public FweekExampage8() {
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
            int number;
            while ((number = fr.read()) != -1) {
                char n=(char)number;
                System.out.println(n);
                ResultSet     rs  = s.executeQuery("Select Q15 , Q16 from fweek_questions where id="+n+"");
                while(rs.next()){
                    String Q15= rs.getString("Q15");
                    String Q16= rs.getString("Q16");
                    if(Q15.equals("2")){
                        f15.setSelected(true);
                        s15.setSelected(false);
                        th15.setSelected(false);
                }else if (Q15.equals("0")){
                        s15.setSelected(true);
                        f15.setSelected(false);
                        th15.setSelected(false);
                }else if (Q15.equals("1")){
                        th15.setSelected(true);
                        f15.setSelected(false);
                        s15.setSelected(false);
                }
                    if(Q16.equals("To perform mathematical operations")){
                        f16.setSelected(true);
                        s16.setSelected(false);
                        th16.setSelected(false);
                }else if (Q16.equals("To break the program flow")){
                        s16.setSelected(true);
                        f16.setSelected(false);
                        th16.setSelected(false);
                }else if (Q16.equals("To group a set of instructions for reuse")){
                        th16.setSelected(true);
                        f16.setSelected(false);
                        s16.setSelected(false);
                }
                }}}catch(Exception e){
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
        jPanel2 = new javax.swing.JPanel();
        th15 = new javax.swing.JRadioButton();
        f15 = new javax.swing.JRadioButton();
        th16 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        f16 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        s15 = new javax.swing.JRadioButton();
        s16 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(39, 50, 56));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(39, 50, 56), 1, true));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("<<< Choose >>>");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(370, 10, 160, 30);

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        th15.setBackground(new java.awt.Color(250, 250, 250));
        th15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        th15.setForeground(new java.awt.Color(39, 50, 56));
        th15.setText("1");
        th15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                th15ActionPerformed(evt);
            }
        });
        jPanel2.add(th15);
        th15.setBounds(20, 150, 80, 20);

        f15.setBackground(new java.awt.Color(250, 250, 250));
        f15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        f15.setForeground(new java.awt.Color(39, 50, 56));
        f15.setText("2");
        f15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f15ActionPerformed(evt);
            }
        });
        jPanel2.add(f15);
        f15.setBounds(20, 70, 80, 20);

        th16.setBackground(new java.awt.Color(250, 250, 250));
        th16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        th16.setForeground(new java.awt.Color(39, 50, 56));
        th16.setText("To group a set of instructions for reuse");
        th16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                th16ActionPerformed(evt);
            }
        });
        jPanel2.add(th16);
        th16.setBounds(20, 320, 290, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(39, 50, 56));
        jLabel3.setText("15-What is the result of the expression 5 % 3?");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 20, 470, 20);

        f16.setBackground(new java.awt.Color(250, 250, 250));
        f16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        f16.setForeground(new java.awt.Color(39, 50, 56));
        f16.setText("To perform mathematical operations");
        f16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f16ActionPerformed(evt);
            }
        });
        jPanel2.add(f16);
        f16.setBounds(20, 240, 280, 23);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-back-64.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4);
        jLabel4.setBounds(820, 350, 60, 50);

        s15.setBackground(new java.awt.Color(250, 250, 250));
        s15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        s15.setForeground(new java.awt.Color(39, 50, 56));
        s15.setText("0");
        s15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s15ActionPerformed(evt);
            }
        });
        jPanel2.add(s15);
        s15.setBounds(20, 110, 80, 20);

        s16.setBackground(new java.awt.Color(250, 250, 250));
        s16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        s16.setForeground(new java.awt.Color(39, 50, 56));
        s16.setText("To break the program flow");
        s16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s16ActionPerformed(evt);
            }
        });
        jPanel2.add(s16);
        s16.setBounds(20, 280, 280, 23);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(39, 50, 56));
        jLabel6.setText("16-What is the purpose of a function in programming?");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 200, 500, 21);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-back-64__.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 350, 50, 50);

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

    private void th15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_th15ActionPerformed
        s15.setSelected(false);
        f15.setSelected(false);
    }//GEN-LAST:event_th15ActionPerformed

    private void f15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f15ActionPerformed
        s15.setSelected(false);
        th15.setSelected(false);
    }//GEN-LAST:event_f15ActionPerformed

    private void th16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_th16ActionPerformed
        s16.setSelected(false);
        f16.setSelected(false);
    }//GEN-LAST:event_th16ActionPerformed

    private void f16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f16ActionPerformed
        s16.setSelected(false);
        th16.setSelected(false);
    }//GEN-LAST:event_f16ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        Connection      c = null;
        Statement       s = null;
        try {
            String       file = "ID\\login.txt";
            c = new javaMail().connect();
            s = c.createStatement();
            FileReader fr = new javaMail().fileReader(file);
            BufferedReader br = new javaMail().bufferedReader(fr);
            int number;
            File           file15 = new File("ID\\Q15.txt");
            FileWriter     fw15 = new FileWriter(file15);
            BufferedWriter bw15 = new BufferedWriter(fw15);
            File           file16 = new File("ID\\Q16.txt");
            FileWriter     fw16 = new FileWriter(file16);
            BufferedWriter bw16 = new BufferedWriter(fw16);
            while ((number = fr.read()) != -1) {
                char n=(char)number;
                System.out.println(n);
                if(f15.isSelected()){
                    bw15.write("2");
                    boolean     x  = s.execute("update fweek_questions set Q15='2' where id="+n+"");
                }else if(s15.isSelected()){
                    bw15.write("0");
                    boolean     x2  = s.execute("update fweek_questions set Q15='0' where id="+n+"");
                }else if(th15.isSelected()){
                    bw15.write("1");
                    boolean     x3  = s.execute("update fweek_questions set Q15='1' where id="+n+"");
                }
                bw15.close();
                fw15.close();
                if(f16.isSelected()){
                    bw16.write("To perform mathematical operations");
                    boolean     x  = s.execute("update fweek_questions set Q16='To perform mathematical operations' where id="+n+"");
                }else if(s16.isSelected()){
                    bw16.write("To break the program flow");
                    boolean     x2  = s.execute("update fweek_questions set Q16='To break the program flow' where id="+n+"");
                }else if(th16.isSelected()){
                    bw16.write("To group a set of instructions for reuse");
                    boolean     x3  = s.execute("update fweek_questions set Q16='To group a set of instructions for reuse' where id="+n+"");
                }
                bw16.close();
                fw16.close();
            }
            boolean       done = s.execute("commit");
            s.close();
            c.close();
            new FweekExampage9().setVisible(true);
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

    private void s15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s15ActionPerformed
        f15.setSelected(false);
        th15.setSelected(false);
    }//GEN-LAST:event_s15ActionPerformed

    private void s16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s16ActionPerformed
        f16.setSelected(false);
        th16.setSelected(false);
    }//GEN-LAST:event_s16ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Connection      c = null;
        Statement       s = null;
        try {
            String       file = "ID\\login.txt";
            c = new javaMail().connect();
            s = c.createStatement();
            FileReader fr = new javaMail().fileReader(file);
            BufferedReader br = new javaMail().bufferedReader(fr);
            int number;
            File           file15 = new File("ID\\Q15.txt");
            FileWriter     fw15 = new FileWriter(file15);
            BufferedWriter bw15 = new BufferedWriter(fw15);
            File           file16 = new File("ID\\Q16.txt");
            FileWriter     fw16 = new FileWriter(file16);
            BufferedWriter bw16 = new BufferedWriter(fw16);
            while ((number = fr.read()) != -1) {
                char n=(char)number;
                System.out.println(n);
                if(f15.isSelected()){
                    bw15.write("2");
                    boolean     x  = s.execute("update fweek_questions set Q15='2' where id="+n+"");
                }else if(s15.isSelected()){
                    bw15.write("0");
                    boolean     x2  = s.execute("update fweek_questions set Q15='0' where id="+n+"");
                }else if(th15.isSelected()){
                    bw15.write("1");
                    boolean     x3  = s.execute("update fweek_questions set Q15='1' where id="+n+"");
                }
                bw15.close();
                fw15.close();
                if(f16.isSelected()){
                    bw16.write("To perform mathematical operations");
                    boolean     x  = s.execute("update fweek_questions set Q16='To perform mathematical operations' where id="+n+"");
                }else if(s16.isSelected()){
                    bw16.write("To break the program flow");
                    boolean     x2  = s.execute("update fweek_questions set Q16='To break the program flow' where id="+n+"");
                }else if(th16.isSelected()){
                    bw16.write("To group a set of instructions for reuse");
                    boolean     x3  = s.execute("update fweek_questions set Q16='To group a set of instructions for reuse' where id="+n+"");
                }
                bw16.close();
                fw16.close();
            }
            boolean       done = s.execute("commit");
            s.close();
            c.close();
            new FweekExampage7().setVisible(true);
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

    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(FweekExampage8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FweekExampage8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FweekExampage8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FweekExampage8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FweekExampage8().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton f15;
    private javax.swing.JRadioButton f16;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton s15;
    private javax.swing.JRadioButton s16;
    private javax.swing.JRadioButton th15;
    private javax.swing.JRadioButton th16;
    // End of variables declaration//GEN-END:variables
}