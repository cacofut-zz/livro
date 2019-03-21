

public class Questoes_6_16{
	public static void main(String[] args){
		System.out.printf("%b%n", isMultiplo( 12, 3 ));
		System.out.printf("%b%n", isMultiplo( 4, 2 ));
		System.out.printf("%b%n", isMultiplo( 45, 4 ));
		System.out.printf("%b%n", isMultiplo( 57, 5 ));
	}
	
	public static boolean isMultiplo( int a, int b ){		
		return ( a % b == 0 ) ? true : false;
	}
}