/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exc1;

/**
 *
 * @author FATEC ZONA LESTE
 */import javax.swing.JOptionPane;
public class Exemplo1 {
      public static void main (String[] args){
          double bs = 0, al = 0, ar = 0;
          bs = Integer.parseInt(JOptionPane.showInputDialog("Digite a base do retângulo:"));
          al = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do retângulo:"));
          ar = (bs * al);
          JOptionPane.showMessageDialog(null, "A área do retângulo é: " + ar);
      }
}
