/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.WhfComprasAntiguidades;
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
public class DaoWhfComprasAntiguidades extends DaoAbstract {
    
    @Override
    public void insert(Object object) {
        WhfComprasAntiguidades whfComprasAntiguidades = (WhfComprasAntiguidades) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_walmir_silva";
            user = "walmir_silva";
            password = "walmir_silva";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into erp_usuarios values (?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement( sql );
            pst.setInt(1, whfComprasAntiguidades.getIdwhf_Compras_Antiguidades());
            pst.setInt(2,whfComprasAntiguidades.getWhf_compra());
            pst.setInt(3,whfComprasAntiguidades.getWhf_antiguidade());
            pst.setInt(4,whfComprasAntiguidades.getWhf_quantidade());
            pst.setDouble(5, whfComprasAntiguidades.getWhf_valorUnitario());
            pst.setDouble(6, whfComprasAntiguidades.getWhf_subtotal());
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