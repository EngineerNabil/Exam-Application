/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summercourse;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class SummerCourse {
    public static void main(String[] args) throws AddressException, MessagingException, UnsupportedEncodingException {
//          try {
//            String file="Week1.py";
//            FileWriter fw = new javaMail().fileWriter(file);
//            BufferedWriter bw = new javaMail().bufferedWriter(fw);
//            bw.write("print(True+True)");
//            bw.close();
//            fw.close();
//        } catch (IOException ex) {
//            Logger.getLogger(SummerCourse.class.getName()).log(Level.SEVERE, null, ex);
//        }
//          
//        try {
//            // Specify the command to execute the Python script.
//            // The 'python3' command assumes Python 3.x is installed.
//            // Adjust it to 'python' or 'python2' if you are using Python 2.x.
//            String[] command = {"python3", "Week1.py"};
//
//            // Create the ProcessBuilder and set the command to execute.
//            ProcessBuilder pb = new ProcessBuilder(command);
//
//            // Redirect the error stream to the standard output stream (optional).
//            pb.redirectErrorStream(true);
//
//            // Start the process.
//            Process process = pb.start();
//
//            // Read the output from the process and display it.
//            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
//            String line;
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//            }
//
//            // Wait for the process to complete.
//            int exitCode = process.waitFor();
//
//            // Handle exit code if needed.
//            if (exitCode == 0) {
//                System.out.println("Python script executed successfully.");
//            } else {
//                System.out.println("Python script execution failed with exit code: " + exitCode);
//            }
//        } catch (IOException e ) {
//            e.printStackTrace();
//        } catch(InterruptedException e){
//            
//        }
//Properties props = new Properties();
//     props.put("mail.smtp.auth", "true");
//     props.put("mail.smtp.starttls.enable", "true");
//     props.put("mail.smtp.host", "smtp.gmail.com");
//     props.put("mail.smtp.port", "587");

//        final String fromEmail = "medo2023mica@gmail.com";//user.getFromEmail(); //requires valid gmail id
//        final String password = "iiulzfizpajartio";//user.getPassword(); // correct password for gmail id
//        final String toEmail = "mica2023mn@gmail.com"; // can be any email id 
//        
//        Properties props = new Properties();
//        props.put("mail.smtp.host", "smtp.gmail.com"); //SMTP Host
//        props.put("mail.smtp.port", "587"); //TLS Port
//        props.put("mail.smtp.auth", "true"); //enable authentication
//        props.put("mail.smtp.starttls.enable", "true"); //enable STARTTLS
//          Session session = Session.getDefaultInstance(props,null);
//          MimeMessage msg = new MimeMessage(session);
//          //set message headers
//          msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
//          msg.addHeader("format", "flowed");
//          msg.addHeader("Content-Transfer-Encoding", "8bit");
//          msg.setFrom(new InternetAddress(fromEmail, "Hassan Hessin"));
//          msg.setReplyTo(InternetAddress.parse(fromEmail, false));
//          msg.setSubject("Week1", "UTF-8");
//          msg.setText("x = 'mohamed' print(x) ", "UTF-8");
//          msg.setSentDate(new Date());
//          msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail, false));
//          System.out.println("Message is ready");
//          Transport trans=session.getTransport("smtp");
//          trans.connect("smtp.gmail.com",fromEmail,password);
//          trans.sendMessage(msg,msg.getAllRecipients());
//          System.out.println("EMail Sent Successfully!!");


try{
        String file       = "ID\\Seif\\Q1.txt";
        FileReader fr     = new javaMail().fileReader(file);
        BufferedReader br = new javaMail().bufferedReader(fr);
        FileWriter fw     = new javaMail().fileWriter(file);
        BufferedWriter bw = new javaMail().bufferedWriter(fw);
        String m=null;
        String Q25 = "l=[1,2,3,4]";
        bw.write(Q25);
        bw.close();
        fw.close();
        br.close();
        fr.close();
}catch(Exception e){
        
}    
    }
        
    
    
//        cz
        
//        Runtime r= Runtime.getRuntime();
//        try{
//           Process p = r.exec("ping 8.8.8.8");
//           if(p.waitFor()==0){
//               System.out.println("Internet Connecting");
//           }else{
//               System.out.println("please connect to internet");
//           }
//        }catch(Exception e){
//            e.printStackTrace();
//        }
        
        
        
        
        
        
        
        
   

}
