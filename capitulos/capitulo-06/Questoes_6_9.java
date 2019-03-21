import java.util.Scanner;

public class Questoes_6_9{

	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args){
		
		System.out.printf("Digite um número: ");
		double valor_digitado = input.nextDouble();
		
		System.out.printf("Valor original %f%n", valor_digitado);
		System.out.printf("Valor arredondado %f%n", 
			Math.floor(valor_digitado * 10 + 0.5) / 10 );
		
	}
}