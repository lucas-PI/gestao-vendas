package com.comercialinacio.model.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoPostgrel implements Conexao{
    private final String USUARIO = "postgres";
    private final String SENHA = "12345";
    private final String URL = "jdbc:postgresql://localhost:5432/gestao_venda1";
    private Connection connection;
    @Override
    public Connection obterConexao() throws SQLException {
        if (connection == null){
            connection = DriverManager.getConnection(URL,USUARIO,SENHA);
        }
        return connection;
    }
}
