/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eteczl.dia21;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author dti
 */
public class Principal {
    
    public static Scanner teclado = new Scanner(System.in);
    
    public static String nome;
    public static int idade;
    public static float altura;
    public static boolean paulistano;
    
    public static void main(String args []){
        
        System.out.println("Bem vindo ao programa de Cadastro de Dados!");
        System.out.println("Informe seus Dados");
        System.out.println("          ");
        System.out.println("Digite seu nome: ");
        
        nome = teclado.nextLine();

        
        try 
        {
         System.out.println("Digite sua idade: ");
         idade = teclado.nextInt();
         
        }
        
            catch (InputMismatchException e1) 
            {
            System.out.println("Um erro ocorreu ao armazenar a idade (tipo de dados)." +e1.getMessage());
            System.out.println("Desculpe, tente novamente! :(");
            System.exit(0);
            }
        
            catch (NullPointerException e2)
            {
            
            System.out.println("Um erro ocorreu ao armazenar a idade (Variável nula)." +e2.getMessage());
            System.out.println("Desculpe, tente novamente! :(");
            System.exit(0);
            }
        
        try 
        {
            System.out.println("Esta quase acabando, agora digite a sua Altura utilizando a virgula ");     
            altura = teclado.nextFloat();
            System.out.println("");
        }
        
            catch (InputMismatchException e1)
            {
            System.out.println("Um erro ocorreu ao armazenamento a altura (tipo de dados) :"+e1.getMessage());
            System.out.println("Tente novamente");
            System.exit(0);
            }
            catch (NullPointerException e2)
            {
               System.out.println("Um erro ocorreu ao armazenamento a altura (varial nula) : " +e2.getMessage());
               System.out.println("Tente novamente");
               System.exit(0);
            }
        
      
        try 
        {
            System.out.println("E por ultimo, você é paulistano? Digite true para sim e false para não ");      
            paulistano = teclado.nextBoolean();
            System.out.println("");
            System.out.println("");
       
        }
             catch (InputMismatchException e1)
            {
            System.out.println("Um erro ocorreu ao armazenamento se você é Paulistano (tipo de dados) :"+e1.getMessage());
            System.out.println("Tente novamente");
            System.exit(0);
            }
        
        catch (NullPointerException e2)
        {
               System.out.println("Um erro ocorreu ao armazenamento se você é Paulistano (varial nula) : " +e2.getMessage());
               System.out.println("Tente novamente");
               System.exit(0);
        }
                
        System.out.println("");     
        System.out.println("Dados:");
        System.out.println("");
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
        System.out.println("Altura: "+ altura);
        System.out.println("Paulistano: "+ paulistano);
    }
    
}
