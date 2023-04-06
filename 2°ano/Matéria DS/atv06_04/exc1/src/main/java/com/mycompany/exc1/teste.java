/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exc1;
import javax.swing.*;
/**
 *
 * @author dti
 */
public class teste extends JFrame {
    public teste() {
    super ("Programação Orientada a Objeto"); //título
    setSize(450 , 250); //tamanho
    setLocationRelativeTo(null); //centraliza
    setResizable(false); //sem redimensionar
    setVisible(true);
    }
    
    public static void main(String args[]) {
        teste app = new teste();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
