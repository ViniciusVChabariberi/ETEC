/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ano_nasc;
import javax.swing.JOptionPane;
/**
 *
 * @author dti
 */
public class Principal {
    
    public static void main(String[] args) {
        int anoa = 0, anonasc = 0, idade, idade2050;
        
      anonasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano que você nasceu: "));
      anoa = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));
      idade = anoa - anonasc;
      idade2050 = 2050 - anonasc;
      
      JOptionPane.showMessageDialog(null, "Sua idade é: " + idade);
      JOptionPane.showMessageDialog(null, "Sua idade em 2050 será: " + idade2050);


    }
}
