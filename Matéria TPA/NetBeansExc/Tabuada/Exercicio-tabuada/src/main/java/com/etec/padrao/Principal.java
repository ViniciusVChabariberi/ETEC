/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.etec.padrao;
import java.util.Scanner;
/**
 *
 * @author dti
 */
public class Principal 
{
    public static Scanner teclado = new Scanner(System.in);
    
    /**
     *
     */
    public static int numero,result;
    
    public static void main(String[] args)       
    {
      System.out.println("Olá usuário! Seja Bem-Vindo a tabuada automatica");
        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        System.out.println("");
      System.out.println(" Insira um número de um a dez: ");
     
      numero = teclado.nextInt();

     for  (int contador=1; contador<=10; contador++)
     {
         result=contador*numero;
     System.out.println("Tabuada:  "+numero +" x " + contador + " = " +result);
     
     }
     
    
      }
            
      
}


        
   
    

     

     