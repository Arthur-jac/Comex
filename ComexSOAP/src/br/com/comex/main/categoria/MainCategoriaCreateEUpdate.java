package br.com.comex.main.categoria;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.dao.CategoriaDAO;
import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.modelo.Categoria;

public class MainCategoriaCreateEUpdate {
	public static void main(String[] args) throws SQLException {
		Connection con = new ConnectionFactory().getConnection();
		CategoriaDAO cd = new CategoriaDAO(con);
		
		Categoria categoria = new Categoria();
		categoria.setNome("Teste");
		categoria.setStatus("INATIVA");
		
//		Cria um cliente
//		cd.createCategoria(categoria);
		
//		Altera determinado categoria
		categoria.setNome("HIGIENE");
		cd.updateCategoria(categoria,20);
		
		con.close();
	}	
}
