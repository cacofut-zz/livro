import java.security.SecureRandom;

public class Questoes_6_13{

	private static SecureRandom random = new SecureRandom();
	public static void main(String[] args){
	
		/*
		a) 2, 4, 6, 8, 10
		a) 3, 5, 7, 9, 11
		a) 6, 10, 14, 18, 22		
		*/
		
		
		System.out.printf("%d%n", 2 + 2 * random.nextInt(5));						
		System.out.printf("%d%n", 3 + 2 * random.nextInt(5));
		System.out.printf("%d%n", 6 + 4 * random.nextInt(5));
	}
}