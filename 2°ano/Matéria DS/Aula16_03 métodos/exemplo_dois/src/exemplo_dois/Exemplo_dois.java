/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplo_dois; //O package são utilizados pra organizar suas classes
   // e evitar conflitos de nomes, funciona como se fosse um diretório
import javax.swing.JOptionPane; //importar pacote da biblioteca JOptionPane
/**
 *
 * @author Admin
 */
//criação da classe pública exemplo_dois
public class Exemplo_dois {

     //pacote do núcleo de java
    public static void main(String[] args) {
        //chamando o método digite
       digite();
    }
    
    //criação da variável digite
    static void digite() {
        //declaração da variável inteira t
        int t;
        //declaração da variável String p
        String p;
        //criação de uma janela gráfica que recebe o valor da variável p
        p = JOptionPane.showInputDialog("digite uma palavra qualquer: ");
        //atribuição da variável t para o método tamanho
        //que irá calcular o tamanho de caractéres da variável p
        t=tamanho(p);
        //criação de uma janela gráfica que exibe os resultados das variáveis
        JOptionPane.showMessageDialog(null, p+ " possui " + t + " caracteres");
    }
    
    //criação do método tamanho
    static int tamanho(String x) {
        //o método irá retornar a quantidade de caractéres do tipo String
        return x.length();
    }
}
