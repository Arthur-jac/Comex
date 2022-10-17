package br.com.comex.transacao_por_command;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.comex.dao.ClienteDAO;
import br.com.comex.modelo.Cliente;

public class Transacao {
	
	// Nessa transação fiz uma listagem nos clientes como exemplo
	public void realizaTransacao(Connection con) throws SQLException {
		try{
			con.setAutoCommit(false);
			ClienteDAO cd = new ClienteDAO(con);
			
			List<Cliente> clientes = new ArrayList<Cliente>();
			clientes = cd.listClientes();
			
			for (Cliente cliente : clientes) {
				System.out.println(cliente);
			}
			
			con.commit();
		}catch (Exception e) {
			e.printStackTrace();
			con.rollback();
		}
	}
}
