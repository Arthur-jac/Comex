import java.text.NumberFormat;

public class ProdutoIsento extends Produto{
	
	@Override
	public String calculaImposto() {
		String resultado = super.calculaImposto();
		resultado = NumberFormat.getCurrencyInstance().format(0);
		return resultado;
	}

}
