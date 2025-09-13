package com.comercialinacio.model.connect;

import java.sql.Connection;
import java.sql.SQLException;

public interface Conexao {
    Connection obterConexao() throws SQLException;
}
