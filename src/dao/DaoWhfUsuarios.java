/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.WhfUsuarios;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import teste.JdbcCrud;

/**
 *
 * @author u10392310120
 */
public class DaoWhfUsuarios extends DaoAbstract {
    
    @Override
    public void insert(Object object) {
        WhfUsuarios whfUsuarios = (WhfUsuarios) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_walmir_silva";
            user = "walmir_silva";
            password = "walmir_silva";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into erp_usuarios values (?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement( sql );
            pst.setInt(1, whfUsuarios.getWhf_idUsuarios());
            pst.setString(2, whfUsuarios.getWhf_nome());
            pst.setString(3, whfUsuarios.getWhf_email());
            pst.setString(4, whfUsuarios.getWhf_cpf());
            pst.setDate(5, null);
            pst.setInt(6, whfUsuarios.getWhf_nivel());
            pst.setString(7, whfUsuarios.getWhf_Senha());
            pst.setString(8, whfUsuarios.getWhf_ativo());
            pst.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JdbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JdbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
   

    @Override
    public Object list(int id) {

        return null;

    }

    @Override
    public Object listAll() {

        return null;

    }
    
 
}