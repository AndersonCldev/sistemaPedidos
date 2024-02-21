package Pedido;

public class Pagamento {

	private Byte quantidadePedido; 
	private Double subtotal;
	private Double desconto;
	private Double total = subtotal + desconto; 
	private Double[] valorProduto = {15.99, 9.97, 13.00};
	
			
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
	
	//Métodos get e set desconto
	public Double getDesconto() {
		return desconto;
	}
	
	public void setDesconto(Double desconto) {
		this.desconto = 3*total / 10;
	}
	
	
	//Métodos get e set total
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	
	
	//Métodos get e set valorProduto
	public Double[] getValorProduto() {
		return valorProduto;
	}
	
	public void setValorProduto( Double[] valorProduto) {
		this.valorProduto = valorProduto;
	}
	
	
	
}
	

