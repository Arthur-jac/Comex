package br.com.comex.ws;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import br.com.comex.dao.CategoriaDAO;
import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.modelo.Categoria;

@WebService
public class ComexWS {
	public List<Categoria> getCategorias() throws SQLException {
		Connection con = new ConnectionFactory().getConnection();
		CategoriaDAO cd = new CategoriaDAO(con);
		
		List<Categoria> categorias = new ArrayList<Categoria>();
		categorias = cd.listCategoria();

		con.close();
		return categorias;
	}
}
