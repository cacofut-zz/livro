import javax.swing.JOptionPane;

public class NameDialog{
	
	public static void main(String[] args){
		String name = JOptionPane.showInputDialog("What is yout name?");
		String message = String.format("Welcome, %s, to Java programming", name);
		JOptionPane.showMessageDialog(null, message);
	}
}