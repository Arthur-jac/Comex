package br.com.comex.cliente;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.comex.jdbc.ConnectionFactory;

public class MainCliente {

	public static void main(String[] args) throws SQLException {
		Connection con = new ConnectionFactory().getConnection();
		
		CriarCliente cc = new CriarCliente();
//		cc.createCliente(con,"Fulano","111.111.111-11","(41)99999-9999","Rua do Fulano","1234","Sobrado 7","Bairro do Fulano","Curitiba","PR");
		
		AlterarCliente ac = new AlterarCliente();
//		ac.updateCliente(con, "Ciclano", 8);
		
		ExcluirCliente ec = new ExcluirCliente();
//		ec.deleteCliente(con, 12);
		
		ListarClientes lc = new ListarClientes();
		lc.listClientes(con);
		
		
		con.close();
	}

}
