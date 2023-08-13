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
public class UpdateService {
    public static Connection cn = null;
    public static Statement st = null;
    public static boolean update(int id,String name, String college, String passout_Year,String course,String branch ){
        
        
                try
                {
            cn = connection.ConnectionDB.getConnection();
            st = cn.createStatement();
            st.executeUpdate("UPDATE  student1 SET name= '"+name+"',college='"+college+"',passout_year='"+passout_Year+"', course='"+course+"',branch= '"+branch+"' WHERE id = '"+id+"'");
            return true;
                }catch(SQLException se){
              se.printStackTrace();
             }
                return false;
    
    }
}
