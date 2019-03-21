import java.security.SecureRandom;

public class RandomIntegers{
	
	public static void main(String[] args){
	
		SecureRandom randomNumbers = new SecureRandom();
		
		for( int count = 1; count <= 20; count++ ){
			int face = 1 + randomNumbers.nextInt(6);
			System.out.printf("%d ", face);
			
			if(count % 5 == 0)
				System.out.println();
		}
	}
}