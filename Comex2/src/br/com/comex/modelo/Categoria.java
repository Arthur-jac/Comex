package br.com.comex.modelo;

public class Categoria {
	private int id;
	private String nome;
	private Status status;
	private static int sequence = 1;
		
	public Categoria(String nome, Status status) {
		this.id = sequence++;
		this.nome = nome;
		this.status = status;
		
		if(nome.startsWith("0") || nome.startsWith("1") || nome.startsWith("2") || nome.startsWith("3") || nome.startsWith("4") ||
				nome.startsWith("5") || nome.startsWith("6") || nome.startsWith("7") || nome.startsWith("8") || nome.startsWith("9")) {
			throw new IllegalArgumentException("O nome não pode começar com números");
		}
		
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}
	
	public Status getStatus() {
		return status;
	}

	@Override
	public String toString() {
		return "Categoria ID -> " + id + " \n"
				+ " Nome ->" + nome + " \n"
				+ " Status ->" + status + " \n \n";
	}	
	
	
	
}
