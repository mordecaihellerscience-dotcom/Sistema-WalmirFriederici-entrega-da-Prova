/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.WhfFornecedores;
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
public class DaoWhfFornecedores extends DaoAbstract {
    
    @Override
    public void insert(Object object) {
        WhfFornecedores whfFornecedores = (WhfFornecedores) object;
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
            pst.setInt(1,whfFornecedores.getIdwhf_Fornecedores());
            pst.setString(2,whfFornecedores.getWhf_razaoSocial());
            pst.setString(3,whfFornecedores.getWhf_nomeFantasia());
            pst.setString(4,whfFornecedores.getWhf_cnpj());
            pst.setString(5,whfFornecedores.getWhf_inscriçaoEstadual());
            pst.setString(6,whfFornecedores.getWhf_email());
            pst.setString(7,whfFornecedores.getWhf_telefone());
            pst.setString(8,whfFornecedores.getWhf_celular());
            pst.setString(9,whfFornecedores.getWhf_cep());
            pst.setString(10,whfFornecedores.getWhf_endereco());
            pst.setString(11,whfFornecedores.getWhf_bairro());
            pst.setString(12,whfFornecedores.getWhf_cidade());
            pst.setString(13,whfFornecedores.getWhf_estado());
            pst.setDate(14, null);
            pst.setString(15,whfFornecedores.getWhf_celular());
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