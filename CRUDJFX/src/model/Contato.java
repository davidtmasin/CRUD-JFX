package model;

public class Contato {

	private long id;
	private String nome;
	private String sobrenome;
	private int idade;
	private String telefone;
	
	public Contato() {}
	
	public Contato(long id, String nome, String sobrenome, int idade, String telefone) {
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.telefone = telefone;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Contato [id=" + id + ", nome=" + nome + ", sobrenome=" + sobrenome + ", idade=" + idade + ", telefone="
				+ telefone + "]";
	}
	
	
	
	
}
