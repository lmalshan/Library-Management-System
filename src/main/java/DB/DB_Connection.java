/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Pushpitha Rukshan
 */
public class DB_Connection {
static Connection conn;

    public static Connection main(){
        try{
            String myDriver = "com.mysql.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost:3306/library?zeroDateTimeBehavior=convertToNull";
            Class.forName(myDriver);
            conn = DriverManager.getConnection(myUrl, "root", "");
        }catch(Exception ex){
            System.out.println("Database Connection ERROR");
            System.out.println(ex.getMessage());
        }
        return conn;
    }
    
    public void Insert(String query){
        try{
            String myDriver = "com.mysql.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost:3306/library?zeroDateTimeBehavior=convertToNull";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");
            Statement sttmnt=conn.createStatement();
            sttmnt.executeUpdate(query);
        }catch (Exception ex) { 
            System.out.println(ex.getMessage());  
        }
    }
    
    public ResultSet Select(String query){
        try{
            String myDriver = "com.mysql.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost:3306/sisira_stores_db?zeroDateTimeBehavior=convertToNull";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");
            Statement sttmnt=conn.createStatement();
            ResultSet rs=sttmnt.executeQuery(query);
            return rs;        
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            return null;
        }
    }

    public Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
