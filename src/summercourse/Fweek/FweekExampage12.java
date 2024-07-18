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
public class FweekExampage12 extends javax.swing.JFrame {

    /**
     * Creates new form FweekExampage12
     */
    public FweekExampage12() {
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
                ResultSet     rs  = s.executeQuery("Select Q23 , Q24 from fweek_questions where id="+n+"");
                while(rs.next()){
                    String Q23= rs.getString("Q23");
                    String Q24= rs.getString("Q24");
                    if(Q23.equals("exit")){
                        f23.setSelected(true);
                        s23.setSelected(false);
                        th23.setSelected(false);
                }else if (Q23.equals("break")){
                        s23.setSelected(true);
                        f23.setSelected(false);
                        th23.setSelected(false);
                }else if (Q23.equals("return")){
                        th23.setSelected(true);
                        f23.setSelected(false);
                        s23.setSelected(false);
                }
                    if(Q24.equals("and")){
                        f24.setSelected(true);
                        s24.setSelected(false);
                        th24.setSelected(false);
                }else if (Q24.equals("or")){
                        s24.setSelected(true);
                        f24.setSelected(false);
                        th24.setSelected(false);
                }else if (Q24.equals("xor")){
                        th24.setSelected(true);
                        f24.setSelected(false);
                        s24.setSelected(false);
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
        s23 = new javax.swing.JRadioButton();
        th23 = new javax.swing.JRadioButton();
        th24 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        s24 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        f23 = new javax.swing.JRadioButton();
        f24 = new javax.swing.JRadioButton();

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
        jLabel2.setText("23-Which keyword is used to exit a loop prematurely in Python?");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(19, 62, 630, 21);

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        s23.setBackground(new java.awt.Color(250, 250, 250));
        s23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        s23.setForeground(new java.awt.Color(39, 50, 56));
        s23.setText("break");
        s23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s23ActionPerformed(evt);
            }
        });
        jPanel2.add(s23);
        s23.setBounds(20, 90, 70, 23);

        th23.setBackground(new java.awt.Color(250, 250, 250));
        th23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        th23.setForeground(new java.awt.Color(39, 50, 56));
        th23.setText("return");
        th23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                th23ActionPerformed(evt);
            }
        });
        jPanel2.add(th23);
        th23.setBounds(20, 120, 70, 23);

        th24.setBackground(new java.awt.Color(250, 250, 250));
        th24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        th24.setForeground(new java.awt.Color(39, 50, 56));
        th24.setText("xor");
        th24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                th24ActionPerformed(evt);
            }
        });
        jPanel2.add(th24);
        th24.setBounds(20, 300, 110, 23);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(39, 50, 56));
        jLabel3.setText("24-Which Boolean operator returns True if at least one of the operands is True?");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 190, 720, 21);

        s24.setBackground(new java.awt.Color(250, 250, 250));
        s24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        s24.setForeground(new java.awt.Color(39, 50, 56));
        s24.setText("or");
        s24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s24ActionPerformed(evt);
            }
        });
        jPanel2.add(s24);
        s24.setBounds(20, 270, 90, 23);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-back-64.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4);
        jLabel4.setBounds(820, 350, 60, 50);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-back-64__.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 350, 50, 50);

        f23.setBackground(new java.awt.Color(250, 250, 250));
        f23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        f23.setForeground(new java.awt.Color(39, 50, 56));
        f23.setText("exit");
        f23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f23ActionPerformed(evt);
            }
        });
        jPanel2.add(f23);
        f23.setBounds(20, 60, 60, 23);

        f24.setBackground(new java.awt.Color(250, 250, 250));
        f24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        f24.setForeground(new java.awt.Color(39, 50, 56));
        f24.setText("and");
        f24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f24ActionPerformed(evt);
            }
        });
        jPanel2.add(f24);
        f24.setBounds(20, 240, 100, 23);

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

    private void s23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s23ActionPerformed
        s23.setSelected(true);
        f23.setSelected(false);
        th23.setSelected(false);
    }//GEN-LAST:event_s23ActionPerformed

    private void th23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_th23ActionPerformed
        th23.setSelected(true);
        f23.setSelected(false);
        s23.setSelected(false);
    }//GEN-LAST:event_th23ActionPerformed

    private void th24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_th24ActionPerformed
        th24.setSelected(true);
        f24.setSelected(false);
        s24.setSelected(false);
    }//GEN-LAST:event_th24ActionPerformed

    private void s24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s24ActionPerformed
        s24.setSelected(true);
        f24.setSelected(false);
        th24.setSelected(false);
    }//GEN-LAST:event_s24ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        Connection      c = null;
        Statement       s = null;
        try {
            String       file = "ID\\login.txt";
            c = new javaMail().connect();
            s = c.createStatement();
            FileReader fr = new javaMail().fileReader(file);
            BufferedReader br = new javaMail().bufferedReader(fr);
            File           file23 = new File("ID\\Q23.txt");
            FileWriter     fw23 = new FileWriter(file23);
            BufferedWriter bw23 = new BufferedWriter(fw23);
            File           file24 = new File("ID\\Q24.txt");
            FileWriter     fw24 = new FileWriter(file24);
            BufferedWriter bw24 = new BufferedWriter(fw24);
            int number;
            while ((number = fr.read()) != -1) {
                char n=(char)number;
                System.out.println(n);
                if(f23.isSelected()){
                    bw23.write("exit");
                    boolean     x  = s.execute("update fweek_questions set Q23='exit' where id="+n+"");
                    boolean       done = s.execute("commit");
                }else if(s23.isSelected()){
                    bw23.write("break");
                    boolean     x2  = s.execute("update fweek_questions set Q23='break' where id="+n+"");
                    boolean       done = s.execute("commit");
                }else if(th23.isSelected()){
                    bw23.write("return");
                    boolean     x3  = s.execute("update fweek_questions set Q23='return' where id="+n+"");
                    boolean       done = s.execute("commit");
                }
                bw23.close();
                fw23.close();
                if(f24.isSelected()){
                    bw24.write("and");
                    boolean     x  = s.execute("update fweek_questions set Q24='and' where id="+n+"");
                    boolean       done = s.execute("commit");
                }else if(s24.isSelected()){
                    bw24.write("or");
                    boolean     x2  = s.execute("update fweek_questions set Q24='or' where id="+n+"");
                    boolean       done = s.execute("commit");
                }else if(th24.isSelected()){
                    bw24.write("xor");
                    boolean     x3  = s.execute("update fweek_questions set Q24='xor' where id="+n+"");
                    boolean       done = s.execute("commit");
                }
                bw24.close();
                fw24.close();
            }
            boolean done = s.execute("commit");
            s.close();
            c.close();
            new FweekExampage13().setVisible(true);
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

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        Connection      c = null;
        Statement       s = null;
        try {
            String       file = "ID\\login.txt";
            c = new javaMail().connect();
            s = c.createStatement();
            FileReader fr = new javaMail().fileReader(file);
            BufferedReader br = new javaMail().bufferedReader(fr);
            File           file23 = new File("ID\\Q23.txt");
            FileWriter     fw23 = new FileWriter(file23);
            BufferedWriter bw23 = new BufferedWriter(fw23);
            File           file24 = new File("ID\\Q24.txt");
            FileWriter     fw24 = new FileWriter(file24);
            BufferedWriter bw24 = new BufferedWriter(fw24);
            int number;
            while ((number = fr.read()) != -1) {
                char n=(char)number;
                System.out.println(n);
                if(f23.isSelected()){
                    bw23.write("exit");
                    boolean     x  = s.execute("update fweek_questions set Q23='exit' where id="+n+"");
                    boolean       done = s.execute("commit");
                }else if(s23.isSelected()){
                    bw23.write("break");
                    boolean     x2  = s.execute("update fweek_questions set Q23='break' where id="+n+"");
                    boolean       done = s.execute("commit");
                }else if(th23.isSelected()){
                    bw23.write("return");
                    boolean     x3  = s.execute("update fweek_questions set Q23='return' where id="+n+"");
                    boolean       done = s.execute("commit");
                }
                bw23.close();
                fw23.close();
                if(f24.isSelected()){
                    bw24.write("and");
                    boolean     x  = s.execute("update fweek_questions set Q24='and' where id="+n+"");
                    boolean       done = s.execute("commit");
                }else if(s24.isSelected()){
                    bw24.write("or");
                    boolean     x2  = s.execute("update fweek_questions set Q24='or' where id="+n+"");
                    boolean       done = s.execute("commit");
                }else if(th24.isSelected()){
                    bw24.write("xor");
                    boolean     x3  = s.execute("update fweek_questions set Q24='xor' where id="+n+"");
                    boolean       done = s.execute("commit");
                }
                bw24.close();
                fw24.close();
            }
            boolean done = s.execute("commit");
            s.close();
            c.close();
            new FweekExampage11().setVisible(true);
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

    private void f23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f23ActionPerformed
        f23.setSelected(true);
        s23.setSelected(false);
        th23.setSelected(false);
    }//GEN-LAST:event_f23ActionPerformed

    private void f24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f24ActionPerformed
        f24.setSelected(true);
        s24.setSelected(false);
        th24.setSelected(false);
    }//GEN-LAST:event_f24ActionPerformed

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
            java.util.logging.Logger.getLogger(FweekExampage12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FweekExampage12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FweekExampage12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FweekExampage12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FweekExampage12().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JRadioButton f23;
    public javax.swing.JRadioButton f24;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JRadioButton s23;
    public javax.swing.JRadioButton s24;
    public javax.swing.JRadioButton th23;
    public javax.swing.JRadioButton th24;
    // End of variables declaration//GEN-END:variables
}