import java.security.SecureRandom;

public class Questoes_6_12{

	private static SecureRandom randomNumbers = new SecureRandom();
	public static void main(String[] args){
		
		System.out.printf("1 <= n <= 2 -> %d%n", 1 + randomNumbers.nextInt(2));
		System.out.printf("1 <= n <= 100 -> %d%n", 1 + randomNumbers.nextInt(100));
		System.out.printf("0 <= n <= 9 -> %d%n", randomNumbers.nextInt(9));
		System.out.printf("1000 <= n <= 1112 -> %d%n", 1000 + randomNumbers.nextInt(112));
		System.out.printf("-1 <= n <= 1 -> %d%n",  (-1) + randomNumbers.nextInt(3));
		System.out.printf("-3 <= n <= 11 -> %d%n", (-3) + randomNumbers.nextInt(15));
		
	}

}