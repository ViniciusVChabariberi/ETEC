/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.eteczl.terminal;

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
    
    public static void main(String args[]) {
        
        System.out.println("Olá usuário! Seja Bem-Vindo ao Sistem Cadastro"
                + " da Etec ZL.");
        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        System.out.println("");

        
        try
        {
            System.out.println("Insira seu nome aqui: ");
            
            nome = teclado.nextLine();
            
        } catch (InputMismatchException e1)
        {
            System.out.println("Digite seu nome corretamente, use caracteres! " + e1.getMessage());
            
            System.out.println("Desculpe tente novamente!");
            
            System.exit(0);
            
            
        }
          catch (NullPointerException e2)
        {
            System.out.println("Um erro ocorreu ao digitar o nome [variável nula]: " + e2.getMessage());
            
            System.out.println("Desculpe tente novamente!");
            
            System.exit(0);
            
        }
          
        try 
        {
        System.out.println("Insira sua idade aqui: ");     
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
        System.out.println("Insira sua altura aqui (com vírgula): ");
        altura = teclado.nextFloat();
       
        } catch (InputMismatchException e1)
        {
            System.out.println("Digite sua altura em metros usando o separador como (,); " + e1.getMessage());
            
            System.out.println("Desculpe tente novamente!");
            
            System.exit(0);
        }
          catch (NullPointerException e2)
        {
            System.out.println("Um erro ocorreu ao digitar a altura [variável nula]: " + e2.getMessage());
            
            System.out.println("Desculpe tente novamente!");
            
            System.exit(0);
            
        }
        
        try 
        {
            System.out.println("Você é Paulistano? Digite true para sim e false para não:");
            paulistano = teclado.nextBoolean();
       
        }
             catch (InputMismatchException e1)
            {
            System.out.println("Ocorreu um ao armazenamento se você é Paulistano (tipo de dados) :"+e1.getMessage());
            
            System.out.println("Desculpe tente novamente!");
            
            System.exit(0);
            }
        
        catch (NullPointerException e2)
        {
               System.out.println("Ocorreu um ao armazenamento se você é Paulistano: " +e2.getMessage());
               
               System.out.println("Desculpe tente novamente!");
               
               System.exit(0);
        }
        
        System.out.println("");
        System.out.println("Seus dados: ");
        System.out.println("");
        System.out.println("Seu nome é: " + nome);
        System.out.println("");
        System.out.println("Sua idade é: " + idade);
        System.out.println("");
        System.out.println("Sua altura é: " + altura);
        System.out.println("");
        System.out.println("Você nasceu na capital? " + paulistano);

    }        
    }

