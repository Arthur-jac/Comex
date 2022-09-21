
public class ItemPedido {
	private int id;
	private Pedido pedido;
	private Produto produto;
	private int qtd_comprada;
	private double desconto;
	private String tp_desconto;
	private static int sequence = 1;
	
	public ItemPedido(Pedido pedido, Produto produto, int qtd_comprada, double desconto, String tp_desconto) {
		this.pedido = pedido;
		this.produto = produto;
		this.id = sequence++;
		this.qtd_comprada = qtd_comprada;
		this.desconto = desconto;
		this.tp_desconto = tp_desconto;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public Produto getProduto() {
		return produto;
	}

	public int getId() {
		return id;
	}

	public int getQtd_comprada() {
		return qtd_comprada;
	}

	public double getDesconto() {
		return desconto;
	}

	public String getTp_desconto() {
		return tp_desconto;
	}

	@Override
	public String toString() {
		return "\n ItemPedido -> " + id + " \n"
				+ " Produto Nome -> " + produto.getNome() + " \n"
				+ " Produto preço unitario -> " + produto.getPreco_unitario() + " - " + pedido.getData() + " \n"
				+ " Pedido -> " + pedido.getId() + " \n"
				+ " Quantidade comprada -> " + qtd_comprada + " \n"
				+ " Desconto -> " + desconto + " \n"
				+ " Tipo Desconto -> " + tp_desconto + " \n"
				+ " Preço Total sem Desconto -> " + precoTotalsemDesconto() + " \n"
				+ " Preço Total com Desconto -> " + precoTotalcomDesconto() + " \n \n";
	}
	
	public double precoTotalsemDesconto() {
		return produto.getPreco_unitario() * getQtd_comprada();
	}
	
	public double calculaDesconto() {
		if(getTp_desconto() == "QUANTIDADE" && getQtd_comprada() >= 10) 
			return getDesconto() * 0.1;
		if(getTp_desconto() == "PROMOÇÃO")
			return getDesconto() * 0.2;
		else
			return 0;
	}
	
	public double precoTotalcomDesconto() {
		return precoTotalsemDesconto() - calculaDesconto();
	}
}
