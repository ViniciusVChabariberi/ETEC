/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testeinstancia; //O package são utilizados pra organizar suas classes
                     // e evitar conflitos de nomes, funciona como se fosse um diretório

import java.text.DecimalFormat; //importar pacote da biblioteca Decimal Format
import java.util.Scanner; //importar pacote da biblioteca util Scanner

/**
 *
 * @author dti
 */
//Criação da variável pública chamada TesteInstancia
public class TesteInstancia {
    //pacote do núcleo de java
    public static void main(String args[]) {
        //método construtor chamado entrada
        Scanner entrada = new Scanner(System.in);
        byte n = 0; //contador de notas
        //criação de varráveis
        double nota, soma = 0;
        double media;
        //recebimento de notas digitadas pelo aluno
        System.out.println("Nota do aluno, -1 termina o programa: ");
        nota = entrada.nextInt();
        
        //estrutura de repetição
        while (nota != -1) {
            soma = soma + nota;
            //método cast
            n = (byte) (n + 1);
            //recebimento de notas digitadas pelo aluno
            System.out.println("Nota do aluno, -1 termina o programa: ");
            nota = entrada.nextInt();
        } //fim da estrutura
        
        //instância para formatação em decimal
        DecimalFormat df = new DecimalFormat("0.00");
        
        //estrutura de condição if e else
        if (n != 0) {
            media = soma / n;
            System.out.println("Media igual a " + df.format(media));
        } else {
            System.out.println("Nenhuma nota foi digitada.");
        }
    }
}
