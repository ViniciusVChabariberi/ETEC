/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exc04;
import javax.swing.JOptionPane;
/**
 *
 * @author dti
 */
public class teste {
    private String marc, model, co, plac;
    public teste() {
        this("", "", "", "");
    }
    
    public teste(String marca, String modelo, String cor, String placa){
        this.marc = marca;
        this.model = modelo;
        this.co = cor;
        this.plac = placa;
    }
    
    public void ligar(){
        JOptionPane.showMessageDialog(null, "O carro ligou");
    }
    
    public void desligar(){
        JOptionPane.showMessageDialog(null, "O carro desligou");
    }
    
    public void acelerar(){
        JOptionPane.showMessageDialog(null, "Acelerou");
    }
    
    public void frear(){
        JOptionPane.showMessageDialog(null, "O carro freou");
    }
}
