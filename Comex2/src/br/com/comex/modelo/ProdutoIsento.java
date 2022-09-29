package br.com.comex.modelo;

public class ProdutoIsento extends Produto{

	public ProdutoIsento(String nome, double preco_unitario, int qtd_estoque, Categoria categoria) {
		super(nome, preco_unitario, qtd_estoque, categoria);
	}
	
	@Override
	public double calculaImposto() {
		double isento = super.calculaImposto();
		isento = 0;
		return isento;
	}

}
