/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jformattedtextfield;
//importando bibliotecas
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;
import javax.swing.text.MaskFormatter;
/**
 *
 * @author dti
 */
public class JFor extends JFrame{
    //variaveis de instância
    JLabel CEP, TEL, CPF, data;
    JFormattedTextField cep, tel, cpf, DATA;
    MaskFormatter masCEP, masTEL, masCPF, masdata;
    
    public JFor(){
        super("Exemplo com JFormattedTextField");
        Container tela = getContentPane();
        setLayout(null);
        
        CEP = new JLabel("CEP: ");
        TEL = new JLabel("Telefone: ");
        CPF = new JLabel("CPF: ");
        data = new JLabel("Data: ");
        
        CEP.setBounds(50, 40, 100, 20);
        TEL.setBounds(50, 80, 100, 20);
        CPF.setBounds(50, 120, 100, 20);
        data.setBounds(50, 160, 100, 20);
        
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
        
        cep.setBounds(150, 40, 100, 20);
        tel.setBounds(150, 80, 100, 20);
        cpf.setBounds(150, 120, 100, 20);
        DATA.setBounds(150, 160, 100, 20);
        
        //cep.setForeground
        //cep.setBackground
        //cep.setFont
        
        
        tela.add(CEP);
        tela.add(TEL);
        tela.add(CPF);
        tela.add(data);
        
        tela.add(cep);
        tela.add(tel);
        tela.add(cpf);
        tela.add(DATA);
        
        setSize(400, 250);
        setVisible(true);
    }
    public static void main(String args[]){
        JFor app = new JFor();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
