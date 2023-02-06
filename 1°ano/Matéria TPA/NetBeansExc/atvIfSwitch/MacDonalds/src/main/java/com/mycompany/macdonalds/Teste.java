/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.macdonalds;
import java.util.Scanner;

/**
 *
 * @author valer
 */
public class Teste {
    public static Scanner teclado = new Scanner(System.in);
    public static int escolha;
    
    public static void main(String[] args) {
        System.out.println("Olá usuário! Seja Bem-Vindo ao McDonald's");
        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        System.out.println("Este é nosso cardápio:");
        System.out.println("");
        
        System.out.println("""
                           1-Bigmac 
                           2-Quarteirão 
                           3-McChicken 
                           4-Cheddar McMelt 
                           5-McMax""");
        
        System.out.println("Insira o número do seu pedido:");
        
        escolha = teclado.nextInt();
        
    switch(escolha) {
            case 1:
                System.out.println("O seu pedido foi o Bigmac!");
                break;
            case 2:
                System.out.println("O seu pedido foi o Quarteirão!");
                break;   
            case 3:
                System.out.println("O seu pedido foi o McChicken!");
                break; 
            case 4:
                System.out.println("O seu pedido foi o Cheddar Mcmelt!");
                break;
            case 5:
                System.out.println("O seu pedido foi o McMax!");
                break;

            default:
                System.out.println("A sua escolha está indisponível ou inválida!");
        }
    }
}

