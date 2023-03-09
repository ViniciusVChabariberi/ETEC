/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lernota; //O package são utilizados pra organizar suas classes
                     // e evitar conflitos de nomes, funciona como se fosse um diretório

import javax.swing.JOptionPane; //importar pacote da biblioteca JOptionPane

/**
 *
 * @author dti
 */
//Criação da classe pública chamada LerNota
public class LerNota {
    //pacote do núcleo de java
    public static void main(String[] args) {
    //Acionamento do método lerNota
        lerNota();
    }
    //método que recebe dos dados digitados pelo usuários
    static void lerNota() {
    //criação das variáveis
        double n1,n2;
        String nome;
    //Recebimento dos dados    
            nome = JOptionPane.showInputDialog(null, "Digite um Nome: ");
                n1= Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a primeira nota: "));
                n2= Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a segunda nota: "));
                JOptionPane.showMessageDialog(null, "Nome do aluno: " + nome);
    // acionamento do método para calcular a média
            calculaMedia(n1, n2);    
    }
    //método para calcular a média do aluno
    private static void calculaMedia(double a1, double a2) {
    //criação de variáveis
        double md;
        md = (a1+a2)/2;
    //estrutura de decisão if e else    
        if (md>=7) {
            JOptionPane.showMessageDialog(null, "Parabéns, você foi aprovado " + md);
        } else
            if (md < 7 && md > 3) {
                JOptionPane.showMessageDialog(null,"Você está de recuperação " + md);
            
        } else 
            if (md < 3) {
                JOptionPane.showMessageDialog(null,"Você foi reprovado " + md);
            }
    }
}
