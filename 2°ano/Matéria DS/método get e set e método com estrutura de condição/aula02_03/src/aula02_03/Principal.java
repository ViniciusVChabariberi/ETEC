/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula02_03;

/**
 *
 * @author dti
 */
//criação de classe pública denominada "Principal"
public class Principal {
    //Pacote do núcleo de Java.
    public static void main(String[] args) {
        //Criação e instância do objeto lampada através do método construtor Lampada
        Lampada lampada = new Lampada();
        //instrução que o objeto deve seguir através dos métodos (acende, apaga e mostraEstado)
        lampada.acende();
        lampada.apaga();
        lampada.mostraEstado();
    } //fim do main
} //fim da classe
