/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exc4; //O package são utilizados pra organizar suas classes
   // e evitar conflitos de nomes, funciona como se fosse um diretório
import javax.swing.JOptionPane;


/**
 *
 * @author viniv
 */
//criação da classe pública exc4
public class Exc4 {
//pacote do núcleo de java
    public static void main(String[] args) {
       calculadora();
    }
    
    static void calculadora() {
        int opcao;
        double n1, n2, res;
        
        JOptionPane.showMessageDialog(null, """
                                            Lista de opções: 
                                             1 - Soma 
                                             2 - Subtração
                                             3 - Divisão
                                             4 - Multiplicação 
                                             5 - Resto da Divisão 
                                             6 - Dobro
                                             7 - Quadrado 
                                             8 - Cubo
                                             9 - Raiz Quadrada
                                             0 - Sair""");
        
        opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha a opcao do calculo: (digite 0 para sair)"));
        n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro número a ser calculado: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo número a ser calculado: "));
        
         switch (opcao) {
      case 1:
        res = n1 + n2;
        JOptionPane.showMessageDialog(null, "A soma dos números é: " + res);
        break;
      case 2:
        res = n1 - n2;
        JOptionPane.showMessageDialog(null, "A subtração dos números é: " + res);
        break;
      case 3:
        res = n1 / n2;
        JOptionPane.showMessageDialog(null, "A divisão dos números é: " + res);
        break;
      case 4:
        res = n1 * n2;
        JOptionPane.showMessageDialog(null, "A multiplicação dos números é: " + res);
        break;
      case 5:
        res = n1 % n2;
        JOptionPane.showMessageDialog(null, "O resto da divisão dos números é: " + res);
        break;
      case 6:
        res = n1 * 2;
        JOptionPane.showMessageDialog(null, "O dobro do primeiro número é: " + res);
        res = n2 * 2;
        JOptionPane.showMessageDialog(null, "O dobro do segundo número é: " + res);
        break;
      case 7:
        res = Math.pow(n1, 2);
        JOptionPane.showMessageDialog(null, "Ao quadrado do primeiro número é: " + res);
        res = Math.pow(n2, 2);
        JOptionPane.showMessageDialog(null, "Ao quadrado do segundo número é: " + res);
        break;
      case 8:
        res = Math.pow(n1, 3);
        JOptionPane.showMessageDialog(null, "Ao cubo do primeiro número é: " + res);
        res = Math.pow(n2, 3);
        JOptionPane.showMessageDialog(null, "Ao cubo do segundo número é: " + res);
        break;  
      case 9:
        res = Math.sqrt(n1);
        JOptionPane.showMessageDialog(null, "A raíz quadrada do primeiro número é: " + res);
        res = Math.sqrt(n2);
        JOptionPane.showMessageDialog(null, "A raíz quadrada do segundo número é: " + res);
        break;
      case 0: 
        break;
        
    }
    }
}
