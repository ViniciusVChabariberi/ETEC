/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exc2;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author dti
 */
public class teste extends JFrame {
    public teste() {
    super ("Programação Orientada a Objeto"); //título
    setSize(450 , 200); //tamanho
    setLocationRelativeTo(null); //centraliza
    setVisible(true);
    setExtendedState(MAXIMIZED_BOTH); //maxima
    
    ImageIcon icone = new ImageIcon("teste.jpg");
    setIconImage(icone.getImage()); //imagem
    
    Container tela = getContentPane();
    tela.setBackground(new Color(125, 125, 125)); //cor
    }
    
    public static void main(String args[]) {
        teste app = new teste();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
