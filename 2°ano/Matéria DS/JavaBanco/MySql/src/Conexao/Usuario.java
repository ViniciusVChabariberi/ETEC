/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexao;

import DTO.UsuarioDTO;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author viniv
 */
public class Usuario {
    conexao conn;
    
    public ResultSet autenticar(UsuarioDTO objusuarioDTO){
        conn = new conexao();
        conn.conectar();
        
        try {
            String sql = "SELECT * FROM tbusuario WHERE nome_usuario=? AND senha_usuario=?";
            PreparedStatement pstm = conn.conectar().prepareStatement(sql);
            pstm.setString(1, objusuarioDTO.getNome_usuario());
            pstm.setString(2, objusuarioDTO.getSenha_usuario());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
        } catch (SQLException erro){
            JOptionPane.showMessageDialog(null,"UsuarioDAO:"+ erro);
            return null;
        }
    }
}
