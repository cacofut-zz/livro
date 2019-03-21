import java.util.Scanner;

public class Questoes_6_23{
	
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args){
		System.out.printf("%nDigite o primeiro n°: ");
		double a = input.nextDouble();
		System.out.printf("%nDigite o segundo n°: ");
		double b = input.nextDouble();
		System.out.printf("%nDigite o terceiro n°: ");
		double c = input.nextDouble();
		
		System.out.printf("%nO menor número é: %f", minimo3(a, b, c));
	}
	
	public static double minimo3( double a, double b, double c ){
		return Math.min( a, Math.min(b, c) );
	}
}