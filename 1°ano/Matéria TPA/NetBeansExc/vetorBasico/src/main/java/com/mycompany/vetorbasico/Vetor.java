/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vetorbasico;

import java.util.Scanner;
/**
 *
 * @author dti
 */
public class Vetor {
    Scanner scanner = new Scanner(System.in);
    
    void inicializarVetor(int _vetor[])
    {
        for (int contador = 0; contador < _vetor.length; contador++)
        {
            System.out.println("Digite um número inteiro para a posição " + 
                    contador + ": ");
            
            _vetor[contador] = scanner.nextInt();
        }
        
        System.out.println("Vetor inicializado...");
     }
    
    void exibirVetor(int _vetor[])
    {
        System.out.println("Vetor = [");
        
        for (int contador = 0; contador < _vetor.length; contador++)
        {
            if (contador == _vetor.length - 1)
            {
                System.out.println(_vetor[contador] + "]\n");
            }
            else
            {
                System.out.println(_vetor[contador] + " , ");
            }
        }
    }
}
