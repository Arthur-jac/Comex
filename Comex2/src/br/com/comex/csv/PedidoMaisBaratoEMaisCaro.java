package br.com.comex.csv;

import java.io.FileNotFoundException;
import java.text.NumberFormat;
import java.util.ArrayList;

public class PedidoMaisBaratoEMaisCaro {

	public static void main(String[] args) throws FileNotFoundException {
		LeitorPedidosCsv lpc = new LeitorPedidosCsv();
		ArrayList<PedidoCsv> pedidos = lpc.lerCsv();
		double total = 0;
		double valorMenor = 0;
		double valorMaior = 0;
		String produtoMaior = "";
		String produtoMenor = "";
		
		for (PedidoCsv p : pedidos) {
			total = Integer.parseInt(p.getQuantidade()) * Double.parseDouble(p.getPreco());
			valorMenor = total;
			if(valorMaior < total) {
				valorMaior = total;
				produtoMaior = p.getProduto();
			}
		}
		
		for (PedidoCsv p : pedidos) {
			total = Integer.parseInt(p.getQuantidade()) * Double.parseDouble(p.getPreco());
			if(valorMenor > total) {
				valorMenor = total;
				produtoMenor = p.getProduto();
			}
		}
		
		System.out.println("Pedido mais barato -> " +NumberFormat.getCurrencyInstance().format(valorMenor) + "("+produtoMenor+")");
		System.out.println("Pedido mais caro -> " +NumberFormat.getCurrencyInstance().format(valorMaior) + "("+produtoMaior+")");
	}

}
