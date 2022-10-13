package br.com.comex.cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CriarCliente {
	public void createCliente(Connection con,String nome,String cpf,String telefone,String rua,String numero,
			String complemento,String bairro,String cidade,String uf) throws SQLException {
		
		String comandoSql = "INSERT INTO comex.cliente (NOME,CPF,TELEFONE,RUA,NUMERO,COMPLEMENTO,BAIRRO,CIDADE,UF) VALUES(?,?,?,?,?,?,?,?,?)";
		
		PreparedStatement stm = con.prepareStatement(comandoSql);
		
		stm.setString(1,nome);
		stm.setString(2,cpf);
		stm.setString(3,telefone);
		stm.setString(4,rua);
		stm.setString(5,numero);
		stm.setString(6,complemento);
		stm.setString(7,bairro);
		stm.setString(8,cidade);
		stm.setString(9,uf);
		
		stm.execute();
		stm.close();
	}
}
