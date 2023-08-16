/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.imc;

/**
 *
 * @author Admin
 */

 public class IMC {
    private double peso;
    private double altura;
    private double imc;
    
    public IMC(){
        this(0);       
    }
    
    public IMC(double peso){
        this.peso = peso;
    }
    
    public double getPeso(){
        return peso;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }
    
    public void calcularIMC(){
        setImc(getPeso() / (getAltura() * getAltura() ));
        getImc();
    }
    
    public void cadastrarDados(double peso, double altura){
        if (peso > 0){
            this.setPeso(this.getPeso());
        }
        if (altura > 0){
            this.setAltura(this.getAltura());
        }
    }
}