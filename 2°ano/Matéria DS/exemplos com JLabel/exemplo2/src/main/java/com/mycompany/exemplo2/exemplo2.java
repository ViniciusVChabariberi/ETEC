/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo2;
//importando bibliotecas
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author dti
 */
//criação de classe pública que herda o JFrame
public class exemplo2 extends JFrame {
        //declaração dos objetos
    JLabel Imagem;
    public exemplo2(){
        super("Uso da classe JLabel com Imagem");
        Container tela = getContentPane();
        ImageIcon icone = new ImageIcon("logo_java.jpg");
        Imagem = new JLabel(icone);
        tela.add(Imagem);
        setSize(500, 460);
        setVisible(true);
    }
    public static void main(String args[]){
        exemplo2 app = new exemplo2();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
