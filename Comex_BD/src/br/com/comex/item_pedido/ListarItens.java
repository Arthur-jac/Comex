package br.com.comex.item_pedido;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ListarItens {
	public void listItens(Connection con) throws SQLException {
		String comandoSql = "SELECT * FROM comex.item_pedido";
		
		PreparedStatement stm = con.prepareStatement(comandoSql);
		stm.execute();
		
		ResultSet rst = stm.getResultSet();
		
		while(rst.next()) {
			int id = rst.getInt("ID");
			double precoUnitario = rst.getDouble("PRECO_UNITARIO");
			int quantidade = rst.getInt("QUANTIDADE");
			int produto = rst.getInt("PRODUTO_ID");
			int pedido = rst.getInt("PEDIDO_ID");
			double desconto = rst.getDouble("DESCONTO");
			String tipo = rst.getString("TIPO_DESCONTO");
			
			System.out.println("ID -> " +id+ " \nPREÇO -> " +precoUnitario+ " \nQUANTIDADE-> " +quantidade+ " \nPRODUTO-> " +produto+
					" \nPEDIDO-> " +pedido+ " \nDESCONTO-> " +desconto+ " \nTIPO DESCONTO-> " +tipo+ "\n \n");
			
			
		}
		
		rst.close();
		stm.close();
		
	}
}
