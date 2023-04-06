/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exc3;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author dti
 */
public class teste extends JFrame {
    JLabel titulo, nome, endereco, cidade, estado, cep, telefone;
    public teste() {
    super ("Programação Orientada a Objeto"); //título
    setSize(250 , 250); //tamanho
    setLocationRelativeTo(null); //centraliza
    setResizable(false); //sem redimensionar
    setLayout(null);
    
    ImageIcon icone = new ImageIcon("teste.jpg");
    setIconImage(icone.getImage()); //imagem
    
    Container tela = getContentPane();
    tela.setBackground(Color.cyan);
    
    titulo = new JLabel("Cadastro de Clientes");
    nome = new JLabel("Nome:");
    endereco = new JLabel("Endereço:");
    cidade = new JLabel("Cidade:");
    estado = new JLabel("Estado:");
    cep = new JLabel("CEP:");
    telefone = new JLabel("Telefone:");
    
    titulo.setBounds(60, 15, 160, 20); //coluna, linha, comprimento, altura
    nome.setBounds(50, 35, 80, 50);
    endereco.setBounds(50, 55, 80, 60);
    cidade.setBounds(50, 75, 80, 70);
    estado.setBounds(50, 95, 80, 80);
    cep.setBounds(50, 115, 80, 90);
    telefone.setBounds(50, 135, 80, 100);
    
    titulo.setForeground(Color.blue);
    nome.setForeground(Color.black);
    endereco.setForeground(Color.black);
    cidade.setForeground(Color.black);
    estado.setForeground(Color.black);
    cep.setForeground(Color.black);
    telefone.setForeground(Color.black);
    
    titulo.setFont(new Font("Arial", Font.BOLD, 14));
    nome.setFont(new Font("Arial", Font.BOLD, 14));
    endereco.setFont(new Font("Arial", Font.BOLD, 14));
    cidade.setFont(new Font("Arial", Font.BOLD, 14));
    estado.setFont(new Font("Arial", Font.BOLD, 14));
    cep.setFont(new Font("Arial", Font.BOLD, 14));
    telefone.setFont(new Font("Arial", Font.BOLD, 14));
    
    tela.add(titulo);
    tela.add(nome);
    tela.add(endereco);
    tela.add(cidade);
    tela.add(estado);
    tela.add(cep);
    tela.add(telefone);
    setVisible(true);

    }
    
    public static void main(String args[]) {
        teste app = new teste();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}