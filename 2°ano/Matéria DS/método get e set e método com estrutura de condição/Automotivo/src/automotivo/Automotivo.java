/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package automotivo;

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
  private Integer ano;
  private String cor;
  
  //método construtor sem parâmetro
  public Automotivo() {
      this("", "", 0, "");
  }
  //
  public Automotivo(String modelo, String marca, Integer ano, String cor){
      
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
    public Integer getAno() {
      return ano;
  }
  //setar o parâmetro ano que anteriormente era privado
  public void setAno(Integer ano) {
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
  //criação do método provarExistencia que obtém os atributos digitados pelo usuário exibe no terminal
  public void provarExistencia() {
      System.out.println("Modelo: " + this.getModelo());
      System.out.println("Marca: " + this.getMarca());
      System.out.println("Ano: " + this.getAno());
      System.out.println("Cor: " + this.getCor());
 //exibição dos métodos digitados pelo usuário     
      JOptionPane.showMessageDialog(null, "Modelo: " + this.getModelo() + "\n Marca: "
      + this.getMarca() + "\n Ano: " + this.getAno() + "\n Cor: " + this.getCor());
  }
  //criação do método entraDados
  //esse método recebe os dados digitados pelos usuários em cada atributo e os torna públicos
  public void entraDados() {
      String modelo = JOptionPane.showInputDialog("Modelo: ");
      setModelo(modelo);
      marca = JOptionPane.showInputDialog("Marca: ");
      setMarca(marca);
      ano = Integer.parseInt(JOptionPane.showInputDialog("Ano: "));
      setAno(ano);
      String cor = JOptionPane.showInputDialog("cor: ");
      setCor(cor);
      
  }
  //pacote do núcleo de java
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
