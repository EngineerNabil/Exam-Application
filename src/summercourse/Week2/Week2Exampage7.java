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
public class Week2Exampage7 extends javax.swing.JFrame {

    /**
     * Creates new form Week2Exampage7
     */
    public Week2Exampage7() {
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
                ResultSet     rs  = s.executeQuery("Select Q13 , Q14 from Week2_Questions where id="+n+"");
                while(rs.next()){
                    String Q13= rs.getString("Q13");
                    String Q14= rs.getString("Q14");
                    if(Q13.equals("index()")){
                        f13.setSelected(true);
                        s13.setSelected(false);
                        th13.setSelected(false);
                }else if (Q13.equals("find()")){
                        s13.setSelected(true);
                        f13.setSelected(false);
                        th13.setSelected(false);
                }else if (Q13.equals("search()")){
                        th13.setSelected(true);
                        f13.setSelected(false);
                        s13.setSelected(false);
                }
                    if(Q14.equals("rounds a number upwards to its nearest integer")){
                        f14.setSelected(true);
                        s14.setSelected(false);
                        th14.setSelected(false);
                }else if (Q14.equals("rounds a number downwards to its nearest integer")){
                        s14.setSelected(true);
                        f14.setSelected(false);
                        th14.setSelected(false);
                }else if (Q14.equals("truncate a decimal number to make the number hole")){
                        th14.setSelected(true);
                        f14.setSelected(false);
                        s14.setSelected(false);
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
        th13 = new javax.swing.JRadioButton();
        f13 = new javax.swing.JRadioButton();
        th14 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        f14 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        s13 = new javax.swing.JRadioButton();
        s14 = new javax.swing.JRadioButton();
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

        th13.setBackground(new java.awt.Color(250, 250, 250));
        th13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        th13.setForeground(new java.awt.Color(39, 50, 56));
        th13.setText("search()");
        th13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                th13ActionPerformed(evt);
            }
        });
        jPanel2.add(th13);
        th13.setBounds(20, 150, 120, 20);

        f13.setBackground(new java.awt.Color(250, 250, 250));
        f13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        f13.setForeground(new java.awt.Color(39, 50, 56));
        f13.setText("index()");
        f13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f13ActionPerformed(evt);
            }
        });
        jPanel2.add(f13);
        f13.setBounds(20, 70, 120, 20);

        th14.setBackground(new java.awt.Color(250, 250, 250));
        th14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        th14.setForeground(new java.awt.Color(39, 50, 56));
        th14.setText("truncate a decimal number to make the number hole");
        th14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                th14ActionPerformed(evt);
            }
        });
        jPanel2.add(th14);
        th14.setBounds(20, 320, 340, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(39, 50, 56));
        jLabel3.setText("13-Which of the following methods is used to search for an element in an array? ");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 20, 730, 20);

        f14.setBackground(new java.awt.Color(250, 250, 250));
        f14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        f14.setForeground(new java.awt.Color(39, 50, 56));
        f14.setText("rounds a number upwards to its nearest integer");
        f14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f14ActionPerformed(evt);
            }
        });
        jPanel2.add(f14);
        f14.setBounds(20, 240, 330, 23);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-back-64.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4);
        jLabel4.setBounds(820, 350, 60, 50);

        s13.setBackground(new java.awt.Color(250, 250, 250));
        s13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        s13.setForeground(new java.awt.Color(39, 50, 56));
        s13.setText("find()");
        s13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s13ActionPerformed(evt);
            }
        });
        jPanel2.add(s13);
        s13.setBounds(20, 110, 120, 20);

        s14.setBackground(new java.awt.Color(250, 250, 250));
        s14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        s14.setForeground(new java.awt.Color(39, 50, 56));
        s14.setText("rounds a number downwards to its nearest integer");
        s14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s14ActionPerformed(evt);
            }
        });
        jPanel2.add(s14);
        s14.setBounds(20, 280, 330, 23);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(39, 50, 56));
        jLabel6.setText("14-What did this method do \"math.ceil()\"?");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 200, 480, 21);

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

    private void th13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_th13ActionPerformed
        s13.setSelected(false);
        f13.setSelected(false);
    }//GEN-LAST:event_th13ActionPerformed

    private void f13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f13ActionPerformed
        s13.setSelected(false);
        th13.setSelected(false);
    }//GEN-LAST:event_f13ActionPerformed

    private void th14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_th14ActionPerformed
        s14.setSelected(false);
        f14.setSelected(false);
    }//GEN-LAST:event_th14ActionPerformed

    private void f14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f14ActionPerformed
        s14.setSelected(false);
        th14.setSelected(false);
    }//GEN-LAST:event_f14ActionPerformed

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
            File           file13 = new File("ID\\Q13.txt");
            FileWriter     fw13 = new FileWriter(file13);
            BufferedWriter bw13 = new BufferedWriter(fw13);
            File           file14 = new File("ID\\Q14.txt");
            FileWriter     fw14 = new FileWriter(file14);
            BufferedWriter bw14 = new BufferedWriter(fw14);
            while ((number = fr.read()) != -1) {
                char n=(char)number;
                System.out.println(n);
                if(f13.isSelected()){
                    bw13.write("index()");
                    boolean     x  = s.execute("update WEEK2_QUESTIONS set Q13='index()' where id="+n+"");
                    boolean       done = s.execute("commit");
               }else if(s13.isSelected()){
                    bw13.write("find()");
                    boolean     x2  = s.execute("update WEEK2_QUESTIONS set Q13='find()' where id="+n+"");
                    boolean       done = s.execute("commit");
                }else if(th13.isSelected()){
                    bw13.write("search()");
                    boolean     x3  = s.execute("update WEEK2_QUESTIONS set Q13='search()' where id="+n+"");
                    boolean       done = s.execute("commit");
                }

                if(f14.isSelected()){
                    bw14.write("rounds a number upwards to its nearest integer");
                    boolean     x  = s.execute("update WEEK2_QUESTIONS set Q14='rounds a number upwards to its nearest integer' where id="+n+"");
                    boolean       done = s.execute("commit");
                }else if(s14.isSelected()){
                    bw14.write("rounds a number downwards to its nearest integer");
                    boolean     x2  = s.execute("update WEEK2_QUESTIONS set Q14='rounds a number downwards to its nearest integer' where id="+n+"");
                    boolean       done = s.execute("commit");
                }else if(th14.isSelected()){
                    bw14.write("truncate a decimal number to make the number hole");
                    boolean     x3  = s.execute("update WEEK2_QUESTIONS set Q14='truncate a decimal number to make the number hole' where id="+n+"");
                    boolean       done = s.execute("commit");
                }
            }
            boolean       done = s.execute("commit");
            new Week2Exampage8().setVisible(true);
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

    private void s13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s13ActionPerformed
        f13.setSelected(false);
        th13.setSelected(false);
    }//GEN-LAST:event_s13ActionPerformed

    private void s14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s14ActionPerformed
        f14.setSelected(false);
        th14.setSelected(false);
    }//GEN-LAST:event_s14ActionPerformed

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
            File           file13 = new File("ID\\Q13.txt");
            FileWriter     fw13 = new FileWriter(file13);
            BufferedWriter bw13 = new BufferedWriter(fw13);
            File           file14 = new File("ID\\Q14.txt");
            FileWriter     fw14 = new FileWriter(file14);
            BufferedWriter bw14 = new BufferedWriter(fw14);
            while ((number = fr.read()) != -1) {
                char n=(char)number;
                System.out.println(n);
                if(f13.isSelected()){
                    boolean     x  = s.execute("update WEEK2_QUESTIONS set Q13='index()' where id="+n+"");
                    bw13.write("index()");
                }else if(s13.isSelected()){
                    boolean     x2  = s.execute("update WEEK2_QUESTIONS set Q13='find()' where id="+n+"");
                    bw13.write("find()");
                }else if(th13.isSelected()){
                    boolean     x3  = s.execute("update WEEK2_QUESTIONS set Q13='search()' where id="+n+"");
                    bw13.write("search()");
                }

                if(f14.isSelected()){
                    boolean     x  = s.execute("update WEEK2_QUESTIONS set Q14='rounds a number upwards to its nearest integer' where id="+n+"");
                    bw14.write("rounds a number upwards to its nearest integer");
                }else if(s14.isSelected()){
                    boolean     x2  = s.execute("update WEEK2_QUESTIONS set Q14='rounds a number downwards to its nearest integer' where id="+n+"");
                    bw14.write("rounds a number downwards to its nearest integer");
                }else if(th14.isSelected()){
                    boolean     x3  = s.execute("update WEEK2_QUESTIONS set Q14='truncate a decimal number to make the number hole' where id="+n+"");
                    bw14.write("truncate a decimal number to make the number hole");
                }
            }
            boolean       done = s.execute("commit");
            new Week2Exampage6().setVisible(true);
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
            java.util.logging.Logger.getLogger(Week2Exampage7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Week2Exampage7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Week2Exampage7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Week2Exampage7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Week2Exampage7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton f13;
    private javax.swing.JRadioButton f14;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton s13;
    private javax.swing.JRadioButton s14;
    private javax.swing.JRadioButton th13;
    private javax.swing.JRadioButton th14;
    // End of variables declaration//GEN-END:variables
}
