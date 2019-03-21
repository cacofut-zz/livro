import java.util.Scanner;

public class Questoes_6_21{
	
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args){
		System.out.printf("Digite uma sequência de números: ");
		int valor = input.nextInt();
		displayDigits(valor);	
	}
	
	public static int divisaoInteira(int a, int b){
		return a/b;	
	}
	
	public static int restoInteiro(int a, int b){
		return a % b;
	}
	
	public static int integerPower(int base, int expoente){		
		int resultado = base;
		for( int i = 1; i < expoente; i++ )
			resultado *= base;
		
		return resultado;
	}
	
	public static void displayDigits(int value){
		
		String text_value  = "" + value;
		int qtd_caracteres = text_value.length();
		
		if( qtd_caracteres == 1 ){
			System.out.print( value + " " );
			return;
		}
		
		int divisor = integerPower(10, (qtd_caracteres - 1));
	    int inteiro = divisaoInteira(value, divisor);
	    int resto   = restoInteiro(value, divisor);
		
	    System.out.print( inteiro + " | " );
	    displayDigits(resto);
	    
	}
}