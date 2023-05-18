/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exc5; //O package são utilizados pra organizar suas classes
   // e evitar conflitos de nomes, funciona como se fosse um diretório

import javax.swing.JOptionPane; //importar pacote da biblioteca JOptionPane

/**
 *
 * @author viniv
 */
//criação da classe pública exc5
public class Exc5 {
    
                    //pacote do núcleo de jav
    public static void main(String[] args) {
        Hipotenusa();
    }
    
    static void Hipotenusa() {
        double hipo, altura, base, res;
        
        altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a sua altura: "));
        base = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a sua base: "));
        hipo = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a hipotenusa: "));

        res = Math.pow(hipo, 2) + Math.pow(altura, 2) + Math.pow(base, 2);
        JOptionPane.showMessageDialog(null, "O resultado da hipotenusa é de: " + res);
    }
}
