/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jlist;
//seção de importação de bibliotecas para a aplicação do código
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author viniv
 */
public class JList extends JFrame{
    JList lista;
    //vetor
    String cidades[] = {"Rio de Janeiro", "São Pualo", "Minas Gerais", "Espírito Santo"};
    JButton exibir;
    JLabel rotulo;
    
    public JList(String[] cidades1){
        super("");
        Container tela = getContentPane();
        setLayout(null);
        exibir = new JButton("Exibir");
        rotulo = new JLabel("");
        //os itens da caixa de listagem são atribuídos aqi
        lista = new JList(cidades);
        //quantidade de elementos que podem ser vistos sem a barra de rolagem
        lista.setVisibleRowCount(5);
        //atualiza a lista: JComponent.list.repaint();
        //cria uma barra de rolagem para a lista
        JScrollPane painelRolagem = new JScrollPane(lista);
        //método utilizado para o usuário escolher apenas um item por vez
        lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        //MULTIPLE_INTERVAL_SELECTION
        //SINGLE_INTERVAL_SELECTION
        painelRolagem.setBounds(40, 50, 150, 100);
        exibir.setBounds(270, 50, 100, 30);
        exibir.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        //obtêm o valor inteiro correspondente aos itens selecionados
                        Object selecionados[] = lista.getSelectedValues();
                        String resultados = "Valores selecionados:\n";
                        //O laço for interage com cada um dos elementos do vetor selecionados
                        for(int i = 0; i<selecionados.length; i++)
                        resultados += selecionados[i].toString()+"\n";
                        JOptionPane.showMessageDialog(null, resultados);
                    }
                }
        );
        
        //lista.setForeground
        //lista.setBackgroud
        //lista.setFont
        tela.add(painelRolagem);
        tela.add(exibir);
        setSize(400, 250);
        setVisible(true);
    }
    public static void main(String args[]){
        
        JList app = new JList();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void setVisibleRowCount(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setSelectionMode(int SINGLE_SELECTION) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private Object[] getSelectedValues() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
