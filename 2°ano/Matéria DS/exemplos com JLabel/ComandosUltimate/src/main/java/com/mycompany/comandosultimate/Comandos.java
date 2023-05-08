/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.comandosultimate; //Os package são utilizados pra organizar suas classes
// e evitar conflitos de nomes, funciona como se fosse um diretório


//seção de importação de bibliotecas
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;
import javax.swing.text.MaskFormatter;
/**
 *
 * @author dti
 */
//Criação de classe pública "" herda funções da classe JFrame
public class Comandos extends JFrame{
    //crição das variaveis de instância herdadas de diversas bibliotecas
    JLabel CEP, TEL, CPF, data, exibir;
    JFormattedTextField cep, tel, cpf, DATA;
    MaskFormatter masCEP, masTEL, masCPF, masdata;
    JButton botao;
    
    //criação de um "método" chamado ""
    public Comandos(){
    super("");    
    setSize(450 , 250); //Define o tamanho da tela gráfica
    setLocationRelativeTo(null); //centraliza a tela gráfica
    setResizable(false); //Deixa a tela gráfica sem redimensionar
    setVisible(true); //torna a tela visível
    
    //Adiciona um Ícone para a tela gráfica por uma imagem já baixada
    ImageIcon icone = new ImageIcon("teste.jpg");
    setIconImage(icone.getImage()); //Recebe a imagem
    
    Container tela = getContentPane(); //Cria um container chamado "tela"
    //pelo método construtor
    }
    
    //Criação da classe principal que executa o método ""
    public static void main(String args[]){
    Comandos app = new Comandos();
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
