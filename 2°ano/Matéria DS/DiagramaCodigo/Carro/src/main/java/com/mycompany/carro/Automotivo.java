/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carro;

import javax.swing.JOptionPane; //importar pacote da biblioteca JOptionPane

/**
 *
 * @author dti
 */
//Criação de classe pública chamada Automotivo
public class Automotivo {
//Criação das variáveis
  private String modelo;
  private String marca;
  private String ano;
  private String cor;
  private String chassi;
  
  //método construtor sem parâmetro
  public Automotivo() {
      this("", "", "", "", "");
  }
  //
  public Automotivo(String modelo, String marca, String ano, String cor, String chassi){
      
  //trás os atributos encapsulados através das variáveis
      this.modelo = modelo;
      this.marca = marca;
      this.ano = ano;
      this.cor = cor;
  }
  //Método de encapsulamento dos atributos pelas variáveis
  
  //captura o atributo modelo
  public String getModelo() {
      return modelo;
  }
  //setar o atributo modelo que anteriormente era privado
  public void setModelo(String modelo) {
      this.modelo = modelo;
  }
  //captura o atributo marca
    public String getMarca() {
      return marca;
  }
  //setar o parâmetro marca que anteriormente era privado
  public void setMarca(String marca) {
      this.marca = marca;
  }
  //captura o atributo ano
    public String getAno() {
      return ano;
  }
  //setar o parâmetro ano que anteriormente era privado
  public void setAno(String ano) {
      this.ano = ano;
  }
  //captura o atributo cor
    public String getCor() {
      return cor;
  }
  //setar o parâmetro cor que anteriormente era privado
  public void setCor(String cor) {
      this.cor = cor;
  }
  
  public String getChassi() {
      return chassi;
  }
  //setar o parâmetro cor que anteriormente era privado
  public void setChassi(String chassi) {
      this.chassi = chassi;
  }
  //criação do método provarExistencia que obtém os atributos digitados pelo usuário e exibe no terminal
  public void provarExistencia() {
      System.out.println("Modelo: " + this.getModelo());
      System.out.println("Marca: " + this.getMarca());
      System.out.println("Ano: " + this.getAno());
      System.out.println("Cor: " + this.getCor());
 //exibição dos métodos digitados pelo usuário     
      JOptionPane.showMessageDialog(null, "Modelo: " + this.getModelo() + "\n Marca: "
      + this.getMarca() + "\n Ano: " + this.getAno() + "\n Cor: " + this.getCor() + "\n Chassi: "
      + this.getChassi());
  }
  //criação do método entraDados
  //esse método recebe os dados digitados pelos usuários em cada atributo e os torna públicos
  public void entraDados() {
      modelo = JOptionPane.showInputDialog("Modelo: ");
      setModelo(modelo);
      marca = JOptionPane.showInputDialog("Marca: ");
      setMarca(marca);
      ano = (JOptionPane.showInputDialog("Ano: "));
      setAno(ano);
      cor = JOptionPane.showInputDialog("cor: ");
      setCor(cor);
      chassi = JOptionPane.showInputDialog("chassi: ");
      setChassi(chassi);
  }
}
