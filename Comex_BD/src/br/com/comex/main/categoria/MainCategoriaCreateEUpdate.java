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
		
		Categoria cat = new Categoria();
		cat.setNome("Moda");
		cat.setStatus("ATIVA");
		
//		Cria um cliente
//		cd.createCategoria(c);
		
//		Altera determinado categoria
		cat.setStatus("ATIVA");
		cd.updateCategoria(cat,16);
		
		con.close();
	}	
}
