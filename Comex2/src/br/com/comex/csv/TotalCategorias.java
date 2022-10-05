package br.com.comex.csv;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class TotalCategorias {
	public static void main(String[] args) throws FileNotFoundException {
		LeitorPedidosCsv lpc = new LeitorPedidosCsv();
		ArrayList<PedidoCsv> pedidos = lpc.lerCsv();

		int contador = 0;
		boolean livros = true;
		boolean informatica = true;
		boolean celulares = true;
		boolean automotiva = true;
		boolean moveis = true;
		
		for (PedidoCsv p : pedidos) {
			if (p.getCategoria().equals("LIVROS") && livros) {
				contador++;
				livros = false;
			}
			
			if (p.getCategoria().equals("CELULARES") && celulares) {
				contador++;
				celulares = false;
			}
			
			if (p.getCategoria().equals("INFORMÁTICA") && informatica) {
				contador++;
				informatica = false;
			}
			
			if (p.getCategoria().equals("AUTOMOTIVA") && automotiva) {
				contador++;
				automotiva = false;
			}
			
			if (p.getCategoria().equals("MÓVEIS") && moveis) {
				contador++;
				moveis = false;
			}
		}
		
		System.out.println("Total de categorias -> " + contador);
	}
}
