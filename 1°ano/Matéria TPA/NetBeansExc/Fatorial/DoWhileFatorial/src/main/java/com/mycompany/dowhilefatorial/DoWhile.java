/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dowhilefatorial;

import java.util.Scanner;

/**
 *
 * @author dti
 */
public class DoWhile {
    public static Scanner teclado = new Scanner(System.in);
    public static int i,fat;  
    public static int num=0;
    public static void main(String args[]) {
        System.out.println("Olá usuário! Seja Bem-Vindo á calculadora"
                + " do número fatorial.");
        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        System.out.println("");
        
        System.out.println("Insira a quantidade á ser calculada: ");
        num = teclado.nextInt();
        //Cálculos
        fat=num;
         i=num-1;
         
      do
      {
       num=num*i;
       i--;
      }   
      while(i>1);
           System.out.println("O fatorial de "+fat+" é: "+num);
       
    }
}
