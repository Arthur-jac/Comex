package br.com.comex.main.produto;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.dao.ProdutoDAO;
import br.com.comex.jdbc.ConnectionFactory;

public class MainProdutoDelete {

	public static void main(String[] args) throws SQLException {
		Connection con = new ConnectionFactory().getConnection();	
		ProdutoDAO pd = new ProdutoDAO(con);
		
		pd.deleteProduto(13);

		con.close();

	}

}
