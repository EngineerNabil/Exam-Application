/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summercourse.Week1;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import summercourse.SummerCourse;
import summercourse.javaMail;
public class Week1Exampage14 extends javax.swing.JFrame {

    /**
     * Creates new form Week1Exampage14
     */
    public Week1Exampage14() {
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
                ResultSet     rs  = s.executeQuery("Select Q21 from Week1_Questions where id="+n+"");
                while(rs.next()){
                    String Q21= rs.getString("Q21");  
                    if (Q21.equals("no")){
                    }else{
                      a21.setText(Q21);  
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
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        a21 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        out = new javax.swing.JTextArea();
        note = new javax.swing.JPanel();
        msg = new javax.swing.JLabel();
        runp = new javax.swing.JPanel();
        runl = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(39, 50, 56));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(39, 50, 56), 1, true));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("<<< Problem Solving >>>");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(340, 10, 270, 30);

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(39, 50, 56));
        jLabel3.setText("21-Write a program to count the number of vowels in a given string : \"Iam a programmer\"");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 20, 810, 20);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-back-64__.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 350, 50, 50);

        a21.setBackground(new java.awt.Color(250, 250, 250));
        a21.setColumns(20);
        a21.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        a21.setForeground(new java.awt.Color(39, 50, 56));
        a21.setRows(5);
        a21.setText("                                   write the code here ");
        a21.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(39, 50, 56), new java.awt.Color(39, 50, 56)));
        a21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a21MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(a21);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(30, 60, 490, 270);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-back-64.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4);
        jLabel4.setBounds(810, 350, 60, 50);

        out.setBackground(new java.awt.Color(39, 50, 56));
        out.setColumns(20);
        out.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        out.setForeground(new java.awt.Color(250, 250, 250));
        out.setRows(5);
        out.setText("\n\n\n\n\n  The output of the code will appear here");
        out.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(39, 50, 56), new java.awt.Color(39, 50, 56)));
        out.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                outMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(out);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(530, 60, 350, 270);

        note.setBackground(new java.awt.Color(39, 50, 56));
        note.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(250, 250, 250), null));
        note.setLayout(null);

        msg.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        msg.setForeground(new java.awt.Color(250, 250, 250));
        msg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        msg.setText("Please do not put ' in the code and put \" instead of it");
        note.add(msg);
        msg.setBounds(10, 10, 670, 40);

        jPanel2.add(note);
        note.setBounds(100, 340, 690, 60);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 50, 890, 410);

        runp.setBackground(new java.awt.Color(39, 50, 56));

        runl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        runl.setForeground(new java.awt.Color(250, 250, 250));
        runl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        runl.setText("Run");
        runl.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(250, 250, 250), 1, true));
        runl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                runlMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                runlMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                runlMouseExited(evt);
            }
        });

        javax.swing.GroupLayout runpLayout = new javax.swing.GroupLayout(runp);
        runp.setLayout(runpLayout);
        runpLayout.setHorizontalGroup(
            runpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, runpLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(runl, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        runpLayout.setVerticalGroup(
            runpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, runpLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(runl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(runp);
        runp.setBounds(780, 10, 110, 30);

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(logo);
        logo.setBounds(710, 10, 40, 30);

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

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Connection      c = null;
        Statement       s = null;
        try {
            String       file = "ID\\login.txt";
            c = new javaMail().connect();
            s = c.createStatement();
            FileReader     fr = new javaMail().fileReader(file);
            BufferedReader br = new javaMail().bufferedReader(fr);
            String          t = "'"+a21.getText()+"'";
            int number;
            while ((number = fr.read()) != -1) {
                char n=(char)number;
                System.out.println(n);
                boolean     x  = s.execute("update WEEK1_QUESTIONS set Q21="+t+"where id="+n+"");
                boolean       done = s.execute("commit");
            }
            new Week1Exampage13().setVisible(true);
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

    private void a21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a21MouseClicked
        if(a21.getText().equals("                                   write the code here ")){
            a21.setText("");
        }
    }//GEN-LAST:event_a21MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        Connection      c = null;
        Statement       s = null;
        try {
            String       file = "ID\\login.txt";
            c = new javaMail().connect();
            s = c.createStatement();
            FileReader     fr = new javaMail().fileReader(file);
            BufferedReader br = new javaMail().bufferedReader(fr);
            String          t = "'"+a21.getText()+"'";
            int number;
            while ((number = fr.read()) != -1) {
                char n=(char)number;
                System.out.println(n);
                boolean     x  = s.execute("update WEEK1_QUESTIONS set Q21="+t+"where id="+n+"");
                boolean       done = s.execute("commit");
            }
            new Week1Exampage15().setVisible(true);
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

    private void runlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_runlMouseClicked
        try {
            String file="Week1.py";
            FileWriter fw = new javaMail().fileWriter(file);
            BufferedWriter bw = new javaMail().bufferedWriter(fw);
            bw.write(a21.getText());
            bw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(SummerCourse.class.getName()).log(Level.SEVERE, null, ex);
        }
        out.setText("");
        try {
            
            // Specify the command to execute the Python script.
            // The 'python3' command assumes Python 3.x is installed.
            // Adjust it to 'python' or 'python2' if you are using Python 2.x.
            String[] command = {"python3", "Week1.py"};
            // Create the ProcessBuilder and set the command to execute.
            ProcessBuilder pb = new ProcessBuilder(command);
            // Redirect the error stream to the standard output stream (optional).
            pb.redirectErrorStream(true);
            // Start the process.
            Process process = pb.start();
            // Read the output from the process and display it.
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                out.setText(out.getText()+"\n"+line);
            }
            reader.close();
            process.destroyForcibly();
        } catch (Exception e ) {
            JOptionPane.showMessageDialog(this, "Error in Compiling");
        }
        
    }//GEN-LAST:event_runlMouseClicked

    private void runlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_runlMouseEntered
        runp.setBackground(new Color(250,250,250));
        runl.setForeground(new Color(39,50,56));
        ImageIcon i_mica= new ImageIcon("icons8-play-button-30.png");
        logo.setIcon(i_mica);
    }//GEN-LAST:event_runlMouseEntered

    private void runlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_runlMouseExited
        runp.setBackground(new Color(39,50,56));
        runl.setForeground(new Color(250,250,250));
        logo.setIcon(null);
    }//GEN-LAST:event_runlMouseExited

    private void outMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_outMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_outMouseClicked

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
            java.util.logging.Logger.getLogger(Week1Exampage14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Week1Exampage14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Week1Exampage14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Week1Exampage14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Week1Exampage14().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea a21;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel msg;
    private javax.swing.JPanel note;
    private javax.swing.JTextArea out;
    private javax.swing.JLabel runl;
    private javax.swing.JPanel runp;
    // End of variables declaration//GEN-END:variables
}