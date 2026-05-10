/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import java.util.Date;
/**
 *
 * @author u10392310120
 */
public class WhfVendas {
    private int idwhf_Vendas;
    private int whf_cliente;
    private int whf_vendedor;

    public int getIdwhf_Vendas() {
        return idwhf_Vendas;
    }

    public void setIdwhf_Vendas(int idwhf_Vendas) {
        this.idwhf_Vendas = idwhf_Vendas;
    }

    public int getWhf_cliente() {
        return whf_cliente;
    }

    public void setWhf_cliente(int whf_cliente) {
        this.whf_cliente = whf_cliente;
    }

    public int getWhf_vendedor() {
        return whf_vendedor;
    }

    public void setWhf_vendedor(int whf_vendedor) {
        this.whf_vendedor = whf_vendedor;
    }

    public Date getWhf_dataVenda() {
        return whf_dataVenda;
    }

    public void setWhf_dataVenda(Date whf_dataVenda) {
        this.whf_dataVenda = whf_dataVenda;
    }

    public double getWhf_total() {
        return whf_total;
    }

    public void setWhf_total(double whf_total) {
        this.whf_total = whf_total;
    }
    private Date whf_dataVenda;
    private double whf_total;
}
