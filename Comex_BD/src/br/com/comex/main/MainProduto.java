package br.com.comex.main;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.dao.ProdutoDAO;
import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.modelo.Produto;

public class MainProduto {

	public static void main(String[] args) throws SQLException {
		Connection con = new ConnectionFactory().getConnection();	
		ProdutoDAO pd = new ProdutoDAO(con);
		List<Produto> produtos = new ArrayList<Produto>();
		
//		Cria um produto
//		Produto produto = new Produto();
//		produto.setNome("Análise de dados com Python");
//		produto.setDescricao("Um livro que ensina o básico de análise de dados em python");
//		produto.setPreco_unitario(88);
//		produto.setQuantidade_estoque(10);
//		produto.setTipo("NAO_ISENTO");
//		produto.setCategoria_id(11);
//
//		pd.createProduto(produto);
		
//		Deleta determinado produto
//		pd.deleteProduto(13);
		
//		Altera determinado produto
//		produto.setPreco_unitario(102);
//		pd.updateProduto(produto,13);
		
// 		Lista todas os Produtos
		produtos = pd.listProdutos();	
		
		for (Produto p: produtos) {
			System.out.println(p);
		}
		con.close();

	}

}
