/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastroaluno;

/**
 *
 * @author dti
 */
public class Aluno {
    
    
    private String nome;
    private int idade;
    private float altura;
    private Boolean paulistano;
    
    public Aluno() {
        System.out.println("Construtor executado");
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
        
    }
    
        public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
        
    }
    
        public float getAltura() {
        return altura;
    }
    
    public void setAltura(float altura) {
        this.altura = altura;
        
    }
    
    public Boolean isPaulistano() {
        return paulistano;
    }
    
    public void setPaulistano(Boolean paulistano) {
        this.paulistano= paulistano;
    }
}


    

