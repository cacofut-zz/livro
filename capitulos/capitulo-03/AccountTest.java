import java.util.Scanner;

public class AccountTest{

	public static void main(String[] args){
		Scanner input    = new Scanner(System.in);		
		Account account1 = new Account("Cristiano", 50.00);
		Account account2 = new Account("Silvio Luiz", -7.53);
		
		System.out.printf("%s balance: $%.2f %n", account1.getName(), 
			account1.getBalance());
		System.out.printf("%s balance: $%.2f %n", account2.getName(), 
			account2.getBalance());
		
		System.out.println();
		
		System.out.print("Enter deposit amount for account1: ");
		double depositAmount = input.nextDouble();
		
		System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
		account1.deposit(depositAmount);
		
	    System.out.printf("%s balance: $%.2f %n", account1.getName(), 
			account1.getBalance());
		System.out.printf("%s balance: $%.2f %n", account2.getName(), 
			account2.getBalance());
		
		System.out.print("Enter deposit amount for account2: ");
		depositAmount = input.nextDouble();
		                                  
		System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
		account2.deposit(depositAmount);
		
	    System.out.printf("%s balance: $%.2f %n", account1.getName(), 
			account1.getBalance());
		System.out.printf("%s balance: $%.2f %n", account2.getName(), 
			account2.getBalance());
		
		account1.withdrawal(80.00);
		account2.withdrawal(90.00);
	}
}