/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Dell
 */
public class AddService {
        public static Connection cn = null;
        public static Statement st = null;
        public static boolean addUser(int id ,String Name, String college, String Passout_Year,String Course,String Branch){
        
        
                try{
            cn = connection.ConnectionDB.getConnection();
            st = cn.createStatement();
            st.executeUpdate("insert into student1 values( '"+id+"','"+Name+"','"+college+"','"+Passout_Year+"', '"+Course+"', '"+Branch+"')");
            return true;
                }catch(SQLException se){
              se.printStackTrace();
             }
                return false;
        
        
    }
}
