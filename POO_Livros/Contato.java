package com.mycompany.prova;

import com.mycompany.prova.ConectionFactory;
import java.sql.*;
import java.sql.PreparedStatement;

public class Contato {
    
    public String titulo;
    public String autor;
    public String quantidade_folhas;


    Contato() {
    }

    public String gettitulo() {
        return titulo;
    }
    public void settitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getautor() {
        return autor;
    }
    public void setautor(String autor) {
        this.autor = autor;
    }
    public String getquantidade_folhas() {
        return quantidade_folhas;
    }
    public void setquantidade_folhas(String quantidade_folhas) {
        this.quantidade_folhas = quantidade_folhas;
    }
}