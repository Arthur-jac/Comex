package br.com.comex.produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExcluirProduto {
	public void deleteProduto(Connection con, int id) throws SQLException{
		String comandoSql = "DELETE FROM comex.produto WHERE id=?";
		
		PreparedStatement stm = con.prepareStatement(comandoSql);
		
		stm.setInt(1,id);
		
		stm.execute();
		stm.close();
	}
}
