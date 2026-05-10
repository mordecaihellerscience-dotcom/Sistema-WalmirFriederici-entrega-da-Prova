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
public class WhfCompras {
    private int idwhf_Compras;
    private int whf_fornecedor;
    private int whf_vendedor;
    private Date whf_dataCompra;
    private double whf_total;

    public int getIdwhf_Compras() {
        return idwhf_Compras;
    }

    public void setIdwhf_Compras(int idwhf_Compras) {
        this.idwhf_Compras = idwhf_Compras;
    }

    public int getWhf_fornecedor() {
        return whf_fornecedor;
    }

    public void setWhf_fornecedor(int whf_fornecedor) {
        this.whf_fornecedor = whf_fornecedor;
    }

    public int getWhf_vendedor() {
        return whf_vendedor;
    }

    public void setWhf_vendedor(int whf_vendedor) {
        this.whf_vendedor = whf_vendedor;
    }

    public Date getWhf_dataCompra() {
        return whf_dataCompra;
    }

    public void setWhf_dataCompra(Date whf_dataCompra) {
        this.whf_dataCompra = whf_dataCompra;
    }

    public double getWhf_total() {
        return whf_total;
    }

    public void setWhf_total(double whf_total) {
        this.whf_total = whf_total;
    }
}
