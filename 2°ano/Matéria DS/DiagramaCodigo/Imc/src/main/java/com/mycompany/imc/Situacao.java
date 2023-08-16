/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.imc;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Situacao {
    private String situacao;
    
    public void verificarSituacao(IMC pessoa){
        pessoa.calcularIMC();
        if(pessoa.getImc() < 18.5){
            JOptionPane.showMessageDialog(null, "Você está abaixo do Peso" + pessoa.getImc());
        }else if(pessoa.getImc() >= 18.5 && pessoa.getImc()<=24.9){
            JOptionPane.showMessageDialog(null, "Você está saudável" + pessoa.getImc());
        }else if(pessoa.getImc() >= 25 && pessoa.getImc() <= 29.9){
            JOptionPane.showMessageDialog(null, "Você está sobrepeso" + pessoa.getImc());
        }else if(pessoa.getImc()>=30 && pessoa.getImc()<=34.9){
            JOptionPane.showMessageDialog(null, "Você está com obesidade grau 1" + pessoa.getImc());
        }else if(pessoa.getImc() > 35){
            JOptionPane.showMessageDialog(null, "Você está com obesidade extrema" + pessoa.getImc());
        }
    }
}