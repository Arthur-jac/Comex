package br.com.comex.csv;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Cliente;
import br.com.comex.modelo.ItemPedido;
import br.com.comex.modelo.Pedido;
import br.com.comex.modelo.Produto;

public class CsvParaPedido {
	private Cliente cliente;
	private Categoria categoria;
	private Produto produto;
	private Pedido pedido;
	private ItemPedido item;
	
	
	
	public CsvParaPedido(Cliente cliente, Categoria categoria, Produto produto, Pedido pedido, ItemPedido item) {
		this.cliente = cliente;
		this.categoria = categoria;
		this.produto = produto;
		this.pedido = pedido;
		this.item = item;
	}
	
	public CsvParaPedido() {
		
	}
	
	public ItemPedido getItem() {
		return item;
	}
	public void setItem(ItemPedido item) {
		this.item = item;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	@Override
	public String toString() {
		return "CsvParaPedido [cliente=" + cliente + ", categoria=" + categoria + ", produto=" + produto + ", pedido="
				+ pedido + ", item=" + item + "]";
	}

	public void leitorPedidos(ArrayList<CsvParaPedido> leitor) {
		System.out.println("Total de pedidos -> " + leitor.size());
	}
	
	public void totalProdutosVendidos(ArrayList<CsvParaPedido> pedidos) {
		int soma = 0;
		
		for (CsvParaPedido p : pedidos) {
			soma += p.getItem().getQtd_comprada(); 
		}
		
		System.out.println("Total de produtos vendidos -> " +soma);
	}
	
	public void totalCategorias(ArrayList<CsvParaPedido> pedidos) {
		Set<String> set = new HashSet<String>(); 
		
		for (CsvParaPedido p : pedidos) {
			set.add(p.getCategoria().getNome());
		}
		
		
		System.out.println("Total de categorias -> " + set.size());
	}
	
	public void montanteTotal(ArrayList<CsvParaPedido> pedidos) {
		double total = 0;
		double multi = 0;
		for (CsvParaPedido p : pedidos) {
			
			multi = p.getItem().getQtd_comprada() * p.getProduto().getPreco_unitario();
			total += multi;
		}
		
		System.out.println("Montante de vendas -> " +NumberFormat.getCurrencyInstance().format(total));
	}
	
	public void pedidoMaisBaratoMaisCaro(ArrayList<CsvParaPedido> pedidos) {
		double total = 0;
		double valorMenor = 0;
		double valorMaior = 0;
		String produtoMaior = "";
		String produtoMenor = "";
		
		for (CsvParaPedido p : pedidos) {
			total = p.getItem().getQtd_comprada() * p.getProduto().getPreco_unitario();
			valorMenor = total;
			if(valorMaior < total) {
				valorMaior = total;
				produtoMaior = p.getProduto().getNome();
			}
		}
		
		for (CsvParaPedido p : pedidos) {
			total = p.getItem().getQtd_comprada() * p.getProduto().getPreco_unitario();
			if(valorMenor > total) {
				valorMenor = total;
				produtoMenor = p.getProduto().getNome();
			}
		}
		
		System.out.println("Pedido mais barato -> " +NumberFormat.getCurrencyInstance().format(valorMenor) + "("+produtoMenor+")");
		System.out.println("Pedido mais caro -> " +NumberFormat.getCurrencyInstance().format(valorMaior) + "("+produtoMaior+")");
	}
}
