package br.com.comex.item_pedido;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlterarItem {
	public void updateItem(Connection con,int quantidade,int id) throws SQLException {
		// Update que muda a data do pedido
		String comandoSql = "UPDATE comex.item_pedido SET quantidade=? WHERE id=?";
		
		PreparedStatement stm = con.prepareStatement(comandoSql); 
		
		stm.setInt(1, quantidade);
		stm.setInt(2, id);
		
		stm.execute();
		stm.close();
	}
}
