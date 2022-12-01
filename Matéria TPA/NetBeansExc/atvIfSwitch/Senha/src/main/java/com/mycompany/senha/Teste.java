/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.senha;
import java.util.Scanner;
/**
 *
 * @author valer
 */
public class Teste {
    public static Scanner teclado = new Scanner(System.in);
    public static String senha;
    
    public static void main(String[] args) {
        System.out.println("Olá usuário! Seja Bem-Vindo ao validador de senha");
        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        System.out.println("");
        
        System.out.println("Digite sua senha: ");
        senha = teclado.nextLine();
        
        if("carpediem".equals(senha)) {
            System.out.println("Sua senha está correta, olá carpediem!");
        } else {
            System.out.println("Sua senha está incorreta! Tente novamente!");
        }
    }  
}
