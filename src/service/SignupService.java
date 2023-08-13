/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author Dell
 */
import java.sql.*;
public class SignupService {
    public static Connection cn = null;
    public static Statement st = null;
    public static boolean insert(String firstname,String lastname,String email, String phone,String dob ,String createnpassword,String re_typepassword) {
        try {
            cn = connection.ConnectionDB.getConnection();
            st = cn.createStatement();
            st.executeUpdate("insert into student values( '"+firstname+"','"+lastname+"' , '"+email+"' , '"+phone+"' , '"+dob+"' , '"+createnpassword+"' , '"+re_typepassword+"')");
            return true;
        }catch(SQLException se){
            se.printStackTrace();
        }
        return false;
    
        }
        
    }
            

