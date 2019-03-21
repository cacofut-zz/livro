

public class Questoes_6_15{
	
	public static void main(String[] args){
		
		System.out.printf("Hipotenusa: %.2f%n", hypotenuse(3.0, 4.0));
		System.out.printf("Hipotenusa: %.2f%n", hypotenuse(5.0, 12.0));
		System.out.printf("Hipotenusa: %.2f%n", hypotenuse(8.0, 15.0));
		System.out.printf("Hipotenusa: %.2f%n", hypotenuse(9.0, 12.0));
	}
	
	public static double hypotenuse( double lado_a, double lado_b ){
		return Math.sqrt( Math.pow(lado_a, 2) + Math.pow(lado_b, 2) );
	}
}