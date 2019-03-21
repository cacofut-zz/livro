import java.util.Scanner;

public class Questoes_6_20{

	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args){
		System.out.printf("Digite o valor do raio: ");
		double raio = input.nextDouble();
		System.out.printf("Área do círculo é de %.2f%n", circleArea(raio));
	}
	
	public static double circleArea( double raio ){
		return Math.PI * Math.pow(raio, 2);
	}
}