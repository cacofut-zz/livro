import java.util.Scanner;

public class Questoes_6_28{
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args){
		System.out.printf("Digite a média: ");
		double media = input.nextDouble();
		System.out.printf("%nO peso da nota é %d", qualityPoints(media));
	}
	
	public static int qualityPoints(double media){	
		if( media >= 90 && media <= 100 ) return 4;
		else if(media >= 80 && media <= 89) return 3;
		else if(media >= 70 && media <= 79) return 2;
		else if(media >= 60 && media <= 69) return 1;
		else return 0;
	}
}