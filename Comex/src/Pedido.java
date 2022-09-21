
public class Pedido {
	private int id;
	private String data;
	private Cliente cliente;
	
	public Pedido(int id, String data, Cliente cliente) {
		this.id = id;
		this.data = data;
		this.cliente = cliente;
	}
	
	public int getId() {
		return id;
	}

	public String getData() {
		return data;
	}

	public Cliente getCliente() {
		return cliente;
	}

	@Override
	public String toString() {
		return "\n Pedido ID -> " + id + " \n"
				+ " Data -> " + data + " \n"
				+ " Cliente -> " + cliente.getNome() + "\n \n";
	}
	
}
