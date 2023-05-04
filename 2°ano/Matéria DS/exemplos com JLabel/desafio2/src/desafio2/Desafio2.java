/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafio2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;
import javax.swing.text.MaskFormatter;
/**
 *
 * @author dti
 */
public class Desafio2 extends JFrame{
    //variaveis de instância
    JLabel CEP, TEL, CPF, data, exibir;
    JFormattedTextField cep, tel, cpf, DATA;
    MaskFormatter masCEP, masTEL, masCPF, masdata;
    JButton botao;
    
    public Desafio2(){
        super("");
        Container tela = getContentPane();
        setLayout(null);
        
        CEP = new JLabel("CEP: ");
        TEL = new JLabel("Telefone: ");
        CPF = new JLabel("CPF: ");
        data = new JLabel("Data: ");
        botao = new JButton("Mostrar");
        exibir = new JLabel("");
        
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
        botao.setBounds(150, 200, 100, 20);
        exibir.setBounds(150, 240, 100, 20);
        
        //cep.setForeground
        //cep.setBackground
        //cep.setFont
        botao.addActionListener(
                new ActionListener(){
                    // o "e" é do evento click do botão
                    public void actionPerformed(ActionEvent e) {
                        //variáveis do tipo inteiro
                        String Cep, Tel, Cpf, Data;
                        //o objeto numero1 passa a ter um valor de String para Inteiro
                        Cep = cep.getText();
                        Tel = tel.getText();
                        Cpf = cpf.getText();
                        Data = DATA.getText();
                        JOptionPane.showMessageDialog(null, "Cep: " + Cep + "\nTelefone: " + Tel + "\nCpf: " + Cpf + "\nData: " + Data);
                    }
                }
        );
        
        //torna a exibição falsa
        
        exibir.setVisible(false);
        
        tela.add(CEP);
        tela.add(TEL);
        tela.add(CPF);
        tela.add(data);
        
        tela.add(cep);
        tela.add(tel);
        tela.add(cpf);
        tela.add(DATA);
        tela.add(exibir);
        tela.add(botao);
        setSize(400, 350);
        setVisible(true);
    }
    
    public static void main(String args[]){
        Desafio2 app = new Desafio2();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
