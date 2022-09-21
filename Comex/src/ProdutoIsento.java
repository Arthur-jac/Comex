
public class ProdutoIsento extends Produto{
	
	@Override
	public String calculaImposto() {
		String resultado = super.calculaImposto();
		resultado = null;
		return resultado;
	}

}
