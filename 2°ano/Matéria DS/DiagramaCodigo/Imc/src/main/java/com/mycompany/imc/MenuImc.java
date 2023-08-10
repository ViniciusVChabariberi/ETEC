package com.mycompany.imc;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
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
            this.avaliarOpcaoEscolhida();        
        }while(this.opcao!=4);
    }
    
    public void executarMenuPrincipal(){
        String mensagemMenu = "Selecione uma opcao: "
                + "\n1 - Entrada"
                + "\n2 - Retirada"
                + "\n3 - Consultar Saldo"
                + "\n4 - Sair";
    
    String entradaDados = io.entradaDados(mensagemMenu);
    this.opcao = conversor.stringToInt(entradaDados);    
    }
    
    public void avaliarOpacaoEscolhida(){
        switch(this.opcao){
            case 1:
                String mensagemEntrada = "Digite o valor da entrada";
                double ValorEntrada = conversor.stringToDouble(io.entradaDados(mensagemEntrada));
                IMC.entrar(ValorEntrada);
                break;
            case 2:
                String mensagemRetirada = "Digite o valor da retirada";
                double ValorRetirada = conversor.stringToDouble(io.entradaDados(mensagemRetirada));
                IMC.retirar(ValorRetirada);
                break;
            case 3:
                String mensagemSaldo = "Saldo atual: " + caixa.getSaldo();
                io.saidaDados(mensagemSaldo);
                break;
            case 4:
                io.saidaDados("Finalizando programa!");
                break;
            default:
                io.saidaDados("Opção inválida");
                break;
        }
    }
    
}
