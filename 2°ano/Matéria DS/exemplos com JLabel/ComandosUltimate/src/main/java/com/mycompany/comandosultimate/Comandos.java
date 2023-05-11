/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.comandosultimate; //Os package são utilizados pra organizar suas classes
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
//Criação de classe pública "" herda funções da classe JFrame
public class Comandos extends JFrame{
    //criação das variaveis de instância herdadas de diversas bibliotecas
    JLabel CEP, TEL, CPF, data, exibir, rotulo;
    JPasswordField caixa;
    JFormattedTextField cep, tel, cpf, DATA;
    MaskFormatter masCEP, masTEL, masCPF, masdata;
    JButton botao, botaosair, somar, mostrar;
    JTextField texto1, texto2;
    ImageIcon iconei;
    
    //criação de um "método" chamado ""
    public Comandos(){
    //Instancia uma cadeia de caracteres á classe super (JFrame)    
    super("");    
    setSize(450 , 250); //Define o tamanho da tela gráfica
    setLocationRelativeTo(null); //centraliza a tela gráfica
    setResizable(false); //Deixa a tela gráfica sem redimensionar
    setExtendedState(MAXIMIZED_BOTH); //maxima a tela gráfica na tela do computador
    setLayout(null); //ele seta a tela como nula, logo forçando a posição dos objetos na tela com o setBounds
    Container tela = getContentPane(); //o objeto "tela" herda propriedades do JFrame pelo método getContentPane
    //pelo método construtor
    
    //Adiciona um Ícone para a tela gráfica por uma imagem já baixada
    ImageIcon icone = new ImageIcon("teste.jpg");
    setIconImage(icone.getImage()); //Recebe a imagem
    
    //seção de atribuição de uma cadeia de caracteres á umas variaveis de instância
    TEL = new JLabel("Nome:");
    CPF = new JLabel("Endereço:");
    CEP = new JLabel("Cidade:");
    data = new JLabel("Estado:");
    data = new JLabel("CEP:");
    TEL = new JLabel("Telefone:");
    iconei = new ImageIcon("abrir.gif");
    botao = new JButton ("Procurar",iconei);
    botaosair = new JButton ("Sair");
    rotulo = new JLabel("Senha: ");
    caixa = new JPasswordField(10);
    exibir = new JLabel("A Senha digitada é: ");
    mostrar = new JButton("Mostrar");
    exibir.setVisible(false);
    
    //foco em uma letra
    botao.setMnemonic(KeyEvent.VK_P);
    
    //tecla enter pressionada com foco
    getRootPane().setDefaultButton(botao);
    
    //ouve e adiciona uma ação a variavel de instancia "botao"
    botao.addActionListener(
                new ActionListener(){
                    // o "e" é do evento click do botão
                    public void actionPerformed(ActionEvent e) {
                        //variáveis do tipo String
                        String Cep, Tel, Cpf, Data;
                        Cep = cep.getText();
                        Tel = tel.getText();
                        Cpf = cpf.getText();
                        Data = DATA.getText();
                        JOptionPane.showMessageDialog(null, "Cep: " + Cep + "\nTelefone: " + Tel + "\nCpf: " + Cpf + "\nData: " + Data);
                    }
                }
        );
    
    //ouve e adiciona uma ação a variavel de instancia "botaosair"
    botaosair.addActionListener(
        //cria um método ActionListener    
        new ActionListener(){
            // o "e" é do evento click do botão
            public void actionPerformed(ActionEvent e){
                System.exit(0); //finaliza o programa
            }
        }
    );
    
    //ouve e adiciona uma ação a variavel de instancia "somar"
        somar.addActionListener(
                //cria um método ActionListener 
                new ActionListener(){
                    // o "e" é do evento click do botão
                    public void actionPerformed(ActionEvent e) {
                        //variáveis do tipo inteiro
                        int numero1, numero2, soma;
                        //inicialização da variável
                        soma = 0;
                        //o objeto numero1 passa a ter um valor de String para Inteiro
                        numero1 = Integer.parseInt(texto1.getText());
                        numero2 = Integer.parseInt(texto2.getText());
                        //atribui a variável soma a junção dos valores das duas variáveis
                        soma = numero1 + numero2;
                        //fica visível, tornando a exibição verdadeira
                        exibir.setVisible(true);
                        //define um texto com o resultado da variável "soma", assim que o botão for clicado
                        exibir.setText("A soma é: " + soma);
                    }
                }
        );
        
        //ouve e adiciona uma ação a variavel de instancia 
        mostrar.addActionListener(
                //cria um método ActionListener 
                new ActionListener(){
                    // o "e" é do evento click do botão
                    public void actionPerformed(ActionEvent e){
                        //cria uma variável String recebe uma senha
                        String senha = new String(caixa.getPassword());
                            exibir.setVisible(true);
                            exibir.setText(senha);
                    }
                }
        );
        
        
        //torna a exibição falsa
        exibir.setVisible(false);
    
    //perfumaria
    CEP.setBackground(new Color(125, 125, 125)); //define uma cor de fundo por RGB
    TEL.setBackground(Color.cyan); //define uma cor predefinida na IDE
    
    //seção para definir a posição das variaveis de instância
    tel.setBounds(60, 15, 160, 20); //coluna, linha, comprimento, altura
    cpf.setBounds(50, 35, 80, 50);
    data.setBounds(50, 55, 80, 60);
    exibir.setBounds(50, 75, 80, 70);
    TEL.setBounds(50, 95, 80, 80);
    cep.setBounds(50, 115, 80, 90);
    botaosair.setBounds(50, 180, 100, 20);
    rotulo.setBounds(50, 20, 100, 20);
    caixa.setBounds(50, 60, 200, 20);
    exibir.setBounds(50, 120, 200, 20);
    mostrar.setBounds(150, 100, 80, 20);
    
    //foco para a caixa de texto
    texto1.requestFocus();
    
    //alinhamento do texto da caixa de texto
    texto1.setHorizontalAlignment(JTextField.LEFT);
    //texto1.setHorizontalAlignment(JTextField.RIGHT);
    //texto1.setHorizontalAlignment(JTextField.CENTER);
    
    //seção para utilizar o método "MaskFormatter" que adiciona uma máscara para a variavel
    //e somente aceita a cadeia de caracteres que se encaixar na maneira predefinida
    try{
            masCEP = new MaskFormatter("#####-###");
            masTEL = new MaskFormatter("(##)#####-####");
            masCPF = new MaskFormatter("#########-##");
            masdata = new MaskFormatter("##/##/####");
            
            masCEP.setPlaceholderCharacter('_');
            masTEL.setPlaceholderCharacter('_');
            masCPF.setPlaceholderCharacter('_');
            masdata.setPlaceholderCharacter('_');
        }
        catch(ParseException excp){
            
        }
        
        cep = new JFormattedTextField(masCEP);
        tel = new JFormattedTextField(masTEL);
        cpf = new JFormattedTextField(masCPF);
        DATA = new JFormattedTextField(masdata);
    
    //seção para definir as cores dos textos das variaveis de instância
    TEL.setForeground(Color.blue);
    CPF.setForeground(Color.black);
    data.setForeground(Color.black);
    CEP.setForeground(Color.black);
    exibir.setForeground(Color.black);
    cep.setForeground(Color.black);
    
    //seção para definir a fonte usada nos textos das variaveis de instância
    CEP.setFont(new Font("Arial", Font.BOLD, 14));
    CPF.setFont(new Font("Arial", Font.BOLD, 14));
    data.setFont(new Font("Arial", Font.BOLD, 14));
    exibir.setFont(new Font("Arial", Font.BOLD, 14));
    TEL.setFont(new Font("Arial", Font.BOLD, 14));
    cep.setFont(new Font("Arial", Font.BOLD, 14));
    
    //setEchoChar('*'); altera a forma de visualização do que for digitado
    //seção para adicionar as variaveis de instância no container chamado "tela"
    tela.add(cpf);
    tela.add(data);
    tela.add(TEL);
    tela.add(exibir);
    tela.add(CEP);
    tela.add(cep);
    tela.add(botaosair);
    setVisible(true); //torna a tela visível
    }
    
    // a variavel máscara não é adicionada a tela.
    
    //Criação da classe principal que executa o método ""
    public static void main(String args[]){
    Comandos app = new Comandos();
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
