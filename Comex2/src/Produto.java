
public class Produto {
	private int id;
	private String nome;
	private double preco_unitario;
	private int qtd_estoque;
	Categoria categoria;
	private static int sequence = 1;
	
	public Produto(String nome, double preco_unitario, int qtd_estoque, Categoria categoria) {
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
