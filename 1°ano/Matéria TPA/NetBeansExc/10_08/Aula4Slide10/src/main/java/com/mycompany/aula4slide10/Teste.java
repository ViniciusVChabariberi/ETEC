/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula4slide10;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Teste {

    
    public static void main (String[] args) {
        
       String str = "Isto é uma string do Java";
       String xyz = new String ("Isto é uma string do Java");
       if(str==xyz)
           System.out.println("IGUAL");
       else
           System.out.println("DIFERENTE");
       if (str.equals(xyz))
          System.out.println("Tamanho: " + str.length());
          System.out.println("Substring: " + str.substring(0,10));
          System.out.println("Caracter na posição 5:" + str.charAt(5));
       String palavras[]=str.split(" ");
          System.out.println("palavras: " + palavras[0]); 
          System.out.println("palavras: " + palavras[1]);
          System.out.println("palavras: " + palavras[2]);
       int i = str.indexOf("uma");
          System.out.println("Indice: " + i);
       boolean teste = (str.startsWith("Olá")) || str.endsWith("Mundo");
          System.out.println("Resultado: " + teste);
          str=str.trim();
          System.out.println(str);
          str=str.replace('a','@');
          System.out.println(str);
          str=str.replaceAll("string", "Cadeia de caracteres");
          System.out.println(str);
    }
    
}
    

