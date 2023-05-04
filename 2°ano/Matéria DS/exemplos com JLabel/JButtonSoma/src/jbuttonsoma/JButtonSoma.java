/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jbuttonsoma;
//importação de bibliotecas javax para a aplicação do código
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author dti
 */
public class JButtonSoma extends JFrame {
    //seção de instanciamento de objetos
    JLabel rotulo1, rotulo2, exibir;
    JTextField texto1, texto2;
    JButton somar, subtrair, multiplicar, dividir;
    //classe pública
    public JButtonSoma(){
        //Instancia uma cadeia de caracteres á classe super (JFrame)
        super("Exemplo de soma");
        //Classe construtora
        //o objeto "tela" herda propriedades do JFrame pelo método getContentPane
        Container tela = getContentPane();
        //ele seta a tela como nula, logo forçando a posição dos objetos na tela com o setBounds
        setLayout(null);
        //seção de instanciamento de objetos
        //instancia o objeto rótulo1 e passando uma cadeia de caracteres "número1"
        rotulo1 = new JLabel("1° Número: ");
        rotulo2 = new JLabel("2° Número: ");
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        exibir = new JLabel("");
        somar = new JButton("+");
        subtrair = new JButton("-");
        dividir = new JButton("/");
        multiplicar = new JButton("x");
        
        //seção de instanciamento da posição dos objetos
        rotulo1.setBounds(50, 20, 100, 20); rotulo2.setBounds(50, 60, 100, 20);
        texto1.setBounds(120, 20, 200, 20); texto2.setBounds(120, 60, 200, 20);
        exibir.setBounds(50, 210, 200, 20); somar.setBounds(150, 100, 80, 20);
        subtrair.setBounds(150, 130, 80, 20); dividir.setBounds(150, 160, 80, 20);
        multiplicar.setBounds(150, 190, 80, 20);
        
        //ouve e adiciona uma ação ao objeto "somar"
        somar.addActionListener(
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
                        //setar um texto com o resultado da variável soma, assim que o botão for clicado
                        exibir.setText("A soma é: " + soma);
                    }
                }
        );
        
        subtrair.addActionListener(
                new ActionListener(){
                    // o "e" é do evento click do botão
                    public void actionPerformed(ActionEvent e) {
                        //variáveis do tipo inteiro
                        int numero1, numero2, subtrair;
                        //inicialização da variável
                        subtrair = 0;
                        //o objeto numero1 passa a ter um valor de String para Inteiro
                        numero1 = Integer.parseInt(texto1.getText());
                        numero2 = Integer.parseInt(texto2.getText());
                        //atribui a variável subtrair a junção dos valores das duas variáveis
                        subtrair = numero1 - numero2;
                        //fica visível, tornando a exibição verdadeira
                        exibir.setVisible(true);
                        //setar um texto com o resultado da variável subtrair, assim que o botão for clicado
                        exibir.setText("A subtração é: " + subtrair);
                    }
                }
        );
        
        multiplicar.addActionListener(
                new ActionListener(){
                    // o "e" é do evento click do botão
                    public void actionPerformed(ActionEvent e) {
                        //variáveis do tipo inteiro
                        int numero1, numero2, multiplicar;
                        //inicialização da variável
                        multiplicar = 0;
                        //o objeto numero1 passa a ter um valor de String para Inteiro
                        numero1 = Integer.parseInt(texto1.getText());
                        numero2 = Integer.parseInt(texto2.getText());
                        //atribui a variável multiplicar a junção dos valores das duas variáveis
                        multiplicar = numero1 * numero2;
                        //fica visível, tornando a exibição verdadeira
                        exibir.setVisible(true);
                        //setar um texto com o resultado da variável multiplicar, assim que o botão for clicado
                        exibir.setText("A multiplicação é: " + multiplicar);
                    }
                }
        );
        
        dividir.addActionListener(
                new ActionListener(){
                    // o "e" é do evento click do botão
                    public void actionPerformed(ActionEvent e) {
                        //variáveis do tipo inteiro
                        int numero1, numero2, dividir;
                        //inicialização da variável
                        dividir = 0;
                        //o objeto numero1 passa a ter um valor de String para Inteiro
                        numero1 = Integer.parseInt(texto1.getText());
                        numero2 = Integer.parseInt(texto2.getText());
                        //atribui a variável dividir a junção dos valores das duas variáveis
                        dividir = numero1 / numero2;
                        //fica visível, tornando a exibição verdadeira
                        exibir.setVisible(true);
                        //setar um texto com o resultado da variável dividir, assim que o botão for clicado
                        exibir.setText("A divisão é: " + dividir);
                    }
                }
        );
        
        //torna a exibição falsa
        exibir.setVisible(false);
        
        //seção para adicionar os objetos ao objeto tela
        tela.add(rotulo1); tela.add(rotulo2);
        tela.add(texto1); tela.add(texto2);
        tela.add(exibir); tela.add(somar);
        tela.add(multiplicar); tela.add(dividir);
        tela.add(subtrair);
        //determina o tamanho da janela gráfica
        setSize(400, 300);
        setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JButtonSoma app = new JButtonSoma();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
