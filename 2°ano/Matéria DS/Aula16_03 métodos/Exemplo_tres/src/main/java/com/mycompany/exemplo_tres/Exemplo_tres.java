/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo_tres; //O package são utilizados pra organizar suas classes
   // e evitar conflitos de nomes, funciona como se fosse um diretório

import javax.swing.JOptionPane; //importar pacote da biblioteca JOptionPane
/**
 *
 * @author Admin
 */
//criação da classe pública exemplo_tres
public class Exemplo_tres {
    
     //pacote do núcleo de java
    public static void main(String[] args) {
        //criação da variável inteira idade1 e idade2
        int idade1, idade2;
        //criação da variável String nome1 e nome2
        String nome1, nome2;
        
        //criação de uma janela gráfica que recebe o texto da variável nome1
        nome1 = JOptionPane.showInputDialog("Digite o nome da 1º pessoa: ");
        //criação de uma janela gráfica que recebe o valor da variável idade1
        idade1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da 1º pessoa: "));
        
        //criação de uma janela gráfica que recebe o texto da variável nome1
        nome2 = JOptionPane.showInputDialog("Digite o nome da 2º pessoa: ");
        //criação de uma janela gráfica que recebe o valor da variável idade2
        idade2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da 2º pessoa: "));
        
        //transformando o método PessoaMaisVelha e suas variáveis em texto
        String texto = PessoaMaisVelha(nome1, idade1, nome2, idade2);
        //exibição da variável texto em uma janela gráfica
        JOptionPane.showMessageDialog(null, texto);
    }
    
    //criação do método String PessoaMaisVelha
    static String PessoaMaisVelha(String n1, int id1, String n2, int id2) {
    //estrutura de decisão com if e else
        if(id1 > id2){
            return n1 + " é a pessoa mais velha e tem " + id1 + " anos";
        }else{
            if(id2 > id2) {
                return n2 + " é a pessoa mais velha" + id2 + " anos";
            }else{
                return n1 + " e " + n2 + " tem a mesma idade, sendo " + id1 + " anos";
            }
       }
    }
}
