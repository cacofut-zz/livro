import java.util.Scanner;

public class Questoes_6_32{

	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args){
		System.out.printf("Digite a coordenada xa: ");
		double xa = input.nextDouble();
		System.out.printf("Digite a coordenada ya: ");
		double ya = input.nextDouble();
		System.out.printf("Digite a coordenada xb: ");
		double xb = input.nextDouble();
		System.out.printf("Digite a coordenada yb: ");
		double yb = input.nextDouble();
		
		System.out.printf( "%nA distância entre os pontos é de %f", 
			distance( xa, ya, xb, yb ));
	}
	
	public static double distance( double xa, double ya, double xb, double yb ){
		return Math.sqrt( Math.pow( (xb - xa), 2 ) + Math.pow( (yb - ya), 2));
	}
}