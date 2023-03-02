/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula02_03;

/**
 *
 * @author dti
 */
//Criação de classe pública chamada "Lampada"
public class Lampada {
    //Criação de uma variável do tipo String 
    private String estadoDaLampada = "apagada";
    //Criação do método acende executara o que está escrito dentro dos colchetes.
    public void acende() {
        estadoDaLampada = "acesa";
    }
    //Criação do método apaga que executara o que está escrito dentro dos colchetes.
    public void apaga() {
        estadoDaLampada = "apagada";
    }
    //Criação do método para mostrar o estado da lampada
    public void mostraEstado() {
    //Estrutura de decisão para definir em qual estado estará a lâmpada através dos métodos.
        if (estadoDaLampada.equals("acesa")){
            System.out.println("Está acesa!");
        } else {
            System.out.println("Está apagada!");
        }
    }
}
