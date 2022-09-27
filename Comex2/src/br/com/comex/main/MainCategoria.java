package br.com.comex.main;
import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Status;

public class MainCategoria {

	public static void main(String[] args){
		
		Categoria categoria = new Categoria(null, Status.ATIVA);
		
		try {
			if(categoria.getId() > 0) 
				if(categoria.getNome().length() >= 3 && categoria.getNome() != null) {
					System.out.println(categoria);
				}else {
					throw new IllegalArgumentException("Categoria invalida");
				}
		}catch(NullPointerException | IllegalArgumentException ex) {
			System.out.println(ex);
		}finally {
			System.out.println("Programa finalizado.");
		}
	}

}
