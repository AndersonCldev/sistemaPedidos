package Pedido;

public class Pedido {
	
	private String nomeCliente;
	private String sobrenomeCliente;
	private String nomeCompleto;
	private String cpf;
	private String nomePedido;
	public String nomeBebida;
	public String pedidoViagem;
	
	
	//Métodos get e set nomeCliente
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	
	//Métodos get e set sobremoneCliente
	public String getSobrenomeCliente() {
		return sobrenomeCliente;
	}
	
	public void setSobrenomeCliente(String sobrenomeCliente) {
		this.sobrenomeCliente = sobrenomeCliente;
	}
	
	
	//Métodos get e set nomeCompleto
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	
	
	//Métodos get e set cpf
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	//Métodos get e set nomePedido
	public String getNomePedido() {
		return nomePedido;
	}
	public void setNomePedido(String nomePedido) {
		this.nomePedido = nomePedido;
	}
	
	//Métodos get e set bebidas
		public String getNomeBebida() {
			return nomeBebida;
		}
		
		public void setNomeBebida(String nomeBebida) {
			this.nomeBebida = nomeBebida;
		}
	
		//Métodos get e set pedidoViagem
		public String getPedidoViagem() {
			return pedidoViagem;
		}
		
		public void setPedidoViagem(String pedidoViagem) {
			this.pedidoViagem = pedidoViagem;
			}
}
