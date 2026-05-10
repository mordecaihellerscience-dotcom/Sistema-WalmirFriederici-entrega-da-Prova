/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.WhfClientes;
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
public class DaoWhfClientes extends DaoAbstract {
    
    @Override
    public void insert(Object object) {
        WhfClientes whfClientes = (WhfClientes) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_walmir_silva";
            user = "walmir_silva";
            password = "walmir_silva";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into erp_usuarios values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement( sql );
            pst.setInt(1,whfClientes.getIdwhf_Clientes());
            pst.setString(2,whfClientes.getWhf_nome());
            pst.setString(3,whfClientes.getWhf_cpf());
            pst.setString(4,whfClientes.getWhf_rg());
            pst.setDate(5,null);
            pst.setString(6,whfClientes.getWhf_sexo());
            pst.setString(7,whfClientes.getWhf_email());
            pst.setString(8,whfClientes.getWhf_telefone());
            pst.setString(9,whfClientes.getWhf_celular());
            pst.setString(10,whfClientes.getWhf_cep());
            pst.setString(11,whfClientes.getWhf_endereco());
            pst.setString(12,whfClientes.getWhf_bairro());
            pst.setString(13,whfClientes.getWhf_cidade());
            pst.setString(14,whfClientes.getWhf_estado());
            pst.setString(15,whfClientes.getWhf_ativo());
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