package br.com.comex.categoria.essenciais;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainTestaConexao {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","comex","comex");
		System.out.println("Conexão efetuada com sucesso");
		con.close();
	}
}
