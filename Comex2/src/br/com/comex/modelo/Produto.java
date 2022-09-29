package br.com.comex.modelo;

public class Produto {
	private int id;
	private String nome;
	private double preco_unitario;
	private int qtd_estoque;
	Categoria categoria;
	private static int sequence = 1;
	
	public Produto(String nome, double preco_unitario, int qtd_estoque, Categoria categoria) {
				
		if(id < 0) {
			throw new IllegalArgumentException("O id não pode ser menor que zero");
		}
		
		if(nome == null || nome.length() < 5 ) {
			throw new IllegalArgumentException("O nome não pode ser null ou ser menor que 4 caracteres");
		}
		
		if(preco_unitario < 0 || qtd_estoque < 0 ) {
			throw new IllegalArgumentException("A quantidade do estoque ou preço não podem ser menor que 0");
		}
		
		if(categoria == null) {
			throw new IllegalArgumentException("Categoria não pode ser nula");
		}
		
		if(nome.startsWith("0") || nome.startsWith("1") || nome.startsWith("2") || nome.startsWith("3") || nome.startsWith("4") ||
				nome.startsWith("5") || nome.startsWith("6") || nome.startsWith("7") || nome.startsWith("8") || nome.startsWith("9")) {
			throw new IllegalArgumentException("O nome não pode começar com números");
		}
		
		this.id = sequence++;
		this.nome = nome;
		this.preco_unitario = preco_unitario;
		this.qtd_estoque = qtd_estoque;
		this.categoria = categoria;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco_unitario() {
		return preco_unitario;
	}

	public int getQtd_estoque() {
		return qtd_estoque;
	}

	public Categoria getCategoria() {
		return categoria;
	}
	
	public double calculaImposto(){	
		return getPreco_unitario() * 0.4;
	}

	@Override
	public String toString() {
		return "Produto \n"
				+ " ID -> " + id + " \n"
				+ " Nome -> " + nome + " \n"
				+ " Preço unitario -> " + preco_unitario + " \n"
				+ " Quantidade Estoque -> " + qtd_estoque + " \n"
				+ " Categoria -> " + categoria.getNome() + " \n \n";
	}
}
