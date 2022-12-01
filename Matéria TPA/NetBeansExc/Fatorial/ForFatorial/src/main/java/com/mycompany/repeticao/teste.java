/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repeticao;

import static com.mycompany.repeticao.teste.i;
import static com.mycompany.repeticao.teste.num;
import java.util.Scanner;

/**
 *
 * @author dti
 */
public class teste {
    public static Scanner teclado = new Scanner(System.in);
    public static int i,fat=1;  
    public static int num=0;
    public static void main(String args[]) {
        System.out.println("Olá usuário! Seja Bem-Vindo á calculadora"
                + " do número fatorial.");
        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        System.out.println("");
        
        System.out.println("Insira a quantidade á ser calculada: ");
        num = teclado.nextInt();
        
       for(i=1;i<=num;i++){    
         fat=fat*i;    
         }    
           System.out.println("O fatorial de "+num+" é: "+fat);
       
    }
  
        }  
    
