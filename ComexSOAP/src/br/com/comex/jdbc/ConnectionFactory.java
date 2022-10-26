package br.com.comex.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
	
	public DataSource dataSource ;
	
	public ConnectionFactory() {
		ComboPooledDataSource cpds = new ComboPooledDataSource();
		cpds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
		cpds.setUser("comex");
		cpds.setPassword("comex");
		
		this.dataSource = cpds;
	}
	
	public Connection getConnection() {
		try {
			return this.dataSource.getConnection();
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
