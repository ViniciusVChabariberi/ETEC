/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pescador;
import java.util.Scanner;
/**
 *
 * @author valer
 */
public class Teste {
    public static Scanner teclado = new Scanner(System.in);
    public static float kgsmais, quilos, multa;
    
    public static void main(String[] args) {
        System.out.println("Olá usuário! Seja Bem-Vindo á calculadora"
                + " de multa por pesca.");
        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        System.out.println("");
        
        System.out.println("Insira a quantidade de peixes coletados: ");
        quilos = teclado.nextFloat();
        
        if(quilos <= 50) {
            System.out.println("Parabéns, você atingiu a quantidade permitida"
                    + " de peixes, sem cobrança de multa.");
        } else {
            kgsmais = quilos - 50;
            multa = kgsmais*4;
            
            System.out.println("Infelizmente você passou da quantidade "
                   + "permitida de peixes permitida! Sua multa é de: R$" + 
                    multa);
            
        }
    }
}

