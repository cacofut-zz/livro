
public class Fatura{

	private String numero;
	private String descricao;
	private int quantidade;
	private double preco;
	
	public Fatura( String numero, String descricao, int quantidade, double preco ){
		if( quantidade < 0 )
			quantidade = 0;
		if( preco < 0.0 )
			preco = 0.0;		
		this.numero     = numero;
		this.descricao  = descricao;
		this.quantidade = quantidade;
		this.preco      = preco;
	}
	
	public void setNumero(String numero){
		this.numero = numero;		
	}
	
	public String getNumero(){
		return numero;
	}
	
	public void setDescricao(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao(){
		return descricao;
	}
	
	public void setQuantidade(int quantidade){
		if( quantidade < 0 )
			quantidade = 0;
		this.quantidade = quantidade;
	}
	
	public int getQuantidade(){
		return quantidade;
	}
	
	public void setPreco(double preco){
		if( preco < 0.0 )
			preco = 0.0;
		this.preco = preco;
	}
	
	public double getPreco(){
		return preco;
	}
	
	public double getInvoiceAmount(){
		return quantidade * preco;
	}
}