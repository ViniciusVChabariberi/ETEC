/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastroaluno;

import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */
public class Util {
    
    Aluno aluno = new Aluno();
       public void exibirInformacoes() {
        JOptionPane.showMessageDialog(null, "O nome é: " + aluno.getNome() + "\n"
                + "Sua idade é: " + aluno.getIdade() + "\n"
                + "A altura do aluno é: " + aluno.getAltura());
    }
    
    public void digitarInformacoes() {
        aluno.setNome(JOptionPane.showInputDialog("Digite o nome do aluno: "));
        aluno.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: ")));
        aluno.setAltura(Float.parseFloat(JOptionPane.showInputDialog("Digite sua altura: ")));
    }
}

