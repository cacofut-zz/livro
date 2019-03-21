import java.util.Scanner;

public class Questoes_6_25{

	private static Scanner input = new Scanner(System.in);
	private static int count = 0;
	
	public static void main(String[] args){

		
		for(int i = 0; i < 10000; i++){
			if(isPrimo(i)){
				System.out.printf("%nO número %d %s primo.", i, "é");
			}
		}
		
		System.out.printf("Foram testados %d números.", count);
		
	}
	
	public static boolean isPrimo(int numero){
		int limite = (int)Math.ceil(Math.sqrt(numero));		
		if( numero <= 1 )
			return false;
		for( int i = 2; i <= limite; i++){
			if( numero % i == 0 ){
				count++;
				return false;	
			}			
		}
		
		return true;
		
	}
}