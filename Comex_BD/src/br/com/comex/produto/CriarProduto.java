package br.com.comex.produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CriarProduto {
	public void createProduto(Connection con,String nome,String descricao,double precoUnitario,int qtdEstoque,int categoriaId,String tipo) 
			throws SQLException {
		String comandoSql = "INSERT INTO comex.produto (NOME,DESCRICAO,PRECO_UNITARIO,QUANTIDADE_ESTOQUE,CATEGORIA_ID,TIPO) VALUES(?,?,?,?,?,?)";
		
		PreparedStatement stm = con.prepareStatement(comandoSql);
	
		stm.setString(1,nome);
		stm.setString(2,descricao);
		stm.setDouble(3,precoUnitario);
		stm.setInt(4,qtdEstoque);
		stm.setInt(5,categoriaId);
		stm.setString(6,tipo);
		
		stm.execute();
		stm.close();
	}
}
