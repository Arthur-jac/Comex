package br.com.comex.main.cliente;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.dao.ClienteDAO;
import br.com.comex.jdbc.ConnectionFactory;
import br.com.comex.modelo.Cliente;

public class MainClienteListagem {

	public static void main(String[] args) throws SQLException {
		Connection con = new ConnectionFactory().getConnection();
		ClienteDAO cd = new ClienteDAO(con);
		
		List<Cliente> clientes = new ArrayList<Cliente>();
		clientes = cd.listClientes();
		
		for (Cliente cliente : clientes) {
			System.out.println(cliente);
		}
		
		con.close();
	}

}
