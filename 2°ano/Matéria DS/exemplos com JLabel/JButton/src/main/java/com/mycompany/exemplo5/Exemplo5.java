/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplo5;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author viniv
 */
public class Exemplo5 extends JFrame{
    JButton botao1, botao2, botao3, botao4, botaosair;//variável de instância
    ImageIcon icone;//variavel de instância
    public Exemplo5(){
        super("Exemplo com JButton");
        Container tela = getContentPane();
        setLayout(null);
        icone = new ImageIcon("abrir.gif");
        botao1 = new JButton ("Procurar",icone);
        botao2 = new JButton ("Voltar <<");
        botao3 = new JButton ("Próximo >>");
        botao4 = new JButton ("Abrir");
        botaosair = new JButton ("Sair");
        
        botao1.setBounds(50, 20, 100, 20);
        botao2.setBounds(50, 60, 100, 20);
        botao3.setBounds(50, 100, 100, 20);
        botao4.setBounds(50, 140, 100, 20);
        botaosair.setBounds(50, 180, 100, 20);
        
        botao1.setBackground(Color.black);
        botao2.setBackground(Color.black);
        botao3.setBackground(Color.black);
        botao4.setBackground(Color.black);
        
        botao1.setForeground(Color.white);
        botao2.setForeground(Color.white);
        botao3.setForeground(Color.white);
        botao4.setForeground(Color.white);
        //foco em uma letra
        botao1.setMnemonic(KeyEvent.VK_P);
        botao1.setMnemonic(KeyEvent.VK_V);
        botao1.setMnemonic(KeyEvent.VK_X);
        botao1.setMnemonic(KeyEvent.VK_S);
        //tecla enter pressionada com foco
        getRootPane().setDefaultButton(botao1);
        
        botaosair.addActionListener(
        new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        }
        );
        
        tela.add(botao1);
        tela.add(botao2);
        tela.add(botao3);
        tela.add(botao4);
        tela.add(botaosair);
        setSize(400, 250);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        Exemplo5 app = new Exemplo5();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
