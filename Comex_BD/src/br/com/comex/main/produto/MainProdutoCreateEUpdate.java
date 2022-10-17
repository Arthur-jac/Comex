package br.com.comex.main.produto;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.dao.ProdutoDAO;
import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.modelo.Produto;

public class MainProdutoCreateEUpdate {

	public static void main(String[] args) throws SQLException {
		Connection con = new ConnectionFactory().getConnection();	
		ProdutoDAO pd = new ProdutoDAO(con);
		

		Produto produto = new Produto();
		produto.setNome("Playstation 5");
		produto.setDescricao("Console da ultima geração");
		produto.setPreco_unitario(4700);
		produto.setQuantidade_estoque(5);
		produto.setTipo("NAO_ISENTO");
		produto.setCategoria_id(12);
		
//		Cria um produto
//		pd.createProduto(produto);

		
//		Altera determinado produto
		produto.setPreco_unitario(4500);
		pd.updateProduto(produto,14);

		con.close();

	}

}
