/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.WhfVendedores;
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
public class DaoWhfVendedores extends DaoAbstract {
    
    @Override
    public void insert(Object object) {
        WhfVendedores whfVendedores = (WhfVendedores) object;
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
            pst.setInt(1, whfVendedores.getIdwhf_Vendedores());
            pst.setString(2, whfVendedores.getWhf_nome());
            pst.setString(3, whfVendedores.getWhf_descricao());
            pst.setString(4, whfVendedores.getWhf_anoOrigem());
            pst.setString(5, whfVendedores.getWhf_categoria());
            pst.setInt(6, whfVendedores.getWhf_quantidade());
            pst.setInt(7, whfVendedores.getWhf_fornecedor());
            pst.setDouble(8, whfVendedores.getWhf_valor());
            pst.setString(9, whfVendedores.getWhf_ativo());
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