/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exc2; //O package são utilizados pra organizar suas classes
   // e evitar conflitos de nomes, funciona como se fosse um diretório

import javax.swing.JOptionPane; //importar pacote da biblioteca JOptionPane
/**
 *
 * @author Admin
 */
//criação da classe pública exc2
public class Exc2 {
    
            //pacote do núcleo de java
           public static void main(String[] args) {

               //acionamento do método
               Diferenca();
           }


           static void Diferenca() {

               //criação da variável decimal n1, n2, e dif
               double n1, n2, dif;

               //criação de uma janela gráfica que recebe o valor da variável n1
               n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro valor: "));

               //criação de uma janela gráfica que recebe o valor da variável n2
               n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo valor: "));
               
               //estrutura de decisão if
               if (n1>n2){ 
               dif = n1 - n2;
               JOptionPane.showMessageDialog(null, "A diferença é de:  " + dif);
               }
               
               if(n2>n1) {
               dif = n2 - n1;
               JOptionPane.showMessageDialog(null, "A diferença é de:  " + dif);
               }
             }    
        }
