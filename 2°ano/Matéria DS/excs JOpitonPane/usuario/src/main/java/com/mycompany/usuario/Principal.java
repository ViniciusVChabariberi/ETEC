/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */
public class Principal {
    public static void main (String[] args) {
        usuario usuario1 = new usuario();
        
        usuario1.provarExistencia();

      usuario1.nome = JOptionPane.showInputDialog("Digite seu nome: ");
      usuario1.login = JOptionPane.showInputDialog("Digite seu login: ");
      usuario1.senha = JOptionPane.showInputDialog("Digite seu senha: ");
      usuario1.email = JOptionPane.showInputDialog("Digite seu email: ");
      JOptionPane.showMessageDialog(null, "Nome: " + usuario1.nome + "\nLogin: " + usuario1.login + "\nSenha: " + usuario1.senha + "\nEmail: " + usuario1.email);
    }
}
