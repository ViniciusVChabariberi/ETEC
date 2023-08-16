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
            this.avaliarOpacaoEscolhida();        
        }while(this.opcao!=5);
    }
    
    public void executarMenuPrincipal(){
        String mensagemMenu = """
                              Selecione uma opcao: 
                              1 - Cadastrar Peso e Altura
                              2 - Consultar os dados cadastrados
                              3 - Calcular IMC
                              4 - Verificar Situa\u00e7\u00e3o
                              0 - Sair""";
    
    String entradaDados = io.entradaDados(mensagemMenu);
    this.opcao = conversor.stringToInt(entradaDados);    
    }
    
    public void avaliarOpacaoEscolhida(){
        switch(this.opcao){
            case 1:
                String mensagemEntrada = "Digite o seu peso";
                double ValorPeso = conversor.stringToDouble(io.entradaDados(mensagemEntrada));
                mensagemEntrada = "Digite a sua altura";
                double ValorAltura = conversor.stringToDouble(io.entradaDados(mensagemEntrada));
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
                break;
            default:
                io.saidaDados("Opção inválida");
                break;
        }
    }
    
}
