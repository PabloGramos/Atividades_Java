package com.mycompany.prova;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.mycompany.prova.ConectionFactory;
import java.sql.*;
import java.util.*;
import java.sql.ResultSet;
import com.mycompany.prova.Contato;

public class ContatoDAO {
    private final Connection connection;
    public ContatoDAO() throws ClassNotFoundException{
        this.connection = new ConectionFactory().conexao();
    }

    public void adicionaLivro(Contato contatoLivro){
        try {

            String cmdsql = "INSERT INTO livro (titulo,autor,quantidade_folhas) VALUES (?,?,?)";

            PreparedStatement stmt;
            stmt = connection.prepareStatement(cmdsql);
            stmt.setString(1, contatoLivro.gettitulo());
            stmt.setString(2, contatoLivro.getautor());
            stmt.setString(3, contatoLivro.getquantidade_folhas());
            stmt.execute();
            stmt.close();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
}
