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

public class Week2Exampage1 extends javax.swing.JFrame {

    /**
     * Creates new form Week2Exampage1
     */
    public Week2Exampage1() {
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
            String Q1= null;
            String Q2= null;            
            while ((number = fr.read()) != -1) {
                char n=(char)number;
                System.out.println(n);
                ResultSet     rs  = s.executeQuery("Select Q1 , Q2 from Week2_Questions where id="+n+"");
                while(rs.next()){
                Q1= rs.getString("Q1");
                Q2= rs.getString("Q2");
                if(Q1.equals("define")){
                        f1.setSelected(true);
                        s1.setSelected(false);
                        th1.setSelected(false);
                }else if (Q1.equals("func")){
                        s1.setSelected(true);
                        f1.setSelected(false);
                        th1.setSelected(false);
                }else if (Q1.equals("def")){
                        th1.setSelected(true);
                        f1.setSelected(false);
                        s1.setSelected(false);
                }      
                if(Q2.equals("To handle exceptions and prevent program crashes")){
                        f2.setSelected(true);
                        s2.setSelected(false);
                        th2.setSelected(false);
                }else if (Q2.equals("To ignore errors and continue program execution")){
                        s2.setSelected(true);
                        f2.setSelected(false);
                        th2.setSelected(false);
                }else if (Q2.equals("To display error messages to the user")){
                        th2.setSelected(true);
                        s2.setSelected(false);
                        f2.setSelected(false);
                }       
                }
            }
            br.close();
            fr.close();
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
        jLabel2.setText("1-Which keyword is used to define a function in Python?");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(19, 62, 680, 21);

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        s1.setBackground(new java.awt.Color(250, 250, 250));
        s1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        s1.setForeground(new java.awt.Color(39, 50, 56));
        s1.setText("func");
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
        th2.setText("To display error messages to the user");
        th2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                th2ActionPerformed(evt);
            }
        });
        jPanel2.add(th2);
        th2.setBounds(20, 320, 270, 23);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(39, 50, 56));
        jLabel3.setText("2-What is the purpose of the try-except block in Python?");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 190, 570, 21);

        f2.setBackground(new java.awt.Color(250, 250, 250));
        f2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        f2.setForeground(new java.awt.Color(39, 50, 56));
        f2.setText("To handle exceptions and prevent program crashes");
        f2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f2ActionPerformed(evt);
            }
        });
        jPanel2.add(f2);
        f2.setBounds(20, 240, 330, 23);

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
        f1.setText("define");
        f1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f1ActionPerformed(evt);
            }
        });
        jPanel2.add(f1);
        f1.setBounds(20, 50, 70, 23);

        th1.setBackground(new java.awt.Color(250, 250, 250));
        th1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        th1.setForeground(new java.awt.Color(39, 50, 56));
        th1.setText("def");
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
        s2.setText("To ignore errors and continue program execution");
        s2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s2ActionPerformed(evt);
            }
        });
        jPanel2.add(s2);
        s2.setBounds(20, 280, 330, 23);

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
            String       file = "ID\\login.txt";
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
                    boolean     x2  = s.execute("update WEEK2_QUESTIONS set Q1='define' where id="+n+"");
                    bw1.write("define");
                }else if(s1.isSelected()){
                    boolean     x2  = s.execute("update WEEK2_QUESTIONS set Q1='func' where id="+n+"");
                    bw1.write("func");
                }else if(th1.isSelected()){
                    boolean     x3  = s.execute("update WEEK2_QUESTIONS set Q1='def' where id="+n+"");
                    bw1.write("def");
                }
                bw1.close();
                fw1.close();
                 
                if(f2.isSelected()){
                    bw2.write("To handle exceptions and prevent program crashes");
                    boolean     x  = s.execute("update WEEK2_QUESTIONS set Q2='To handle exceptions and prevent program crashes' where id="+n+"");
                }else if(s2.isSelected()){
                    bw2.write("To ignore errors and continue program execution");
                    boolean     x2  = s.execute("update WEEK2_QUESTIONS set Q2='To ignore errors and continue program execution' where id="+n+"");
                }else if(th2.isSelected()){
                    bw2.write("To display error messages to the user");
                    boolean     x3  = s.execute("update WEEK2_QUESTIONS set Q2='To display error messages to the user' where id="+n+"");
                }
                bw2.close();
                fw2.close();
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
            java.util.logging.Logger.getLogger(Week2Exampage1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Week2Exampage1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Week2Exampage1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Week2Exampage1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Week2Exampage1().setVisible(true);
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
