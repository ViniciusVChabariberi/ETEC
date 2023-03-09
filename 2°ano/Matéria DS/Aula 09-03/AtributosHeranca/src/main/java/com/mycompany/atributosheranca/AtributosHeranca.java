/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atributosheranca; //O package são utilizados pra organizar suas classes
                     // e evitar conflitos de nomes, funciona como se fosse um diretório

/**
 *
 * @author dti
 */
//modelo de heranca para chamar métodos construtores e destrutores do object
class AtributosHeranca extends Object{
    //criação de variáveis públicas
    public int codigo;
    public String nome;
    public int quantidade;
    public double preco;
    //método construtor com parâmetros
    public AtributosHeranca(int c, String n, int q, double p) {
    //chamadas dos atributos pelas variáveis    
        codigo = c;
        nome = n;
        quantidade = q;
        preco = p;
    }
}

//criação da classe TestaProd
class TestaProd {
        //pacote do núcleo de java
    public static void main(String a[]) {
        //variável String para espaçamento
        String s = "     ";
        //referenciando um atributo
        AtributosHeranca produto;
         //instância do objeto chamado produto
        produto = new AtributosHeranca(10, "Sabonete", 12, 1.20);
        //exibição do código, nome do produto, quantidade e preço
        System.out.println(produto.codigo + s + produto.nome);
        System.out.println(produto.quantidade + s + produto.preco);
        produto.quantidade = 100;
        System.out.println(produto.quantidade + s + produto.preco);
        produto.preco *= 1.10;
        System.out.println(produto.quantidade + s + produto.preco);
    }
}