import java.util.Scanner;

public class Questoes_6_27{

	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args){
		System.out.printf("%nDigite o 1� n�mero: ");
		int a = input.nextInt();
		System.out.printf("%nDigite o 2� n�mero: ");
		int b = input.nextInt();
		
		System.out.printf("M�ximo divisor comum de %d e %d � %d", 
			a, b, mdc(a, b));
	}
	
	public static int mdc( int a, int b ){		
		while( b != 0 ){
			int r = a % b;
			a = b;
			b = r;
		}		
		return a;
	}
}