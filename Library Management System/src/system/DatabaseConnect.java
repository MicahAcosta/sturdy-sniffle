/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

/**
 *
 * @author dell
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class DatabaseConnect {
    
    Connection conn;
    public static Connection ConnecrDb (){
      try{
           Class.forName("org.sqlite.JDBC");//register the jdbc driver
           Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\dell\\Documents\\NetBeansProjects\\Library Management System\\LibraryNew.sqlite"); 
                   return conn;
      } catch(Exception e){
          JOptionPane.showMessageDialog(null, e);
          return null;
      }
    }
}
