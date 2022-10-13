package br.com.comex.cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ListarClientes {
	
	public void listClientes(Connection con) throws SQLException {
		String comandoSql = "SELECT * FROM comex.cliente";
		
		PreparedStatement stm = con.prepareStatement(comandoSql);
		stm.execute();
		
		ResultSet rst = stm.getResultSet();
		
		while(rst.next()) {
			int id = rst.getInt("ID");
			String nome = rst.getString("NOME");
			String cpf = rst.getString("CPF");
			String telefone = rst.getString("TELEFONE");
			String rua = rst.getString("RUA");
			String numero = rst.getString("NUMERO");
			String complemento = rst.getString("COMPLEMENTO");
			String bairro = rst.getString("BAIRRO");
			String cidade = rst.getString("CIDADE");
			String uf = rst.getString("UF");
			
			System.out.println("ID -> " +id+ " \nNOME -> " +nome+ " \nCPF -> " +cpf+"\nTELEFONE -> " +telefone+ "\nRUA -> " +rua+ "\nNUMERO -> " +numero+ 
					"\nCOMPLEMENTO -> " +complemento+ "\nBAIRRO -> " +bairro+ "\nCIDADE -> " +cidade+ "\nUF -> " +uf+ "\n \n");
			
			
		}
		
		rst.close();
		stm.close();
	}
}
