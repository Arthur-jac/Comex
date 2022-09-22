
public class CriaCategoria {
	
	public Categoria criaCategoria(String categoria) {
		
		if (categoria == "informatica") {
			Categoria c1 = new Categoria();
			c1.setNome("INFORMÁTICA");
			
			return c1;
		}else if(categoria == "moveis") {
			Categoria c2 = new Categoria();
			c2.setNome("MÓVEIS");
			c2.setStatus(false);
			
			return c2;
		}else if(categoria == "livros"){
			Categoria c3 = new Categoria();		
			c3.setNome("LIVROS");
	
			return c3;
		}else {
			return null;
		}
	}
}
