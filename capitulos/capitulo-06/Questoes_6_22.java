import java.util.Scanner;

public class Questoes_6_22{
	
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args){
		System.out.printf("%nDigite o valor em celsius: ");
		int celsius = input.nextInt();
		System.out.printf("%nValor convertido para fahrenheit: %f", 
			celsiusToFahrenheit(celsius));
		
		System.out.printf("%nDigite o valor em fahrenheit: ");
		int fahrenheit = input.nextInt();
		System.out.printf("%nValor  para celsius: %f", 
			fahrenheitToCelsius(fahrenheit));
	}
	
	public static double fahrenheitToCelsius( int fahrenheit ){
		return (5.0 / 9.0) * ( fahrenheit - 32 );
	}
	
	public static double celsiusToFahrenheit( int celsius ){
		return 9.0 / 5.0 * celsius + 32;
	}
}