/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.etec.padrao.prj_whiletabuada;
import java.util.Scanner;
/**
 *
 * @author dti
 */
public class While {
    
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
      
        
      int cont = 1;
      
      while(cont <= 10)
      {
        result=numero*cont;
        System.out.println("Tabuada:  "+numero +" x " + cont + " = " +result);
        cont++;
      }
      
      
    
}
}
