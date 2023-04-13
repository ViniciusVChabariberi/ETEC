/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo4;
//importando bibliotecas
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author dti
 */
//criação de classe pública que herda o JFrame
public class exemplo4 extends JFrame  {
    //declaração dos objetos
    JLabel titulo,rotulo1,rotulo2,rotulo3;
    JTextField texto1,texto2,texto3;
    public exemplo4(){
        super("Exemplo com JTextField");
        Container tela = getContentPane();
        setLayout(null);
            //define o nome dos elementos
            titulo = new JLabel("Cadastro de Clientes");
            rotulo1 = new JLabel("Nome:");
            rotulo2 = new JLabel("Senha:");
            rotulo3 = new JLabel("Comentário:");
            //campo de texto
            texto1 = new JTextField(100);
            texto2 = new JTextField(30);
            texto3 = new JTextField(10);
            //define o tamanho e a posição dos elementos
            titulo.setBounds(180, 15, 160, 20);
            rotulo1.setBounds(50,50,80,20);
            rotulo2.setBounds(50,100,80,20);
            rotulo3.setBounds(50,150,90,20);

            texto1.setBounds(50,70,200,20);
            texto2.setBounds(50,120,150,20);
            texto3.setBounds(50,170,130,20);
            //foco para a caixa de texto
            texto1.requestFocus();
            texto2.requestFocus();
            texto3.requestFocus();
            //define a cor dos elementos
            titulo.setForeground(Color.red);
            rotulo1.setForeground(Color.black);
            rotulo2.setForeground(Color.black);
            rotulo3.setForeground(Color.black);
            //define a cor do texto da caixa de texto
            texto1.setForeground(Color.black);
            //define a cor de fundo do container
            tela.setBackground(new Color(216,212,196));
            //define a cor de fundo da caixa de texto
            texto1.setBackground(Color.white);
            //define a fonte do texto
            titulo.setFont(new Font("Arial",Font.BOLD,14));
            rotulo1.setFont(new Font("Arial",Font.BOLD,14));
            rotulo2.setFont(new Font("Arial",Font.BOLD,14));
            rotulo3.setFont(new Font("Arial",Font.BOLD,14));
            //define a fonte do texto da caixa de texto
            texto1.setFont(new Font("Arial",Font.BOLD,18));
            //alinhamento do texto da caixa de texto
            texto1.setHorizontalAlignment(JTextField.LEFT);
                //texto1.setHorizontalAlignment(JTextField.RIGHT);
                //texto1.setHorizontalAlignment(JTextField.CENTER);
                
            //adiciona os elemento para o container
            tela.add(titulo);
            tela.add(rotulo1);
            tela.add(rotulo2);
            tela.add(rotulo3);
            tela.add(texto1);
            tela.add(texto2);
            tela.add(texto3);
            //tamanho da janela gráfica
            setSize(500,450);
            setVisible(true);
            setLocationRelativeTo(null);
    }
    public static void main(String args[]){
        exemplo4 app = new exemplo4();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
