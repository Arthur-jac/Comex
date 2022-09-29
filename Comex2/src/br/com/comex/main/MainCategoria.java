package br.com.comex.main;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.ComexException;
import br.com.comex.modelo.Status;

public class MainCategoria {

	public static void main(String[] args){
		
		//Correto
		Categoria categoria = new Categoria("Moda", Status.ATIVA);
		
		// Com erro do nome
		//Categoria categoria2 = new Categoria("2Moda", Status.ATIVA);
		
		
		try {
			System.out.println(categoria);
		}catch(IllegalArgumentException | ComexException ex) {
			System.out.println(ex);
		}finally {
			System.out.println("Programa finalizado.");
		}
		
		// Teste da ComexException
		
		Categoria testeComexEx = new Categoria("AAAAAAA", Status.ATIVA);
		
		if(testeComexEx.getNome().startsWith("AAAAAAA")) {
			throw new ComexException("O nome não pode começar com AAAAAAA");
		}else {
			System.out.println(testeComexEx);
		}
	}

}
