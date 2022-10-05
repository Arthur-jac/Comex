package br.com.comex.csv;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class PedidoMaisBaratoEMaisCaro {

	public static void main(String[] args) throws FileNotFoundException {
		LeitorPedidosCsv lpc = new LeitorPedidosCsv();
		ArrayList<PedidoCsv> pedidos = lpc.lerCsv();
		double total = 0;
		double menor = 0;
		double maior = 0;
		String pMaior = "";
		String pMenor = "";
		
		for (PedidoCsv p : pedidos) {
			total = Integer.parseInt(p.getQuantidade()) * Double.parseDouble(p.getPreco());
			menor = total;
			if(maior < total) {
				maior = total;
				pMaior = p.getProduto();
			}
		}
		
		for (PedidoCsv p : pedidos) {
			total = Integer.parseInt(p.getQuantidade()) * Double.parseDouble(p.getPreco());
			if(menor > total) {
				menor = total;
				pMenor = p.getProduto();
			}
		}
		
		System.out.println("Pedido mais barato -> " +menor + "("+pMenor+")");
		System.out.println("Pedido mais caro -> " +maior + "("+pMaior+")");
	}

}
