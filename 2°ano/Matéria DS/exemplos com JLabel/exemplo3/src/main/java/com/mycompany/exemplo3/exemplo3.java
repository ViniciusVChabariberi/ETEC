/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo3;
//importando bibliotecas
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author dti
 */
//criação de classe pública que herda o JFrame
public class exemplo3 extends JFrame  {
    //declaração dos objetos
    JLabel titulo,rotulo1,rotulo2,rotulo3,rotulo4,rotulo5,rotulo6,rotulo7;
    JTextField texto1,texto2,texto3,texto4,texto5,texto6,texto7;
    public exemplo3(){
        super("Exemplo com JTextField");
        Container tela = getContentPane();
        setLayout(null);
            //define o nome dos elementos
            titulo = new JLabel("Cadastro de Clientes");
            rotulo1 = new JLabel("Nome:");
            rotulo2 = new JLabel("CPF:");
            rotulo3 = new JLabel("RG:");
            rotulo4 = new JLabel("Endereço:");
            rotulo5 = new JLabel("Cidade:");
            rotulo6 = new JLabel("Estado:");
            rotulo7 = new JLabel("CEP:");
            //campo de texto
            texto1 = new JTextField(100);
            texto2 = new JTextField(30);
            texto3 = new JTextField(10);
            texto4 = new JTextField(10);
            texto5 = new JTextField(10);
            texto6 = new JTextField(10);
            texto7 = new JTextField(10);
            //define o tamanho e a posição dos elementos
            titulo.setBounds(180, 15, 160, 20);
            rotulo1.setBounds(50,50,80,20);
            rotulo2.setBounds(50,100,80,20);
            rotulo3.setBounds(50,150,90,20);
            rotulo4.setBounds(50,200,80,20);
            rotulo5.setBounds(50,250,80,20);
            rotulo6.setBounds(50,300,80,20);
            rotulo7.setBounds(50,350,80,20);

            texto1.setBounds(50,70,200,20);
            texto2.setBounds(50,120,150,20);
            texto3.setBounds(50,170,130,20);
            texto4.setBounds(50,220,200,20);
            texto5.setBounds(50,270,180,20);
            texto6.setBounds(50,320,160,20);
            texto7.setBounds(50,370,140,20);
            //foco para a caixa de texto
            texto1.requestFocus();
            texto2.requestFocus();
            texto3.requestFocus();
            texto4.requestFocus();
            texto5.requestFocus();
            texto6.requestFocus();
            texto7.requestFocus();
            //define a cor dos elementos
            titulo.setForeground(Color.red);
            rotulo1.setForeground(Color.black);
            rotulo2.setForeground(Color.black);
            rotulo3.setForeground(Color.black);
            rotulo4.setForeground(Color.black);    
            rotulo5.setForeground(Color.black);
            rotulo6.setForeground(Color.black);
            rotulo7.setForeground(Color.black);
            //define a cor do texto da caixa de texto
            texto1.setForeground(Color.black);
            //define a cor de fundo do container
            tela.setBackground(new Color(216,212,196));
            //define a cor de fundo da caixa de texto
            texto1.setBackground(Color.white);
            //define a fonte do texto
            titulo.setFont(new Font("Arial",Font.BOLD,14));
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
            tela.add(rotulo4);
            tela.add(rotulo5);
            tela.add(rotulo6);
            tela.add(rotulo7);
            tela.add(texto1);
            tela.add(texto2);
            tela.add(texto3);
            tela.add(texto4);
            tela.add(texto5);
            tela.add(texto6);
            tela.add(texto7);
            //tamanho da janela gráfica
            setSize(500,450);
            setVisible(true);
            setLocationRelativeTo(null);
    }
    public static void main(String args[]){
        exemplo3 app = new exemplo3();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
