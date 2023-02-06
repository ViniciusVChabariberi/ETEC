/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.equacao2grau;

/**
 *
 * @author dti
 */
 import java.util.Scanner;

public class Teste {
    public static Scanner teclado = new Scanner(System.in);
    public static float a, b, c; 
    public static double delta, x1, x2;
    
      public static void main (String[] args){

        System.out.println("Olá usuário! Seja Bem-Vindo á calculadora"
                + " de equação do segundo grau.");
        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        System.out.println("");
        
        System.out.println("Insira o primeiro número aqui: ");
        a = teclado.nextFloat();
        Math.pow(a, 2);
        System.out.println("Insira o segundo número aqui: ");
        b = teclado.nextFloat();
        
        System.out.println("Insira o terceiro número aqui: ");
        c = teclado.nextFloat();
        
        delta = Math.pow(b,2) - (4*a*c); 
        
        if(delta > 0){
        System.out.println("Existem duas raízes na equação");
        x1 = ((-b + Math.sqrt(delta)) / (2*a));        
        x2 = ((-b - Math.sqrt(delta)) / (2*a));
        System.out.println("O seu x1 é: " + x1);
        System.out.println("O seu x2 é: " + x2);
        System.out.println("O seu delta é: " + delta);        
        }
        else 
            if(delta<0){
            System.out.println("Valores reais inexistêntes.");
            
        }else{
                if(delta == 0){
                        System.out.println("O seu delta é: " + delta);
                        System.out.println("O seu delta é 0 então suas raízes"
                                + " são idênticas");
                        x1 = ((-b + Math.sqrt(delta)) / (2*a));
                        System.out.println("A sua raíz é: " + x1);
                }
                    
                }
        if(a == 0)
              System.out.println("O valor A é igual a 0, então a sua equação"
                      + " é do primeiro grau");
            }
        
        
      }

