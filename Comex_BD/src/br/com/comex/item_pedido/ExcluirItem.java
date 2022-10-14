package br.com.comex.item_pedido;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExcluirItem {
	public void deleteItem(Connection con, int id) throws SQLException{
		String comandoSql = "DELETE FROM comex.item_pedido WHERE id=?";
		
		PreparedStatement stm = con.prepareStatement(comandoSql);
		
		stm.setInt(1,id);
		
		stm.execute();
		stm.close();
	}
}
