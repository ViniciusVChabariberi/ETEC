/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoimc;

import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */
public class MenuImc {
    private IMC Imc;
    private int opcao;
    private ConversorNumeros conversor;
    private EntradaSaidaDados io;
    private Situacao situacao;
    
    public MenuImc(){
        this.Imc = new IMC();
        this.opcao = -1;
        this.conversor = new ConversorNumeros();
        this.io = new EntradaSaidaDados();
        this.situacao = new Situacao();
    }
    
    public void executarIMC(){
        do{
            this.executarMenuPrincipal();
            this.avaliarOpacaoEscolhida();        
        }while(this.opcao!=0);
    }
    
    public void executarMenuPrincipal(){
        String mensagemMenu = "Selecione uma opcao: "
                + "\n1 - Cadastrar Peso e Altura"
                + "\n2 - Consultar os dados cadastrados"
                + "\n3 - Calcular IMC"
                + "\n4 - Verificar situação"
                + "\n0 - Sair";
    
    String entradaDados = io.entradaDados(mensagemMenu);
    this.opcao = conversor.stringToInt(entradaDados);    
    }
    
    public void avaliarOpacaoEscolhida(){
        switch(this.opcao){
            case 1:
                String mensagemEntrada = "Digite o seu peso: ";
                double ValorPeso = conversor.stringToDouble(io.entradaDados(mensagemEntrada));
                String mensagemEntrad = "Digite a sua altura: ";
                double ValorAltura = conversor.stringToDouble(io.entradaDados(mensagemEntrad));
                Imc.cadastrarDados(ValorPeso, ValorAltura);
                break;
                
            case 2:
                io.saidaDados("O seu peso é " + Imc.getPeso() + "\n"
                    + "A sua altura é " + Imc.getAltura());
                break;
                
            case 3:
                Imc.calcularIMC();
                break;
                
            case 4:
                situacao.verificarSituacao(Imc);
                break;
                
            case 0:
                io.saidaDados("Finalizando programa!");
                System.exit(0);
                break;
                
            default:
                io.saidaDados("Opção inválida");
                break;
        }
    }
    
}
