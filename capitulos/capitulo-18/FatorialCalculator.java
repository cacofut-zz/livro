import java.math.BigInteger;

public class FatorialCalculator{

	public static void main(String[] args){

		for( int i = 0; i <= 50; i++ ){
			System.out.printf( "\n%d! = %d\n", i, fatorial(BigInteger.valueOf(i)));
		}
		
	}

	public static BigInteger fatorial( BigInteger numero ){
		if( numero.compareTo(BigInteger.ONE) <= 0 )
			return BigInteger.ONE;
		else
			return numero.multiply(fatorial( numero.subtract(BigInteger.ONE)));
	}
}
