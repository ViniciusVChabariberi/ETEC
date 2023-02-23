/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calc;
import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */
public class Principal {
    
        public static void main(String[] args) {
            double x = 0, n = 0, r;
            
            
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de X: "));
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de N: "));
        
        r = Math.pow((x * n), 2);

        JOptionPane.showMessageDialog(null, "O resultado é: " + r);

        

        }

    
}
