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
public class ViewSerivice {
    public static  Connection cn = null;
    public static  Statement st = null;
     public static ResultSet rs = null;
     public static ResultSet ViewStudent ()
     {
         try
         {
             cn = connection.ConnectionDB.getConnection();
             st = cn.createStatement();
             rs = st.executeQuery("select * from student1");
             }catch(SQLException se)
             {
                 se.printStackTrace();
             }
         finally {
            return rs; 
         }
         
     }
    
}
