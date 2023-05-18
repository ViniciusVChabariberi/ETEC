/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova;//Os package são utilizados pra organizar suas classes
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
public class Prova extends JFrame{
    //criação das variaveis de instância herdadas de diversas bibliotecas
    JLabel titulo, Nome, CPF, RG, Endereco, Bairro, Cidade, Login, Senha, Telefone, Email, Celular, Estado, CEP;
    JTextField NOME, CPf, Rg, ENDERECO, BAIRRO, CIDADE, LOGIN, SENHA, Tel, mail, Cel, ESTADO, CEp;
    JButton Inserir, Alterar, Excluir, Pesquisar, Fechar;
    //criação de um "método" chamado "Prova"
    public Prova(){
        //Instancia uma cadeia de caracteres á classe super (JFrame)    
        super("Cadastro de Clientes");
        setSize(550, 400); //Define o tamanho da tela gráfica
        setLayout(null); //ele seta a tela como nula, logo forçando a posição dos objetos na tela com o setBounds
        Container tela = getContentPane(); //o objeto "tela" herda propriedades do JFrame pelo método getContentPane
        //pelo método construtor
        
        //seção de atribuição de uma cadeia de caracteres á umas variaveis de instância
        titulo = new JLabel("Cadastro de Clientes");
        Nome = new JLabel ("Nome: ");
        CPF = new JLabel("CPF: ");
        RG = new JLabel("RG: ");
        Endereco = new JLabel("Endereço: ");
        Bairro = new JLabel("Bairro: ");
        Cidade = new JLabel("Cidade: ");
        Login = new JLabel("Login: ");
        Senha = new JLabel("Senha: ");
        Telefone = new JLabel("Telefone: ");
        Email = new JLabel("e-mail: ");
        Celular = new JLabel("Celular: ");
        Estado = new JLabel("Estado: ");
        CEP = new JLabel("CEP: ");
        
        NOME = new JTextField(30);
        CPf = new JTextField(30); 
        Rg = new JTextField(30); 
        ENDERECO = new JTextField(30);
        BAIRRO = new JTextField(30); 
        CIDADE = new JTextField(30);
        LOGIN = new JTextField(30); 
        SENHA = new JTextField(30); 
        Tel = new JTextField(30); 
        mail = new JTextField(30); 
        Cel = new JTextField(30); 
        ESTADO = new JTextField(30); 
        CEp = new JTextField(30);
        
        Inserir = new JButton("Inserir");
        Alterar = new JButton("Alterar");
        Excluir = new JButton("Excluir");
        Pesquisar = new JButton("Pesquisar");
        Fechar = new JButton("Fechar");
        
        //perfumaria
        titulo.setFont(new Font("Arial",Font.BOLD,18));
        tela.setBackground(new Color(212, 207, 201)); //define uma cor de fundo por RGB
        Inserir.setBackground(new Color(212, 207, 201));
        Alterar.setBackground(new Color(212, 207, 201));
        Excluir.setBackground(new Color(212, 207, 201));
        Pesquisar.setBackground(new Color(212, 207, 201));
        Fechar.setBackground(new Color(212, 207, 201));
        
        //seção para definir a posição das variaveis de instância
        titulo.setBounds(200, 15, 200, 20); //coluna, linha, comprimento, altura
        Nome.setBounds(70, 50, 160, 20);
        CPF.setBounds(80, 80, 160, 20);
        Endereco.setBounds(50, 110, 160, 20);
        Bairro.setBounds(70, 140, 160, 20);
        Cidade.setBounds(65, 170, 160, 20);
        Login.setBounds(70, 200, 160, 20);
        Senha.setBounds(70, 230, 160, 20);
        Telefone.setBounds(55, 260, 160, 20);
        Email.setBounds(70, 290, 160, 20);
        Celular.setBounds(270, 260, 160, 20);
        Estado.setBounds(370, 170, 160, 20);
        CEP.setBounds(290, 140, 160, 20);
        RG.setBounds(260, 80, 160, 20);
        
        NOME.setBounds(110, 50, 350, 20);
        CPf.setBounds(110, 80, 140, 20);
        Rg.setBounds(300, 80, 160, 20); 
        ENDERECO.setBounds(110, 110, 350, 20); 
        BAIRRO.setBounds(110, 140, 170, 20);
        CIDADE.setBounds(110, 170, 250, 20);
        LOGIN.setBounds(110, 200, 140, 20); 
        SENHA.setBounds(110, 230, 140, 20);
        Tel.setBounds(110, 260, 160, 20);
        mail.setBounds(110, 290, 350, 20);
        Cel.setBounds(320, 260, 140, 20); 
        ESTADO.setBounds(420, 170, 40, 20);
        CEp.setBounds(330, 140, 130, 20);
        
        Inserir.setBounds(30, 330, 80, 20);
        Alterar.setBounds(130, 330, 80, 20);
        Excluir.setBounds(230, 330, 80, 20);
        Pesquisar.setBounds(330, 330, 100, 20);
        Fechar.setBounds(440, 330, 80, 20);
        
         //seção para adicionar as variaveis de instância no container chamado "tela"
         tela.add(titulo);
         tela.add(Nome);
         tela.add(CPF);
         tela.add(Endereco);
         tela.add(Bairro);
         tela.add(Cidade);
         tela.add(Login);
         tela.add(Senha);
         tela.add(Telefone);
         tela.add(Email);
         tela.add(RG);
         tela.add(CEP);
         tela.add(Estado);
         tela.add(Celular);
         tela.add(NOME);
         tela.add(CPf);
         tela.add(Rg);
         tela.add(ENDERECO);
         tela.add(CIDADE);
         tela.add(LOGIN);
         tela.add(SENHA);
         tela.add(Tel);
         tela.add(mail);
         tela.add(Cel);
         tela.add(ESTADO);
         tela.add(CEp);
         tela.add(BAIRRO);
         tela.add(Alterar);
         tela.add(Inserir);
         tela.add(Excluir);
         tela.add(Pesquisar);
         tela.add(Fechar);
        
         setVisible(true); //torna a tela visível
        }
         //Criação da classe principal que executa o método ""
        public static void main(String args[]){
        Prova app = new Prova();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        
    }
}
