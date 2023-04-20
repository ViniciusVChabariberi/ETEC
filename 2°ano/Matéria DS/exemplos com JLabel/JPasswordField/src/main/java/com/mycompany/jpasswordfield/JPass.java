/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jpasswordfield;
//importando bibliotecas
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author dti
 */
//classe pública herdando JFrame
public class JPass extends JFrame {
    //variaveis de instancia
    JPasswordField caixa;
    JLabel rotulo;
    //método publico com métodos de instância
    public JPass(){
        super("Exemplo com JPasswordField");
        Container tela = getContentPane();
        setLayout(null);
        rotulo = new JLabel("Senha: ");
        caixa = new JPasswordField(10);
        rotulo.setBounds(50, 20, 100, 20);
        caixa.setBounds(50, 60, 100, 20);
        //setForeground
        //setBackground
        //setFont(new Font("Arial",Font.BOLD,20));
        //setEchoChar('*'); altera a forma de visualização do que for digitado
        tela.add(rotulo);
        tela.add(caixa);
        setSize(400, 250);
        setVisible(true);
    }
    //método principal
    public static void main(String args[]){
        JPass app = new JPass();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
