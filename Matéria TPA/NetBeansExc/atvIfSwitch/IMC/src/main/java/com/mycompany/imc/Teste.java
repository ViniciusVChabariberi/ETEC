/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.imc;
import java.util.Scanner;
/**
 *
 * @author valer
 */
public class Teste {
    public static Scanner teclado = new Scanner(System.in);
    public static float peso,alt,imc;
    
    public static void main(String[] args) {
        System.out.println("Olá usuário! Seja Bem-Vindo á calculadora"
                + " de IMC.");
        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        System.out.println("");
        
        System.out.println("Insira seu peso: ");
        peso = teclado.nextFloat();
        
        System.out.println("Insira sua altura (com vírgula) : ");
        alt = teclado.nextFloat();
        
        imc = peso / (alt*alt);
        
        System.out.println("Seu IMC é: " + imc);
        
        if (imc < 18.5) {
            System.out.println("Seu IMC está abaixo do peso");
        } else {
            if (imc > 18.5 && imc < 24.9) {
                System.out.println("Seu IMC está no peso normal");
            }else {
                        if(imc > 24.9 && imc < 29.9) {
                            System.out.println("Seu IMC está sobre peso");
                        } else {
                            if (imc > 29.9 && imc < 34.9) {
                                System.out.println("Seu IMC está em obesidade"
                                        + " grau I");
                            } else{
                                if(imc > 34.9 && imc < 39.9) {
                                System.out.println("Seu IMC está em obesidade"
                                        + " grau II");
                            } else {
                                    if(imc >= 40) {
                                        System.out.println("Seu IMC está em"
                                                + " obesidade grau III");
                                    }
                                }
                            }
                        }
                        
                        }
            }
        }
    }

