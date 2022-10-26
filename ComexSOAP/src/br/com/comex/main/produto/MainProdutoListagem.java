package br.com.comex.main.produto;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.dao.ProdutoDAO;
import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.modelo.Produto;

public class MainProdutoListagem {

	public static void main(String[] args) throws SQLException {
		Connection con = new ConnectionFactory().getConnection();	
		ProdutoDAO pd = new ProdutoDAO(con);
		List<Produto> produtos = new ArrayList<Produto>();
		
		produtos = pd.listProdutos();	
		
		for (Produto p: produtos) {
			System.out.println(p);
		}
		con.close();

	}

}
