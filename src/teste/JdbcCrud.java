/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author u10392310120
 */
public class JdbcCrud {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url= "jdbc:mysql://10.7.0.51:33062/db_walmir_silva";
            user= "walmir_silva";
            password= "walmir_silva";
            Connection cnt;
            cnt=DriverManager.getConnection(url,user,password);
            String sql = "delete from walmir_silva where walmir_silva= ?";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, 507);
            pst.executeUpdate();
                 
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JdbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JdbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
           System.out.println("Conectou");
    }
}
