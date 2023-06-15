/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._02;
import javax.swing.JOptionPane;
/**
 *
 * @author dti
 */
public class Principal {
    
    public static void main(String[] args) {
        
      int a = 0, b = 0, c = 0, d = 0, r = 0;
      a = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º número: "));
      b = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º número: "));
      c = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3º número: "));
      d = Integer.parseInt(JOptionPane.showInputDialog("Digite o 4º número: "));
      
      r = (a * b) + (a * c) + (a * d);
      JOptionPane.showMessageDialog(null, "O resultado é: " + r);
    }
    
}
