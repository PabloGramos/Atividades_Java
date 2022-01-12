package com.mycompany.faculdade;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
 
public class Projeto_Exemplo{
 
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        try {
            Connection conexao = null;
            conexao = DriverManager.getConnection("jdbc:mysql://localhost/atividade1", "root", "");

            Statement stm = conexao.createStatement();

            ResultSet rl = stm.executeQuery("SELECT * FROM produto");

            System.out.println("\n............Produto............");
            while(rl.next()){
                System.out.println("======================");
                String nome = rl.getString("nome");
                System.out.println("Nome: " + nome);
                String preco = rl.getString("preco");
                System.out.println("Preço: " + preco);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
        
        try {
            Connection conexao = null;
            conexao = DriverManager.getConnection("jdbc:mysql://localhost/atividade1", "root", "");
            
            Statement stm_i = conexao.createStatement();

            stm_i.executeUpdate("insert into produto values(4, 'Produto 2', 10)");
            System.out.println("Produto inserido");
            
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
        try {
            Connection conexao = null;
            conexao = DriverManager.getConnection("jdbc:mysql://localhost/atividade1", "root", "");
            
            Statement stm_u = conexao.createStatement();

            stm_u.executeUpdate("UPDATE Produto SET nome= 'Teste' where nome ='Produto 2'");
            System.out.println("Produto alterado");
            
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
        try {
            Connection conexao = null;
            conexao = DriverManager.getConnection("jdbc:mysql://localhost/atividade1", "root", "");
            
            Statement stm_d = conexao.createStatement();

            stm_d.executeUpdate("Delete from produto where nome ='Teste'");
            System.out.println("Produto deletado");
            
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

