/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexao;

/**
 *
 * @author dti
 */
import javax.swing.JOptionPane;
import java.sql.*;
public class conexao {
    
    final private String driver = "com.mysql.jdbc.Driver";
    final private String url = "jdbc:mysql://127.0.0.1/clientes";
    final private String usuario = "root";
    final private String senha = "";
    private Connection conexao;
    public Statement statement;
    public ResultSet resultset;
    
    public boolean conecta(){
        boolean result = true;
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,usuario,senha);
            JOptionPane.showMessageDialog(null, "Conexão estabelecida " , "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
            } catch (ClassNotFoundException Driver){
                JOptionPane.showMessageDialog(null, "Driver não localizado "+Driver,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
                result = false;
            } catch (SQLException Fonte){
                JOptionPane.showMessageDialog(null, "Fonte de dados não localizada "+Fonte,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
                result = false;
            }
            return result;
        }
    
    public void desconecta(){
        try {
            conexao.close();
            JOptionPane.showMessageDialog(null, "Conexão com o banco fechada", "Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        } catch(SQLException fecha){
            
        }
    }
    
    public void executaSQL(String sql){
         try { 
        if (conexao != null) {
            statement = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            resultset = statement.executeQuery(sql);
        } else {
            JOptionPane.showMessageDialog(null, "Conexão com o banco não foi estabelecida.", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    } catch (SQLException excecao){
        JOptionPane.showMessageDialog(null, "Erro no comando SQL! \n Erro: " + excecao, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
    }
    }
    
    public Connection conectar(){
        Connection conn = null;
        
        try{
            String url = "jdbc:mysql://127.0.0.1/clientes?user=root&password=";
            conn = DriverManager.getConnection(url);
        } catch(SQLException erro) {
            JOptionPane.showMessageDialog(null, "Conexão estabelecida" + erro.getMessage());
        }
        return conn;
    }
}

