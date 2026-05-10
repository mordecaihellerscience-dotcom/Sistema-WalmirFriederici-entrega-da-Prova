/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author u07740243132
 */
public class Medico extends Pessoa {
    
    @Override
    public void aniversario(){
        setIdade( getIdade() +2);
    }
    
    
    
    public static void main(String[] args) {
        Medico medico = new Medico();
        medico.aniversario();
    }
    
}
