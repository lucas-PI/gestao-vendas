package com.comercialinacio;

import com.comercialinacio.model.connect.Conexao;
import com.comercialinacio.model.connect.ConexaoPostgrel;

import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException {
        Conexao conexao = new ConexaoPostgrel();
        System.out.println(conexao.obterConexao());
    }
}