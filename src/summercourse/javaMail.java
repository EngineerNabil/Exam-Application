/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summercourse;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import oracle.jdbc.OracleDriver;
import summercourse.Week1.Week1Exampage1;

public class javaMail {
    public static void main(String[] args) throws IOException {
                String file      = "ID//login.txt";
                File            f = new File(file);
                FileWriter     fw = new FileWriter(f);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write("1200");
                bw.close();
                fw.close();
                
                
        
    }
    public FileReader fileReader(String file) throws IOException{
                File            f = new File(file);
                FileReader     fr = new FileReader(f);
                return fr; 
    }
    public BufferedReader bufferedReader(FileReader fr) throws IOException{
                BufferedReader br = new BufferedReader(fr);
                return br; 
    }
    
    public FileWriter fileWriter(String file) throws IOException{
                File            f = new File(file);
                FileWriter     fw = new FileWriter(f);
                return fw; 
    }
    public BufferedWriter bufferedWriter(FileWriter fw) throws IOException{
                BufferedWriter bw = new BufferedWriter(fw);
                return bw;
    }
    
    public Connection connect() throws SQLException{
        String url       = "jdbc:oracle:thin:@localhost:1521:xe";
        String username  = "mica";
        String password  = "mica";
        DriverManager.registerDriver(new OracleDriver());
        Connection c = DriverManager.getConnection( url , username, password);
        return c;
    }
    
    
    
    
}
