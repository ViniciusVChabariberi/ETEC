/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vetorordenado;


/**
 *
 * @author dti
 */
 class Vetor {
    
    void exibirVetor(int[] _vetor)
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
    
    void ordenarVetor(int[] _vetor)
    {
        int auxiliar = 0;
        
        for (int cont1 = 0 ; cont1 < _vetor.length ; cont1++)
        {
            for (int cont2 = cont1 + 1 ; cont2 < _vetor.length ; cont2++)
            {
                if (_vetor[cont1] > _vetor[cont2])
                {
                    auxiliar = _vetor[cont2];
                    _vetor[cont2] = _vetor[cont1];
                    _vetor[cont1] = auxiliar;
                }
                System.out.println("cont1 = " + cont1 + " / cont2 = " 
                        + cont2 + " / ");
                this.exibirVetor(_vetor);
            }
        }
    }
}
