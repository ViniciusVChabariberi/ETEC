/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.usuario;

/**
 *
 * @author dti
 */
public class usuario {
    String nome;
    String email;
    String login;
    String senha;
    
    public usuario() {
        this("", "" , "", "");
    }
    
    public usuario(String email, String login, String nome, String senha) {
     this.email = email;
     this.login = login;
     this.nome = nome;
     this.senha = senha;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void provarExistencia() {
        System.out.println("Oi, eu existo!");
    }
}
