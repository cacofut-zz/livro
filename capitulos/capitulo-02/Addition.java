import java.util.Scanner;
import javax.swing.JOptionPane;

public class Addition{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		int sum;
		
		System.out.print("Enter first integer: ");
		String number1Txt = JOptionPane.showInputDialog("Enter first integer: ");
		//number1 = input.nextInt();
		number1 = Integer.parseInt(number1Txt);
		
		System.out.print("Enter second integer: ");
		String number2Txt = JOptionPane.showInputDialog("Enter second integer: ");
		//number2 = input.nextInt();
		number2 = Integer.parseInt(number2Txt);    
		
		sum = number1 + number2;
		
		System.out.printf("Sum is %d%n", sum);
		String message = String.format("Sum is %d%n", sum);
		JOptionPane.showMessageDialog(null, message);
	}
}