/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplo_um; //O package são utilizados pra organizar suas classes
   // e evitar conflitos de nomes, funciona como se fosse um diretório
import javax.swing.JOptionPane; //importar pacote da biblioteca JOptionPane

/**
 *
 * @author Admin
 */

//criação da classe pública exemplo_um
public class Exemplo_um {

 //pacote do núcleo de java
    public static void main(String[] args) {
        //chamando o método digite
        digite();
    }
    //Criação do método digite
    static void digite() {
        //declaração da variável a
        int a;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        //chamando o método dobro que irá calcular a variável a
        dobro(a);
    }
    //Criação do método dobro
    static void dobro(int n) {
        //criação da variável d que recebe a variável n e depois á multiplica
        int d = n * 2;
        JOptionPane.showMessageDialog(null, "Dobro de " + n + " é " + d);
    }
}
