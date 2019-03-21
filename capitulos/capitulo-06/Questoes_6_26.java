import java.util.Scanner;

public class Questoes_6_26{

	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args){
		System.out.printf("Digite um número: ");		
		int numero = input.nextInt();		
		int numero_invertido = inverteNumeros(numero);
		System.out.printf("%nNúmero invertido %d%n", numero_invertido);
	}
	
	public static int inverteNumeros(int numero){
		String numero_texto = numero + "";
		String new_numero_texto = "";
		
		int qtd_caracteres  = numero_texto.length();
		char[] caracteres   = new char[qtd_caracteres];
		numero_texto.getChars(0, qtd_caracteres, caracteres, 0);
		
		for( int i = caracteres.length -1; i >= 0; i-- )
			new_numero_texto += caracteres[i];
				
		return Integer.parseInt(new_numero_texto);
		
	}
}