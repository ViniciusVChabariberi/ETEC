/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lampada; //O package são utilizados pra organizar suas classes
   // e evitar conflitos de nomes, funciona como se fosse um diretório
import javax.swing.JOptionPane; //importar pacote da biblioteca JOptionPane
/**
 *
 * @author Admin
 */
//criação da classe pública lâmpada
public class lâmpada {
    //pacote do núcleo de java
    public static void main(String[] args){
        mostrarEstado();
    }
    //criação do método mostrarEstado
    static void mostrarEstado(){
    //criação da variável inteira estado    
    int estado;
    
    //recebimento dos dados
    estado = Integer.parseInt(JOptionPane.showInputDialog("Digite o estado atual da lâmpada: (digite 1 para ligada e 2 para desligar) "));
    
    //estrutura de decisão if
    if(estado == 1) {
        JOptionPane.showMessageDialog(null, "A lâmpada está ligada!");
    } 
    if(estado == 2){
        JOptionPane.showMessageDialog(null, "A lâmpada está desligada!");
    }
}
}