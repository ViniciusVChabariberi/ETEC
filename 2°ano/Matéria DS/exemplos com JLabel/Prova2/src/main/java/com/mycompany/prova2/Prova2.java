/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova2;//Os package são utilizados pra organizar suas classes
// e evitar conflitos de nomes, funciona como se fosse um diretório

//seção de importação de bibliotecas para a aplicação do código
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;
import javax.swing.text.MaskFormatter;
/**
 *
 * @author dti
 */
//Criação de classe pública "Prova" herda funções da classe JFrame
public class Prova2 extends JFrame{
    JLabel nome, Matricula, Disciplina, Quantidade, titulo;
    JTextField Nome, matricula, disciplina, quantidade;
    JButton confirma;
    
    public Prova2(){
        super("");
        setSize(400, 380);
        setLayout(null); //ele seta a tela como nula, logo forçando a posição dos objetos na tela com o setBounds
        Container tela = getContentPane(); //o objeto "tela" herda propriedades do JFrame pelo método getContentPane
        //pelo método construtor
        
        //seção de atribuição de uma cadeia de caracteres á umas variaveis de instância
        titulo = new JLabel("Cadastro de Professor");
        nome = new JLabel ("Nome: ");
        Matricula = new JLabel ("Matricula: ");
        Disciplina = new JLabel ("Disciplina: ");
        Quantidade = new JLabel ("Qtd de aulas: ");
        confirma = new JButton("Confirmar Cadastro");
        Nome = new JTextField(30);
        matricula = new JTextField(30);
        disciplina = new JTextField(30);
        quantidade = new JTextField(30);
        
        titulo.setBounds(20, 20, 200, 20);
        nome.setBounds(20, 90, 160, 20);
        Matricula.setBounds(20, 140, 160, 20);
        Disciplina.setBounds(20, 200, 160, 20);
        Quantidade.setBounds(20, 250, 160, 20);
        
        confirma.setBounds(150, 290, 160, 20);
        
        Nome.setBounds(130, 90, 160, 20);
        matricula.setBounds(130, 140, 80, 20);
        disciplina.setBounds(130, 200, 160, 20);
        quantidade.setBounds(130, 250, 80, 20);
        
        titulo.setFont(new Font("Arial",Font.BOLD,18));
        
        confirma.addActionListener(
                new ActionListener(){
                    // o "e" é do evento click do botão
                    public void actionPerformed(ActionEvent e) {
                        //variáveis do tipo inteiro
                        String Cep, Tel, Cpf, Data;
                        //o objeto numero1 passa a ter um valor de String para Inteiro
                        Cep = Nome.getText();
                        Tel = quantidade.getText();
                        Cpf = disciplina.getText();
                        Data = matricula.getText();
                        JOptionPane.showMessageDialog(null, "Nome: " + Cep + "\nMatricula: " + Data + "\nDisciplina: " + Cpf + "\nQuant.: " + Tel);
                    }
                }
        );
                    
        
        tela.add(nome);
        tela.add(Matricula);
        tela.add(Disciplina);
        tela.add(Quantidade);
        tela.add(confirma);
        tela.add(titulo);
        tela.add(Nome);
        tela.add(matricula);
        tela.add(disciplina);
        tela.add(quantidade);
        
        
                
        setVisible(true); //torna a tela visível
        }
         //Criação da classe principal que executa o método ""
        public static void main(String args[]){
        Prova2 app = new Prova2();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        
    
        
    }
}
