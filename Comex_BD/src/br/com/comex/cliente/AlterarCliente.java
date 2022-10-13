package br.com.comex.cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlterarCliente {
	public void updateCliente(Connection con, String nome, int id) throws SQLException {
		// Esse metodo apenas da um update pelo nome
		String comandoSql = "UPDATE comex.cliente SET nome=? WHERE id=?";
		
		PreparedStatement stm = con.prepareStatement(comandoSql);
		
		stm.setString(1, nome);
		stm.setInt(2, id);
		
		stm.execute();
		stm.close();
		
	}
}
