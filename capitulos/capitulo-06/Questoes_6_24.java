import java.util.Scanner;
import java.util.ArrayList;

public class Questoes_6_24{
	
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args){
		
		for( int i = 1; i <= 1000000; i++ ){
			
			if( isPerfect(i) ){
				System.out.printf("%nO número %d %s um número perfeito%n%n", i, "é");
			}
			
		}
		
	}
	
	public static boolean isPerfect( int valor ){
		
		ArrayList<Integer> fatores = new ArrayList<>(); 
			
		for( int i = (valor - 1); i > 1; i-- ){
			if( valor % i == 0 )				
				fatores.add(i);			
		}
		
		int soma = 0;
		for( Integer fator : fatores ){
			soma += fator;
		}		
		soma += 1;
				
		if( (soma == valor) && soma > 1  ){
			System.out.printf("fatores: ");
			for( Integer fator : fatores ){				
				System.out.printf("%d ", fator);				
			}
			return true;
		}
		return false;
		
			
	}
}