import java.text.NumberFormat;

public class Produto {
	private int id;
	private String nome;
	private String descricao;
	private double preco_unitario;
	private int qtd_estoque;
	private Categoria categoria;
	private static int sequence = 1;
	
	public Produto() {
		this.id = sequence++;
	}
	
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco_unitario() {
		return preco_unitario;
	}
	public void setPreco_unitario(double preco_unitario) {
		this.preco_unitario = preco_unitario;
	}
	public int getQtd_estoque() {
		return qtd_estoque;
	}
	public void setQtd_estoque(int qtd_estoque) {
		this.qtd_estoque = qtd_estoque;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	public String calculaValorTotalEstoque() {
		return NumberFormat.getCurrencyInstance().format(getQtd_estoque() * getPreco_unitario()); 
	}
	
	public String calculaImposto(){	
		return NumberFormat.getCurrencyInstance().format(getPreco_unitario() * 0.4);
	}
	
	@Override
	public String toString() {
		return "\n Produto: ID-> " + id + " \n"
				+ " Nome -> " + nome + " \n"
				+ " Descrição -> " + descricao + " \n"
				+ " Preço unitario -> " + NumberFormat.getCurrencyInstance().format(preco_unitario) + " \n"
				+ " Quantidade no estoque -> " + qtd_estoque + " \n"
				+ " Categoria -> " + categoria.getNome()+ " \n"
				+ " Valor Total estoque -> " + calculaValorTotalEstoque() + " \n"
				+ " Imposto -> " + calculaImposto() + "\n \n";
	}
	
	
}
