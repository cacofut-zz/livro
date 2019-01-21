

public class EmpregadoTest{
	
	public static void main(String[] args){
		
		Empregado emp1 = new Empregado("Cristiano", "Carvalho", 1200.00);
		Empregado emp2 = new Empregado("Vanessa", "Carvalho", 1600.00);
		
		System.out.printf("Salário anual emp1: %.2f%n", 
			emp1.getSalarioMensal() * 12);
		System.out.printf("Salário anual emp2: %.2f%n", 
			emp2.getSalarioMensal() * 12);
		
		double novoSalario = emp1.getSalarioMensal() + 
			( emp1.getSalarioMensal() * 10 / 100 );			
		emp1.setSalarioMensal(novoSalario);
		
		novoSalario = emp2.getSalarioMensal() + 
			( emp2.getSalarioMensal() * 10 / 100 );	
		
		emp2.setSalarioMensal(novoSalario);
		
		System.out.printf("Salário anual emp1 com aumento de 10 porcento: %.2f%n", 
			emp1.getSalarioMensal() * 12);
		System.out.printf("Salário anual emp2 com aumento de 10 porcento: %.2f%n", 
			emp2.getSalarioMensal() * 12);
	}
}