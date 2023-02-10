/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exc04;

import java.util.Scanner;
/**
 *
 * @author viniv
 */
public class Principal {
    public static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        int soma = 0;
        double num;
        
        System.out.println("Informe um número entre 100 e 200 ou digite 0 para sair: ");
        num = teclado.nextDouble();
        
        while(num != 0){
            if((num >= 100)&&(num<=200)) {
                soma++;
            }
        System.out.println("Informe um número entre 100 e 200 ou digite 0 para sair: ");
        num = teclado.nextDouble();   
            if(num == 0){
                System.out.println("Total: " + soma);
                System.exit(0);
            }
        }
     }
}
