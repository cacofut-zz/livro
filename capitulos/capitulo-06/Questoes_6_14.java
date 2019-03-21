

public class Questoes_6_14{

	public static void main(String[] args){
		System.out.println(Math.pow(2,3));
		System.out.println(Math.pow(4,3));
		System.out.println(Math.pow(3,5));
		System.out.println();
		System.out.println(integerPower(2,3));
		System.out.println(integerPower(4,3));
		System.out.println(integerPower(3,5));
	}
	
	public static int integerPower(int base, int expoente){		
		int resultado = base;
		for( int i = 1; i < expoente; i++ )
			resultado *= base;
		
		return resultado;
	}
}