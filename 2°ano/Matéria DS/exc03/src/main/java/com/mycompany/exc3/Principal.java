/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exc3;

import java.util.Scanner;

/**
 *
 * @author dti
 */
public class Principal {

    /**
     *
     */
    public static Scanner teclado = new Scanner(System.in);  //método scanner
    /**
     *
     * @param args
     */

    
   public static void main(String[] args) {

    int n = 15; //tamanho do vetor
    int v[] = new int[n];  //declarar o vetor
    int i; //declarar um número inteiro
    int soma = 0; //total de números
    
    //método para (for)
       for (i = 0; i < n; i++) {
           System.out.println("Informe o valor do número: "); //gravar
           v[i] = teclado.nextInt(); //ler
           System.out.println(""); //espaço
       }
       
       for(i=0; i<n; i++){
           if(v[i] > 30) //números digitados maiores que 30
           soma = soma + 1; //acresce um no total
       }
       
       for(i=0; i<n; i++){
           if(v[i] > 30)
           System.out.println(v[i] + " <--- maior que 30"); //aponta que o número é maior que 30
       }
       System.out.println("");
       System.out.println("total de números maiores que 30: " + soma);
    }
}


