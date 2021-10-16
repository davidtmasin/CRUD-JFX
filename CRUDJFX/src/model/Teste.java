package model;

import java.sql.SQLException;
import java.util.List;

public class Teste {

	public static void main(String[] args) throws SQLException {
/*
		Connection conector = ConnectionFactory.getConnection();
		
		String sql = "insert into agenda (nome, sobrenome, idade, telefone) values('David', 'Teixeira de Masin', 29, '(85) 9 8964-7993')";
		
		PreparedStatement ps = conector.prepareStatement(sql);
		ps.execute();
		ps.close();
		System.out.println("OK.");
*/
		//ContatoDAO dao = new ContatoDAO();
		//Contato contato1 = new Contato();
		/*
		contato1.setId(5);
		contato1.setNome("Custodia");
		contato1.setSobrenome("Calcida");
		contato1.setIdade(65);
		contato1.setTelefone("(85) 9 8902-8922");
		*/
		//dao.salvarDAO(contato1); //chama o DAO para receber o objeto e salvá-lo
		//dao.editarDAO(contato1);
		
		//List<Contato> contatos = dao.consultarDAO();
		
		//Percorre toda a lista e retorna o "Nome - Idade"
		//contatos.stream().forEach(registro -> System.out.println(registro.getNome() + " - " + registro.getIdade()));
		
		//System.out.println("----------------------------------------------");
		//Ou
		//System.out.println("----------------------------------------------");
		
		//Percorre toda a lista e retorna a informação do método toString
		//contatos.stream().forEach(System.out::println);
		
	}

}
