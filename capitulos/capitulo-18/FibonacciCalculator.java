import java.math.BigInteger;

public class FibonacciCalculator{

	public static final BigInteger TWO = BigInteger.valueOf(2);
	public static void main(String[] args){
		
		for( int i = 0; i <= 40; i++ ){
			System.out.printf("\nfibonacci of %d = %d\n", i, fibonacci(BigInteger.valueOf(i)));
		}
				
	}

	public static BigInteger fibonacci( BigInteger numero ){
		
		if( numero.equals(BigInteger.ZERO) || numero.equals(BigInteger.ONE ) )
			return numero;
		else
			return fibonacci( numero.subtract(BigInteger.ONE))
				.add( fibonacci(numero.subtract(TWO)));
	}

}
