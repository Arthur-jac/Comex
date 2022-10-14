package br.com.comex.produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlterarProduto {
	public void updateProduto(Connection con,String nome,int id) throws SQLException {
		// Update que muda o nome do produto
		String comandoSql = "UPDATE comex.produto SET nome=? WHERE id=?";
		
		PreparedStatement stm = con.prepareStatement(comandoSql); 
		
		stm.setString(1, nome);
		stm.setInt(2, id);
		
		stm.execute();
		stm.close();
	}
}
