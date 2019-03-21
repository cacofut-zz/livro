

public class Questoes_6_17{
	public static void main(String[] args){
	
		System.out.printf("%b%n", isEven(3));
		System.out.printf("%b%n", isEven(0));
		System.out.printf("%b%n", isEven(1));
		System.out.printf("%b%n", isEven(2));
		System.out.printf("%b%n", isEven(4));
		System.out.printf("%b%n", isEven(89));
	}
	
	public static boolean isEven(int a){
		return (a % 2 == 0) ? true : false;
	}
}