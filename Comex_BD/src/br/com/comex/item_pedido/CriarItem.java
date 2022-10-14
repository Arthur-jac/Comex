package br.com.comex.item_pedido;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;

public class CriarItem {
	public void createItem(Connection con,double precoUnitario,int quantidade,int produto,int pedido,double desconto,String tipo) 
			throws SQLException {
		String comandoSql = "INSERT INTO comex.item_pedido (PRECO_UNITARIO,QUANTIDADE,PRODUTO_ID,PEDIDO_ID,DESCONTO,TIPO_DESCONTO) VALUES(?,?,?,?,?,?)";
		
		PreparedStatement stm = con.prepareStatement(comandoSql);
	
		stm.setDouble(1,precoUnitario);
		stm.setInt(2,quantidade);
		stm.setInt(3,produto);
		stm.setInt(4,pedido);
		stm.setDouble(5,desconto);
		stm.setString(6,tipo);
		
		stm.execute();
		stm.close();
	}
}
