
public class Empregado{

	private String nome;
	private String sobrenome;
	private double salarioMensal;
	
	public Empregado(String nome, String sobrenome, double salarioMensal){
		this.nome = nome;
		this.sobrenome = sobrenome;
		if( salarioMensal >= 0.0 )
			this.salarioMensal = salarioMensal;
						
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setSobrenome(String sobrenome){
		this.sobrenome = sobrenome;
	}
	
	public String getSobrenome(){
		return this.sobrenome;
	}
	
	public void setSalarioMensal(double salarioMensal){
		if( salarioMensal >= 0.0 )
			this.salarioMensal = salarioMensal;
	}
	
	public double getSalarioMensal(){
		return this.salarioMensal;
	}
}