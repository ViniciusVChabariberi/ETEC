/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vetorbasico;

/**
 *
 * @author dti
 */
public class Principal {
    public static int vetorNumeros[] = new int[5];
    public static Vetor vet = new Vetor();
    
    public static void main(String[]args)
    {
        System.out.println("Vetores...");
        
        vet.inicializarVetor(vetorNumeros);
        
        vet.exibirVetor(vetorNumeros);
    }
}
