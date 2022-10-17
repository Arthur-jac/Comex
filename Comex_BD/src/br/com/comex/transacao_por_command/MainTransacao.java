package br.com.comex.transacao_por_command;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.jdbc.ConnectionFactory;

public class MainTransacao {

	public static void main(String[] args) throws SQLException {
		Connection con = new ConnectionFactory().getConnection();
		
		Transacao t = new Transacao();
		
		t.realizaTransacao(con);
	}

}
