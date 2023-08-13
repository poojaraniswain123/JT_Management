/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import java.sql.*;

/**
 *
 * @author Dell
 */
public class ForgetPasswordservice {
     public static Connection cn = null;
     public static Statement st = null;
     public static boolean updatepassword(String firstname, String createnpassword, String re_typepassword){
          try
                {
            cn = connection.ConnectionDB.getConnection();
            st = cn.createStatement();
            st.executeUpdate("UPDATE student SET createnpassword= '"+createnpassword+"',re_typepassword='"+re_typepassword+"' WHERE firstname='"+firstname+"'");
            return true;
                }catch(SQLException se){
              se.printStackTrace();
             }
                return false;
            
     }
     
    
    
}
