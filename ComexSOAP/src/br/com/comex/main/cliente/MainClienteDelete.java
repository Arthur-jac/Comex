package br.com.comex.main.cliente;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.dao.ClienteDAO;
import br.com.comex.jdbc.ConnectionFactory;

public class MainClienteDelete {

	public static void main(String[] args) throws SQLException {
		Connection con = new ConnectionFactory().getConnection();
		ClienteDAO cd = new ClienteDAO(con);

		cd.deleteCliente(15);
		
		con.close();
	}

}
