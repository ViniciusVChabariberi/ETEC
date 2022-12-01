/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exc2;

import javax.swing.JOptionPane;
/**
 *
 * @author dti
 */
public class Util {
    
    private String texto;
    
    public Util() {
        System.out.println("Construtor executado");
    }
    
    public String getTexto() {
        return texto;
    }
    
    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    public void exibirTexto() {
        JOptionPane.showMessageDialog(null, "Olha meu nome: " + this.getTexto());
    }
    
    public void digitarTexto() {
        this.setTexto(JOptionPane.showInputDialog("Digite seu nome: "));
    }
}
