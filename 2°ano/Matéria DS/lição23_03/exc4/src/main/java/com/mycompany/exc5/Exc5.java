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
    
                    //pacote do núcleo de java
    public static void main(String[] args) {
        Hipotenusa();
    }
    //criação do método hipotenusa
    static void Hipotenusa() {
        //criação das variáveis decimais
        double hipo, altura, base;
        //recebimento dos dados
        altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a sua altura: "));
        base = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a sua base: "));
        hipo = Math.sqrt(Math.pow(altura, 2) + Math.pow(base, 2));
        //resultado do cálculo
        JOptionPane.showMessageDialog(null, "O resultado da hipotenusa é de: " + hipo);
    }
}
