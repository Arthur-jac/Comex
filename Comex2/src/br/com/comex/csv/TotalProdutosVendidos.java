package br.com.comex.csv;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class TotalProdutosVendidos {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		LeitorPedidosCsv lpc = new LeitorPedidosCsv();
		ArrayList<PedidoCsv> pedidos = lpc.lerCsv();
		
		int soma = 0;
		
		for (PedidoCsv p : pedidos) {
			soma += Integer.parseInt(p.getQuantidade()); 
		}
		
		System.out.println("Total de produtos vendidos -> " +soma);
	}
}
