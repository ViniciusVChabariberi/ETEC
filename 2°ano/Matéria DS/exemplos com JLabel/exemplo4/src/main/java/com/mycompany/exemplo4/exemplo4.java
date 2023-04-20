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
    JLabel rotulo1,rotulo2,rotulo3;
    JTextField texto1,texto2,texto3;
    JButton botao1, botao2;
    public exemplo4(){
        super("Exemplo com JTextField");
        Container tela = getContentPane();
        setLayout(null);
            //define o nome dos elementos
            rotulo1 = new JLabel("Nome:");
            rotulo2 = new JLabel("Senha:");
            rotulo3 = new JLabel("Comentário:");
            
            botao1 = new JButton ("OK");
            botao2 = new JButton ("Cancelar");
            //campo de texto
            texto1 = new JTextField(100);
            texto2 = new JTextField(100);
            texto3 = new JTextField(100);
            //define o tamanho e a posição dos elementos
            rotulo1.setBounds(50,20,80,20);
            rotulo2.setBounds(50,70,80,20);
            rotulo3.setBounds(50,120,90,20);

            texto1.setBounds(50,40,400,20);
            texto2.setBounds(50,90,400,20);
            texto3.setBounds(50,140,400,200);
            
            botao1.setBounds(50,180,80,40);
            botao2.setBounds(100,180,150,40);
            //foco para a caixa de texto
            texto1.requestFocus();
            texto2.requestFocus();
            texto3.requestFocus();
            //define a cor dos elementos
            rotulo1.setForeground(Color.black);
            rotulo2.setForeground(Color.black);
            rotulo3.setForeground(Color.black);
            //define a cor do texto da caixa de texto
            texto1.setForeground(Color.black);
            //define a cor de fundo do container
            tela.setBackground(Color.white);
            //define a cor de fundo da caixa de texto
            texto1.setBackground(Color.white);
            //define a fonte do texto
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
            tela.add(rotulo1);
            tela.add(rotulo2);
            tela.add(rotulo3);
            tela.add(texto1);
            tela.add(texto2);
            tela.add(texto3);
            tela.add(botao1);
            tela.add(botao2);
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
