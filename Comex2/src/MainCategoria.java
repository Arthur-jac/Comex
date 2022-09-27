
public class MainCategoria {

	public static void main(String[] args) {
		
		Categoria categoria = new Categoria("TI", Status.ATIVA);
		
		if(categoria.getId() > 0) 
			if(categoria.getNome().length() >= 3 && categoria.getNome() != null) 
				System.out.println(categoria);
			throw new ExceptionARJ("Categoria inválida");	
	
	}

}
