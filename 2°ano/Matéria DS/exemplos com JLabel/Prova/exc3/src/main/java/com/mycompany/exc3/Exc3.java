/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exc3; //O package são utilizados pra organizar suas classes
   // e evitar conflitos de nomes, funciona como se fosse um diretório

import javax.swing.JOptionPane; //importar pacote da biblioteca JOptionPane
/**
 *
 * @author viniv
 */
//criação da classe pública exc3
public class Exc3 {

                //pacote do núcleo de java
    public static void main(String[] args) {
        calcularPesoIdeal();
    }
    
    static void calcularPesoIdeal() {
        double h, PesoIdeal;
        String sexo;

        h = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a sua altura: "));
        sexo = JOptionPane.showInputDialog(null, "Digite seu sexo M/F: ");

        if("M".equals(sexo)) {
            PesoIdeal = (72.7*h) - 58;
            JOptionPane.showMessageDialog(null, "O seu peso ideal é de: " + PesoIdeal);
        }

        if("F".equals(sexo)) {
            PesoIdeal = (62.1*h) - 44.7;
            JOptionPane.showMessageDialog(null, "O seu peso ideal é de: " + PesoIdeal);
        }
    
}
}
