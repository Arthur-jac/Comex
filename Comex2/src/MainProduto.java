
public class MainProduto {

	public static void main(String[] args) {
		Categoria categoria = new Categoria("Alimento", Status.ATIVA);
		Produto produto = new Produto("Chocolate", 10, 2, categoria);
		
		try {
			if(produto.getId() > 0 &&
					produto.getNome() != null && produto.getNome().length() > 0 && 
					produto.getPreco_unitario() > 0 && 
					produto.getQtd_estoque() > 0 && 
					produto.getCategoria() != null) { 
				System.out.println(produto);
			}else {
				throw new IllegalArgumentException("Produto invalido");
			}
		}catch(IllegalArgumentException ex) {
			System.out.println(ex);
		}finally {
			System.out.println("Programa finalizado");
		}

	}

}
