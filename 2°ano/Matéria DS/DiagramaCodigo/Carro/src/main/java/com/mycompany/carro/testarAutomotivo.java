/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carro;

/**
 *
 * @author Admin
 */
public class testarAutomotivo {
      public static void main(String[] args) {
  //Utilizando a classe para o objeto    
      Automotivo auto1;
        //O pacote cria o objeto auto1 através do método construtor Automotivo    
      auto1 = new Automotivo();
  //O objeto é instruído á receber os métodos entraDados e logo após o método provarExistencia
      auto1.entraDados();
      auto1.provarExistencia();
  }
}
