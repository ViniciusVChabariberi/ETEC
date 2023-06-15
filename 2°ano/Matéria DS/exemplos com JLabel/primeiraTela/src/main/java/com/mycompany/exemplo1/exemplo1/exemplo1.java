/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo1.exemplo1;
//importando bibliotecas
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author dti
 */
//criação de classe pública que herda o JFrame
public class exemplo1 extends JFrame  {
        //declaração dos objetos
    JLabel rotulo1,rotulo2,rotulo3,rotulo4;
    public exemplo1(){
        super("Exemplo com Label");
        Container tela = getContentPane();
        setLayout(null);
            //define o nome dos elementos
            rotulo1 = new JLabel("Nome");
            rotulo2 = new JLabel("Idade");
            rotulo3 = new JLabel("Telefone");
            rotulo4 = new JLabel("Celular");
            //define o tamanho e a posição dos elementos
            rotulo1.setBounds(50,20,80,20);
            rotulo2.setBounds(50,60,80,20);
            rotulo3.setBounds(50,100,90,20);
            rotulo4.setBounds(50,140,80,20);
            //define a cor dos elementos
            rotulo1.setForeground(Color.red);
            rotulo2.setForeground(Color.blue);
            rotulo3.setForeground(new Color(190,152,142));
            rotulo4.setForeground(new Color(201,200,100));
            //define a fonte de texto dos elementos
            rotulo1.setFont(new Font("Arial", Font.BOLD, 14));
            rotulo2.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
            rotulo3.setFont(new Font("Courier New", Font.BOLD, 18));
            rotulo4.setFont(new Font("Times New Roman", Font.BOLD, 20));
            //adiciona os elemento para o container
            tela.add(rotulo1);
            tela.add(rotulo2);
            tela.add(rotulo3);
            tela.add(rotulo4);
            //tamanho da janela gráfica
            setSize(400,250);
            setVisible(true);
            setLocationRelativeTo(null);
    }
    public static void main(String args[]){
        exemplo1 app = new exemplo1();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
