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
public class FweekExampage4 extends javax.swing.JFrame {

    /**
     * Creates new form FweekExampage4
     */
    public FweekExampage4() {
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
                ResultSet     rs  = s.executeQuery("Select Q7 , Q8 from fweek_questions where id="+n+"");
                while(rs.next()){
                    String Q7= rs.getString("Q7");
                    String Q8= rs.getString("Q8");
                    if(Q7.equals("list")){
                        f7.setSelected(true);
                        s7.setSelected(false);
                        th7.setSelected(false);
                }else if (Q7.equals("array")){
                        s7.setSelected(true);
                        f7.setSelected(false);
                        th7.setSelected(false);
                }else if (Q7.equals("tuple")){
                        th7.setSelected(true);
                        f7.setSelected(false);
                        s7.setSelected(false);
                }
                    if(Q8.equals("By key")){
                        f8.setSelected(true);
                        s8.setSelected(false);
                        th8.setSelected(false);
                }else if (Q8.equals("By index")){
                        s8.setSelected(true);
                        f8.setSelected(false);
                        th8.setSelected(false);
                }else if (Q8.equals("By value")){
                        th8.setSelected(true);
                        f8.setSelected(false);
                        s8.setSelected(false);
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
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        f7 = new javax.swing.JRadioButton();
        th7 = new javax.swing.JRadioButton();
        th8 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        f8 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        s7 = new javax.swing.JRadioButton();
        s8 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();

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
        jLabel2.setText("7-Which of the following is a fixed-size sequence of objects?");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(19, 62, 550, 21);

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        f7.setBackground(new java.awt.Color(250, 250, 250));
        f7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        f7.setForeground(new java.awt.Color(39, 50, 56));
        f7.setText("List");
        f7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f7ActionPerformed(evt);
            }
        });
        jPanel2.add(f7);
        f7.setBounds(20, 70, 90, 23);

        th7.setBackground(new java.awt.Color(250, 250, 250));
        th7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        th7.setForeground(new java.awt.Color(39, 50, 56));
        th7.setText("Tuple");
        th7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                th7ActionPerformed(evt);
            }
        });
        jPanel2.add(th7);
        th7.setBounds(20, 150, 120, 23);

        th8.setBackground(new java.awt.Color(250, 250, 250));
        th8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        th8.setForeground(new java.awt.Color(39, 50, 56));
        th8.setText("By value");
        th8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                th8ActionPerformed(evt);
            }
        });
        jPanel2.add(th8);
        th8.setBounds(20, 320, 100, 23);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(39, 50, 56));
        jLabel3.setText("8-How do you access a value in a dictionary in Python?");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 190, 860, 21);

        f8.setBackground(new java.awt.Color(250, 250, 250));
        f8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        f8.setForeground(new java.awt.Color(39, 50, 56));
        f8.setText("By key");
        f8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f8ActionPerformed(evt);
            }
        });
        jPanel2.add(f8);
        f8.setBounds(20, 240, 100, 23);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-back-64.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4);
        jLabel4.setBounds(820, 350, 60, 50);

        s7.setBackground(new java.awt.Color(250, 250, 250));
        s7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        s7.setForeground(new java.awt.Color(39, 50, 56));
        s7.setText("Array");
        s7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s7ActionPerformed(evt);
            }
        });
        jPanel2.add(s7);
        s7.setBounds(20, 110, 100, 23);

        s8.setBackground(new java.awt.Color(250, 250, 250));
        s8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        s8.setForeground(new java.awt.Color(39, 50, 56));
        s8.setText("By index");
        s8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s8ActionPerformed(evt);
            }
        });
        jPanel2.add(s8);
        s8.setBounds(20, 280, 100, 23);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-back-64__.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 350, 50, 50);

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

    private void f7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f7ActionPerformed
        f7.setSelected(true);
        s7.setSelected(false);
        th7.setSelected(false);
    }//GEN-LAST:event_f7ActionPerformed

    private void th7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_th7ActionPerformed
        th7.setSelected(true);
        s7.setSelected(false);
        f7.setSelected(false);
    }//GEN-LAST:event_th7ActionPerformed

    private void th8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_th8ActionPerformed
        th8.setSelected(true);
        s8.setSelected(false);
        f8.setSelected(false);
    }//GEN-LAST:event_th8ActionPerformed

    private void f8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f8ActionPerformed
        f8.setSelected(true);
        s8.setSelected(false);
        th8.setSelected(false);
    }//GEN-LAST:event_f8ActionPerformed

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
            File           file7 = new File("ID\\Q7.txt");
            FileWriter     fw7 = new FileWriter(file7);
            BufferedWriter bw7 = new BufferedWriter(fw7);
            File           file8 = new File("ID\\Q8.txt");
            FileWriter     fw8 = new FileWriter(file8);
            BufferedWriter bw8 = new BufferedWriter(fw8);
            while ((number = fr.read()) != -1) {
                char n=(char)number;
                System.out.println(n);
                if(f7.isSelected()){
                    bw7.write("list");
                    boolean     x  = s.execute("update fweek_questions set Q7='list' where id="+n+"");
                }else if(s7.isSelected()){
                    bw7.write("array");
                    boolean     x2  = s.execute("update fweek_questions set Q7='array' where id="+n+"");
                }else if(th7.isSelected()){
                    bw7.write("tuple");
                    boolean     x3  = s.execute("update fweek_questions set Q7='tuple' where id="+n+"");
                }
                bw7.close();
                fw7.close();
                if(f8.isSelected()){
                    bw8.write("By key");
                    boolean     x  = s.execute("update fweek_questions set Q8='By key' where id="+n+"");
                }else if(s8.isSelected()){
                    bw8.write("By index");
                    boolean     x2  = s.execute("update fweek_questions set Q8='By index' where id="+n+"");
                }else if(th8.isSelected()){
                    bw8.write("By value");
                    boolean     x3  = s.execute("update fweek_questions set Q8='By value' where id="+n+"");
                }
                bw8.close();
                fw8.close();
            }
            boolean       done = s.execute("commit");
            s.close();
            c.close();
            new FweekExampage5().setVisible(true);
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

    private void s7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s7ActionPerformed
        s7.setSelected(true);
        f7.setSelected(false);
        th7.setSelected(false);
    }//GEN-LAST:event_s7ActionPerformed

    private void s8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s8ActionPerformed
        s8.setSelected(true);
        f8.setSelected(false);
        th8.setSelected(false);
    }//GEN-LAST:event_s8ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        Connection      c = null;
        Statement       s = null;
        try {
            String       file = "ID\\login.txt";
            c = new javaMail().connect();
            s = c.createStatement();
            FileReader fr = new javaMail().fileReader(file);
            BufferedReader br = new javaMail().bufferedReader(fr);
            int number;
            File           file7 = new File("ID\\Q7.txt");
            FileWriter     fw7 = new FileWriter(file7);
            BufferedWriter bw7 = new BufferedWriter(fw7);
            File           file8 = new File("ID\\Q8.txt");
            FileWriter     fw8 = new FileWriter(file8);
            BufferedWriter bw8 = new BufferedWriter(fw8);
            while ((number = fr.read()) != -1) {
                char n=(char)number;
                System.out.println(n);
                if(f7.isSelected()){
                    bw7.write("list");
                    boolean     x  = s.execute("update fweek_questions set Q7='list' where id="+n+"");
                }else if(s7.isSelected()){
                    bw7.write("array");
                    boolean     x2  = s.execute("update fweek_questions set Q7='array' where id="+n+"");
                }else if(th7.isSelected()){
                    bw7.write("tuple");
                    boolean     x3  = s.execute("update fweek_questions set Q7='tuple' where id="+n+"");
                }
                bw7.close();
                fw7.close();
                if(f8.isSelected()){
                    bw8.write("By key");
                    boolean     x  = s.execute("update fweek_questions set Q8='By key' where id="+n+"");
                }else if(s8.isSelected()){
                    bw8.write("By index");
                    boolean     x2  = s.execute("update fweek_questions set Q8='By index' where id="+n+"");
                }else if(th8.isSelected()){
                    bw8.write("By value");
                    boolean     x3  = s.execute("update fweek_questions set Q8='By value' where id="+n+"");
                }
                bw8.close();
                fw8.close();
            }
            boolean done = s.execute("commit");
            s.close();
            c.close();
            new FweekExampage3().setVisible(true);
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

    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(FweekExampage4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FweekExampage4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FweekExampage4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FweekExampage4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FweekExampage4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton f7;
    private javax.swing.JRadioButton f8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton s7;
    private javax.swing.JRadioButton s8;
    private javax.swing.JRadioButton th7;
    private javax.swing.JRadioButton th8;
    // End of variables declaration//GEN-END:variables
}