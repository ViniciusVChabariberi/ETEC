/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.media_notas;
import javax.swing.JOptionPane; //importa a biblioteca do java chamada JOptionPane.
/**
 *
 * @author dti
 */
public class Principal { //cria ou declara uma classe pública para o programa que está no java chamada de Principal.
    public static void main (String[] args) { //pacote de extensão do núcleo de java.
        //Para iniciar o método main, usamos os colchetes {} que no final seram fechados. 
        
        //Nesta linha, temos a declaração das variáveis nas linhas 15 e 16.
        //Além disso, também acrescentamos telas gráficas através do pacote JOptionPane para poder receber os valores das variáveis das notas e armazená-las na memória do programa.
        double n1 = 0, n2 = 0, n3 = 0, n4 = 0, md = 0;
        String des = "";
        
        //entrada de dados e conversão de dados.
        n1 = Double.parseDouble(JOptionPane.showInputDialog
        ("Digite a primeira nota: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog
        ("Digite a segunda nota: "));
        n3 = Double.parseDouble(JOptionPane.showInputDialog
        ("Digite a terceira nota: "));
        n4 = Double.parseDouble(JOptionPane.showInputDialog
        ("Digite a quarta nota: "));
        //Depois de recebidas todas as variáveis e armazenadas na memória, calculamos a média do aluno através da conta: (md = (n1 + n2 + n3 + n4)/4;).
        md = (n1 + n2 + n3 + n4)/4;
        //Depois do cálculo estar feito, utilzamos do método se, senão (if, else) para relatarmos ao programa sobre o que ele deverá fazer em situações diferentes que o resultado da média pode chegar. 
        //Assim em cada resultado da média, dizer em que situação o aluno está.
        if (md >= 6){
            des = "aprovado";
        }
        else if (md < 3){
            des = "repetido";
        }
        else {
            des = "exame";
        }
        //Depois de finalizado cada situação do resultado da média, vamos finalmente chegar ao final do programa com o resultado da média e a situação do aluno em mãos.
        //Para isso, utilizamos mais uma função da biblioteca JOptionPane e exibimos uma tela gráfica com os dados mencionados acima.
        JOptionPane.showMessageDialog(null, "A média é: "  + md 
        + "\nA situação do aluno é: " + des);
            
    }//fim da classe main.
    
}//fim da classe principal.
