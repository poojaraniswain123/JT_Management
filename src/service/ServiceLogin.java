/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import java.sql.*;
public class ServiceLogin {
    public static Connection cn = null;
    public static Statement st  = null;
    public static boolean Validuser(String name,String password)
    {
        try
        {
         cn = connection.ConnectionDB.getConnection();
         st = cn.createStatement();
         ResultSet rs = st.executeQuery("select * from student where firstname='"+name+"' and createnpassword = '"+password+"'");
         if (rs.next()) {
             return true;
         }
         else{
             return false;
         }
        }catch(SQLException se)
        {
            se.printStackTrace();
        }
        return false;
    }
}
    
    
