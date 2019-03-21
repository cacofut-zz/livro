import java.util.Scanner;

public class Questoes_6_10{
	
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args){
		
		System.out.printf("Digite o valor de x: ");
		double x = input.nextDouble();
		//double y = Math.floor(x * 10 + 0.5) / 10;
		
		System.out.printf("%nValor original : %f%n", x);
		System.out.printf("%nValor arredondado : %f%n", roundTo(x, 1));
		System.out.printf("%nValor décimo mais próximo : %f%n", roundTo(x, 1));
		System.out.printf("%nValor centésimo mais próximo : %f%n", roundTo(x, 2));
		System.out.printf("%nValor milésimo mais próximo : %f%n", roundTo(x, 3));
	}
	
	public static double roundTo(double valor, int qtd_casas_decimais){
		int base = (int) Math.pow( 10, qtd_casas_decimais );		
		return Math.floor(valor * base + 0.5) / base;		
	}
}