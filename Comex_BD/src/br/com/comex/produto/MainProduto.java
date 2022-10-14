package br.com.comex.produto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainProduto {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","comex","comex");
		
		CriarProduto cp = new CriarProduto();
//		cp.createProduto(con,"Plastation 5","Console de ultima geração",4499,5,12,"NAO_ISENTO");
//		cp.createProduto(con,"Cadeira","Cadeira para mesa de jantar",450,7,16,"ISENTO");
		
		AlterarProduto ap = new AlterarProduto();
//		ap.updateProduto(con, "Cadeira de mesa", 12);
		
		ExcluirProduto ep = new ExcluirProduto();
//		ep.deleteProduto(con, 12);
		
		ListarProduto lp = new ListarProduto();
		lp.listProdutos(con);
		
		
		con.close();

	}

}
