/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mediaalunos;
import java.util.Scanner;

/**
 *
 * @author valer
 */
public class Teste {
    public static Scanner teclado = new Scanner(System.in);
    public static float nota1, nota2, nota3, nota4, media;
    
    public static void main(String[] args) {
        System.out.println("Olá usuário! Seja Bem-Vindo ao Programa de cálculo"
                + " de notas!");
        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        System.out.println("");
        
        System.out.println("Insira a sua primeira nota: ");
        nota1 = teclado.nextFloat();
        
        System.out.println("Insira a sua segunda nota: ");
        nota2 = teclado.nextFloat();
        
        System.out.println("Insira a sua terceira nota: ");
        nota3 = teclado.nextFloat();
        
        System.out.println("Insira a sua quarta nota: ");
        nota4 = teclado.nextFloat();
        
        media = (nota1+nota2+nota3+nota4)/4;
        
        System.out.println("Sua média foi: " + media);
        
        if (media >=5) {
            if (media <7) {
                System.out.println("Você foi aprovado com C!");
            } else {
                if (media >=7 && media <9) {
                    System.out.println("você foi aprovado com B!");
                } else {
                    if (media >=9){
                        System.out.println("Você foi aprovado com A!");
                    }
                }
            }
        } else {
            if (media >=2.5 && media <5) {
                System.out.println("Você foi reprovado com D!");
            } else {
                System.out.println("Você foi reprovado com F!");
            }
        }
   }
}
