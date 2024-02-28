package Pedido;

public class Pagamento {

	private Byte quantidadePedido; 
	private Double subtotal;
	private Double desconto;
	private Double total ; 
	private Double[] valorBebida = {15.99, 9.97, 13.00};
	private Double[] valorLanche = {47.99, 20.97, 15.00};

private Spring token;
			
	//Métodos get e set quantidade
	public byte getQuantidade() {
		return quantidadePedido;
	}
	public void setQuantidade(byte quantidade) {
		this.quantidadePedido = quantidade;
	}
	
	//Métodos get e set subtotal
	
	public Double getSubtotal() {
		return subtotal;
	}
	
	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}
	
	// Métodos get e set desconto
	public Double getDesconto() {
	    return desconto;
	}

	public void setDesconto(Double desconto) {
	    // Verifica se 'total' foi inicializado antes de calcular o desconto
	    if (total != null) {
	        this.desconto = 3 * total / 10;
	    } else {
	        // Caso 'total' não tenha sido inicializado, imprime uma mensagem de erro
	        System.err.println("Erro: Total não foi inicializado. Não foi possível calcular o desconto.");
	    }
	}
	
	//Métodos get e set total
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	
	
	//Métodos get e set valorProduto
	public Double[] getValorBebida() {
		return valorBebida;
	}
	
	public void setValorBebida( Double[] valorBebida) {
		this.valorBebida = valorBebida;
	}
	
	//Métodos get e set valorLanche
	public Double[] getValorLanche() {
		return valorLanche;
	}
	
	public void setValorLanche( Double[] valorLanche) {
		this.valorLanche = valorLanche;
	}

		//Métodos get e set token
	public byte getToken() {
		return token;
	}
	public void setToken() {
		this.token = token;
	}

}
	

