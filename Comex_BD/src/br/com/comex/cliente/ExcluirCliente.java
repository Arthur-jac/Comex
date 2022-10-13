package br.com.comex.cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExcluirCliente {
	public void deleteCliente(Connection con, int id) throws SQLException {
		String comandoSql = "DELETE FROM comex.cliente WHERE id=?";
		
		PreparedStatement stm = con.prepareStatement(comandoSql); 
		
		stm.setInt(1, id);
		
		stm.execute();
		
		stm.close();
	}

}
