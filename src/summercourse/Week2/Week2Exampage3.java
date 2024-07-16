/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package summercourse.Week2;

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
public class Week2Exampage3 extends javax.swing.JFrame {

    /** Creates new form Week2Exampage3 */
    public Week2Exampage3() {
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
                ResultSet     rs  = s.executeQuery("Select Q5 , Q6 from Week2_Questions where id="+n+"");
                while(rs.next()){
                    String Q5= rs.getString("Q5");
                    String Q6= rs.getString("Q6");
                if(Q5.equals("floor")){
                        f5.setSelected(true);
                        s5.setSelected(false);
                        th5.setSelected(false);
                }else if (Q5.equals("round")){
                        s5.setSelected(true);
                        f5.setSelected(false);
                        th5.setSelected(false);
                }else if (Q5.equals("ceil")){
                        th5.setSelected(true);
                        f5.setSelected(false);
                        s5.setSelected(false);
                }
                    if(Q6.equals("To define the code that will be executed when an exception occurs")){
                        f6.setSelected(true);
                        s6.setSelected(false);
                        th6.setSelected(false);
                }else if (Q6.equals("To handle the exception and prevent program crashes")){
                        s6.setSelected(true);
                        f6.setSelected(false);
                        th6.setSelected(false);
                }else if (Q6.equals("To define the code that will always be executed, whether an exception occurs or not")){
                        th6.setSelected(true);
                        f6.setSelected(false);
                        s6.setSelected(false);
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

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        f5 = new javax.swing.JRadioButton();
        th5 = new javax.swing.JRadioButton();
        th6 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        f6 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        s5 = new javax.swing.JRadioButton();
        s6 = new javax.swing.JRadioButton();
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
        jLabel2.setText("5-Which mathematical function is used to round a floating-point number to the nearest integer?");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(19, 62, 870, 21);

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        f5.setBackground(new java.awt.Color(250, 250, 250));
        f5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        f5.setForeground(new java.awt.Color(39, 50, 56));
        f5.setText("floor");
        f5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f5ActionPerformed(evt);
            }
        });
        jPanel2.add(f5);
        f5.setBounds(20, 70, 70, 23);

        th5.setBackground(new java.awt.Color(250, 250, 250));
        th5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        th5.setForeground(new java.awt.Color(39, 50, 56));
        th5.setText("ceil");
        th5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                th5ActionPerformed(evt);
            }
        });
        jPanel2.add(th5);
        th5.setBounds(20, 150, 70, 23);

        th6.setBackground(new java.awt.Color(250, 250, 250));
        th6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        th6.setForeground(new java.awt.Color(39, 50, 56));
        th6.setText("To define the code that will always be executed, whether an exception occurs or not");
        th6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                th6ActionPerformed(evt);
            }
        });
        jPanel2.add(th6);
        th6.setBounds(20, 320, 530, 23);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(39, 50, 56));
        jLabel3.setText("6-What is the purpose of the 'finally' clause in a try-except block?");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 190, 620, 21);

        f6.setBackground(new java.awt.Color(250, 250, 250));
        f6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        f6.setForeground(new java.awt.Color(39, 50, 56));
        f6.setText("To define the code that will be executed when an exception occurs");
        f6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f6ActionPerformed(evt);
            }
        });
        jPanel2.add(f6);
        f6.setBounds(20, 240, 450, 23);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-back-64.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4);
        jLabel4.setBounds(820, 350, 60, 50);

        s5.setBackground(new java.awt.Color(250, 250, 250));
        s5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        s5.setForeground(new java.awt.Color(39, 50, 56));
        s5.setText("round");
        s5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s5ActionPerformed(evt);
            }
        });
        jPanel2.add(s5);
        s5.setBounds(20, 110, 80, 23);

        s6.setBackground(new java.awt.Color(250, 250, 250));
        s6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        s6.setForeground(new java.awt.Color(39, 50, 56));
        s6.setText("To handle the exception and prevent program crashes");
        s6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s6ActionPerformed(evt);
            }
        });
        jPanel2.add(s6);
        s6.setBounds(20, 280, 360, 23);

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

    private void f5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f5ActionPerformed
        f5.setSelected(true);
        s5.setSelected(false);
        th5.setSelected(false);
    }//GEN-LAST:event_f5ActionPerformed

    private void th5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_th5ActionPerformed
        th5.setSelected(true);
        s5.setSelected(false);
        f5.setSelected(false);
    }//GEN-LAST:event_th5ActionPerformed

    private void th6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_th6ActionPerformed
        th6.setSelected(true);
        s6.setSelected(false);
        f6.setSelected(false);
    }//GEN-LAST:event_th6ActionPerformed

    private void f6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f6ActionPerformed
        f6.setSelected(true);
        s6.setSelected(false);
        th6.setSelected(false);
    }//GEN-LAST:event_f6ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        Connection      c = null;
        Statement       s = null;
        try {
            String       file = "ID\\login.txt";
            c = new javaMail().connect();
            s = c.createStatement();
            FileReader fr = new javaMail().fileReader(file);
            BufferedReader br = new javaMail().bufferedReader(fr);
            File           file5 = new File("ID\\Q5.txt");
            FileWriter     fw5 = new FileWriter(file5);
            BufferedWriter bw5 = new BufferedWriter(fw5);
            File           file6 = new File("ID\\Q6.txt");
            FileWriter     fw6 = new FileWriter(file6);
            BufferedWriter bw6 = new BufferedWriter(fw6);
            int number;
            while ((number = fr.read()) != -1) {
                char n=(char)number;
                System.out.println(n);
                if(f5.isSelected()){
                    bw5.write("floor");
                    boolean     x  = s.execute("update WEEK2_QUESTIONS set Q5='floor' where id="+n+"");
                    boolean       done = s.execute("commit");
                }else if(s5.isSelected()){
                    bw5.write("round");
                    boolean     x2  = s.execute("update WEEK2_QUESTIONS set Q5='round' where id="+n+"");
                    boolean       done = s.execute("commit");
                }else if(th5.isSelected()){
                    bw5.write("ceil");
                    boolean     x3  = s.execute("update WEEK2_QUESTIONS set Q5='ceil' where id="+n+"");
                    boolean       done = s.execute("commit");
                }
                bw5.close();
                fw5.close();
                if(f6.isSelected()){
                    bw6.write("To define the code that will be executed when an exception occurs");
                    boolean     x  = s.execute("update WEEK2_QUESTIONS set Q6='To define the code that will be executed when an exception occurs' where id="+n+"");
                    boolean       done = s.execute("commit");
                }else if(s6.isSelected()){
                    bw6.write("To handle the exception and prevent program crashes");
                    boolean     x2  = s.execute("update WEEK2_QUESTIONS set Q6='To handle the exception and prevent program crashes' where id="+n+"");
                    boolean       done = s.execute("commit");
                }else if(th6.isSelected()){
                    bw6.write("To define the code that will always be executed, whether an exception occurs or not");
                    boolean     x3  = s.execute("update WEEK2_QUESTIONS set Q6='To define the code that will always be executed, whether an exception occurs or not' where id="+n+"");
                    boolean       done = s.execute("commit");
                }
                bw6.close();
                fw6.close();
            }
            boolean done = s.execute("commit");
            new Week2Exampage4().setVisible(true);
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

    private void s5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s5ActionPerformed
        s5.setSelected(true);
        f5.setSelected(false);
        th5.setSelected(false);
    }//GEN-LAST:event_s5ActionPerformed

    private void s6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s6ActionPerformed
        s6.setSelected(true);
        f6.setSelected(false);
        th6.setSelected(false);
    }//GEN-LAST:event_s6ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        Connection      c = null;
        Statement       s = null;
        try {
            String       file = "ID\\login.txt";
            c = new javaMail().connect();
            s = c.createStatement();
            FileReader fr = new javaMail().fileReader(file);
            BufferedReader br = new javaMail().bufferedReader(fr);
            File           file5 = new File("ID\\Q5.txt");
            FileWriter     fw5 = new FileWriter(file5);
            BufferedWriter bw5 = new BufferedWriter(fw5);
            File           file6 = new File("ID\\Q6.txt");
            FileWriter     fw6 = new FileWriter(file6);
            BufferedWriter bw6 = new BufferedWriter(fw6);
            int number;
            while ((number = fr.read()) != -1) {
                char n=(char)number;
                System.out.println(n);
                if(f5.isSelected()){
                    bw5.write("floor");
                    boolean     x  = s.execute("update WEEK2_QUESTIONS set Q5='floor' where id="+n+"");
                    boolean       done = s.execute("commit");
                }else if(s5.isSelected()){
                    bw5.write("round");
                    boolean     x2  = s.execute("update WEEK2_QUESTIONS set Q5='round' where id="+n+"");
                    boolean       done = s.execute("commit");
                }else if(th5.isSelected()){
                    bw5.write("ceil");
                    boolean     x3  = s.execute("update WEEK2_QUESTIONS set Q5='ceil' where id="+n+"");
                    boolean       done = s.execute("commit");
                }
                bw5.close();
                fw5.close();
                if(f6.isSelected()){
                    bw6.write("To define the code that will be executed when an exception occurs");
                    boolean     x  = s.execute("update WEEK2_QUESTIONS set Q6='To define the code that will be executed when an exception occurs' where id="+n+"");
                    boolean       done = s.execute("commit");
                }else if(s6.isSelected()){
                    bw6.write("To handle the exception and prevent program crashes");
                    boolean     x2  = s.execute("update WEEK2_QUESTIONS set Q6='To handle the exception and prevent program crashes' where id="+n+"");
                    boolean       done = s.execute("commit");
                }else if(th6.isSelected()){
                    bw6.write("To define the code that will always be executed, whether an exception occurs or not");
                    boolean     x3  = s.execute("update WEEK2_QUESTIONS set Q6='To define the code that will always be executed, whether an exception occurs or not' where id="+n+"");
                    boolean       done = s.execute("commit");
                }
                bw6.close();
                fw6.close();
            }
            boolean done = s.execute("commit");
            new Week2Exampage2().setVisible(true);
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
            java.util.logging.Logger.getLogger(Week2Exampage3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Week2Exampage3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Week2Exampage3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Week2Exampage3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Week2Exampage3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JRadioButton f5;
    public javax.swing.JRadioButton f6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JRadioButton s5;
    public javax.swing.JRadioButton s6;
    public javax.swing.JRadioButton th5;
    public javax.swing.JRadioButton th6;
    // End of variables declaration//GEN-END:variables

}
