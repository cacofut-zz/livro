import java.util.Scanner;

public class Questoes_6_18{
	
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args){
		
		System.out.printf("Digite o caractere: ");
		char character = input.next().charAt(0);
		System.out.printf("Digite a quantidade: ");
		int quantidade = input.nextInt();
		squareOfAsterisks( quantidade, character );
	}
	
	public static void squareOfAsterisks( int lado, char character ){		
		for( int linha = 0; linha < lado; linha++ ){			
			for( int coluna = 0; coluna < lado; coluna++ )
				System.out.print(character);				
			System.out.println();
		}
	}
}