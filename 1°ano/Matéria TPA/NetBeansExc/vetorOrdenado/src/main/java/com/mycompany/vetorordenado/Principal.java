/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vetorordenado;

/**
 *
 * @author dti
 */
public class Principal {
    public static int vetorNumeros[] = {5 , 9 , 0 , 2 , 7 , 8 , 3 , 6 , 4};
    public static Vetor vet = new Vetor();
    
    public static void main(String[]args)
    {
        System.out.println("Vetores...");
              
        vet.exibirVetor(vetorNumeros);
        
        vet.ordenarVetor(vetorNumeros);
    }
}
