
public class Account{
	private String name;
	private double balance;
	
	public Account(String name, double balance){
		this.name = name;		
		if( balance > 0.0 )
			this.balance = balance;
	}
	
	public void deposit( double depositAmount ){
		if( depositAmount > 0.0 )
			balance = balance + depositAmount;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void setName(String name){
		this.name = name;	
	}
	
	public String getName(){
		return this.name;
	}
	
	public void withdrawal(double valor){
		if( valor >  balance ){
			System.out.printf("Valor de débito excedeu o saldo da conta");
			return;
		}
		balance -= valor;
	}
}