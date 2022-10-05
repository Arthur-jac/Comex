package br.com.comex.main;
import java.util.ArrayList;

import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.ComexException;
import br.com.comex.modelo.Status;

public class MainCategoria {

	public static void main(String[] args){
		ArrayList<Categoria> categorias = new ArrayList<Categoria>();
		
		//Correto
		Categoria categoria = new Categoria("Moda", Status.INATIVA);
		Categoria categoria2 = new Categoria("Alimento", Status.ATIVA);
		Categoria categoria3 = new Categoria("Celulares", Status.ATIVA);
		// Com erro do nome
		//Categoria categoria2 = new Categoria("2Moda", Status.ATIVA);
		
		
		try {
			categorias.add(categoria);
			categorias.add(categoria2);
			categorias.add(categoria3);
			
			System.out.println(categorias);
		}catch(IllegalArgumentException | ComexException ex) {
			System.out.println(ex);
		}finally {
			System.out.println("Programa finalizado.");
		}
		
		// Teste da ComexException
		
//		Categoria testeComexEx = new Categoria("AAAAAAA", Status.ATIVA);
//		
//		if(testeComexEx.getNome().startsWith("AAAAAAA")) {
//			throw new ComexException("O nome não pode começar com AAAAAAA");
//		}else {
//			System.out.println(testeComexEx);
//		}
	}

}
