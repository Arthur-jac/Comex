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
