package br.com.comex.produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ListarProduto {
	public void listProdutos(Connection con) throws SQLException {
		String comandoSql = "SELECT * FROM comex.produto";
		
		PreparedStatement stm = con.prepareStatement(comandoSql);
		stm.execute();
		
		ResultSet rst = stm.getResultSet();
		
		while(rst.next()) {
			int id = rst.getInt("ID");
			String nome = rst.getString("NOME");
			String descricao = rst.getString("DESCRICAO");
			double preco_unitario = rst.getDouble("PRECO_UNITARIO");
			double quantidade_estoque = rst.getDouble("QUANTIDADE_ESTOQUE");
			double categoria_id = rst.getDouble("CATEGORIA_ID");
			String tipo = rst.getString("TIPO");
			
			System.out.println("ID -> " +id+ " \nNOME -> " +nome+ " \nDESCRIÇÃO -> " +descricao+"\nPREÇO -> " +preco_unitario+ 
					"\nQTD.ESTOQUE -> " +quantidade_estoque+ "\nCATEGORIA ID -> " +categoria_id+ "\nTIPO -> " +tipo+ "\n \n");
			
			
		}
		
		rst.close();
		stm.close();
		
	}
}
