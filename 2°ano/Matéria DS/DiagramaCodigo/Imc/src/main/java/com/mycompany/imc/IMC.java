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
    
    public void setSaldo(double peso){
        this.setPeso(peso);
    }
    
    public void entrar(double valor){
        if (valor > 0){
            this.setSaldo(this.getSaldo()+ valor);
        }
    }
    
    public void retirar(double valor){
        if (valor > 0){
            this.setSaldo(this.getSaldo()- valor);
        }
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return the imc
     */
    public double getImc() {
        return imc;
    }

    /**
     * @param imc the imc to set
     */
    public void setImc(double imc) {
        this.imc = imc;
    }
}

