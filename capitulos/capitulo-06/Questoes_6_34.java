import java.util.Scanner;

public class Questoes_6_34{
	
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args){
		System.out.printf("%-10s%-10s%-10s%n", "Decimal", "Binário", "Hexadecimal");
		/*for( int i = 1; i <= 256; i++ ){
			System.out.printf("%-10d%-10s%-10s%n", i, 
				decimalToBinario(i), 
				decimalToHexadecimal(i));
		}	*/
		int decimal = input.nextInt();
		System.out.println(decimalToOctal(decimal));
	}
	
	public static String decimalToBinario(int decimal){	
		StringBuilder builder = new StringBuilder();
		auxDecimal(decimal, builder);
		return builder.toString();
	}
		
	public static void auxDecimal(int decimal, StringBuilder builder){				
		int quociente = decimal / 2;
		int resto     = decimal % 2;
		if( quociente == 0 ){
			builder.append(resto);			
			return;
		}	
		auxDecimal(quociente, builder);
		builder.append(resto);		
		
	}
	
	public static String decimalToHexadecimal(int decimal){
		StringBuilder builder = new StringBuilder();
		auxHexadecimal(decimal, builder);
		return builder.toString();
	}
	
	public static void auxHexadecimal(int decimal, StringBuilder builder){
		int divisor     = 16;
		int quociente   = decimal / divisor;
		int resto       = decimal % divisor;		
		if( decimal < divisor ){
			builder.append(getCaractereHexadecinal(decimal));
			return;	
		}			
		if( quociente < divisor ){
			builder.append(getCaractereHexadecinal(quociente));
			builder.append(getCaractereHexadecinal(resto));
			return;
		}		
		auxHexadecimal(quociente, builder);		
		builder.append(getCaractereHexadecinal(resto));		
	}
	
	public static String getCaractereHexadecinal( int resto ){
		String caractere = "";
		if( resto > 9 )
			switch(resto){
				case 10 : caractere = "A"; break;
				case 11 : caractere = "B"; break;
				case 12 : caractere = "C"; break;
				case 13 : caractere = "D"; break;
				case 14 : caractere = "E"; break;
				case 15 : caractere = "F"; break;											
			}
		else
			caractere = "" + resto;
		
		return caractere;
	}
	
	public static String decimalToOctal( int decimal ){
		StringBuilder builder = new StringBuilder();
		auxOctal(decimal, builder);
		return builder.toString();
	}
	
	public static void auxOctal(int decimal, StringBuilder builder){
		int divisor = 8;
		int quociente = decimal / divisor; // 12, 1
		int resto     = decimal % divisor // 5, 4
		
		if( decimal < divisor ){
			builder.append(decimal);
			return;		
		}
		if( quociente < divisor ){
			builder.append(quociente);
			builder.append(resto);
			return;
		}				
		auxOctal(quociente, builder);
	}
	
}