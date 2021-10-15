package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
								//tipo de conex�o+local de execu��o+nome do BD+fuso hor�rio
	private static String url = "jdbc:mysql://localhost/banco_teste_curso_java?useTimezone=true&serverTimezone=UTC";
	private static String userName = "root"; //usu�rio do BD
	private static String userPassword = "Xablau@1992"; //Senha do usu�rio do BD
	
	public static Connection getConnection() {
		
		try {			
			//nome do driver utilizado dentro da classe
			Class.forName("com.mysql.cj.jdbc.Driver");
			//endere�o e par�metros de conex�o com o BD
			return DriverManager.getConnection(url, userName, userPassword);
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
}
