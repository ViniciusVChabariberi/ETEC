/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * @author Admin
 */
public class Menu {
    
    private Caixa caixa;
    private int opcao;
    private Conversor conversor;
    private EntradaSaidaDados io;
    
    public Menu(){
        this.caixa = new Caixa();
        this.opcao = -1;
        this.conversor = new Conversor();
        this.io = new EntradaSaidaDados();
    }
    
    public void executarCaixa(){
        
        do{
            this.executarMenuPrincipal();
            this.avaliarOpacaoEscolhida();        
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
                caixa.entrar(ValorEntrada);
                break;
            case 2:
                String mensagemRetirada = "Digite o valor da retirada";
                double ValorRetirada = conversor.stringToDouble(io.entradaDados(mensagemRetirada));
                caixa.retirar(ValorRetirada);
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
