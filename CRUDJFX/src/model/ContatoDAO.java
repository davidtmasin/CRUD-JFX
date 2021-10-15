package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContatoDAO {
/*
 * DAO
 * DATA ACCESS OBJECT
 * Objeto de acesso aos dados
 * O contatoDAO far� a liga��o entre o objeto contato e a tabela agenda dentro do BD
 */
	private Connection con;

	public ContatoDAO() {
		//Tentativa de in�cio de conex�o
		con = new ConnectionFactory().getConnection();
	}
	
	public void salvarDAO(Contato contato) {
		//JPQL => Linguagem Java para criar query SQL
		String sql ="insert into agenda(nome, sobrenome, idade, telefone) values(?, ?, ?, ?)";
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
	
			//Informa os valores a serem atribu�dos aos campos da table agenda no BD
			ps.setString(1, contato.getNome());
			ps.setString(2, contato.getSobrenome());
			ps.setInt(3,contato.getIdade());
			ps.setString(4, contato.getTelefone());
			
			ps.execute(); //vai enviar o PreparedStatement para o BD
			ps.close(); //fecha a conex�o
						
			System.out.println("Contato salvo");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void editarDAO(Contato contato) {
		
		String sql = "update agenda set nome=?, sobrenome=?, idade=?, telefone=? where id=?";					       
	
		try {
			PreparedStatement ps = con.prepareStatement(sql);
	
			ps.setString(1, contato.getNome());
			ps.setString(2, contato.getSobrenome());
			ps.setInt(3,contato.getIdade());
			ps.setString(4, contato.getTelefone());
			ps.setLong(5, contato.getId());
			
			ps.execute();
			ps.close();
			
			System.out.println("Contato alterado.");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deletarDAO(Long id) {
		
		String sql ="delete from agenda where id=?";
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
	
			ps.setLong(1, id);
			
			ps.execute();
			ps.close();
			System.out.println("Contato exclu�do.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<Contato> consultarDAO() {

		List<Contato> contatos = new ArrayList<>();
		
		try {

			String sql = "select * from agenda";
			
			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				
				Contato contato = new Contato();
				
				contato.setId(rs.getLong("id"));
				contato.setNome(rs.getString("nome"));
				contato.setSobrenome(rs.getString("sobrenome"));
				contato.setIdade(rs.getInt("idade"));
				contato.setTelefone(rs.getString("telefone"));
				
				contatos.add(contato);
			}

			rs.close();

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}		
		return contatos;
	}
	
	
	
}
