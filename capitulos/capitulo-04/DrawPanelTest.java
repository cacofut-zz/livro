
import javax.swing.JFrame;

public class DrawPanelTest extends JFrame{

	public static void main(String[] args){
		DrawPanel panel = new DrawPanel();
		DesenhoA desenhoA = new DesenhoA();
		DesenhoB desenhoB = new DesenhoB();
		DesenhoC desenhoC = new DesenhoC();
		JFrame application = new JFrame();
				
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(desenhoC);
		application.setSize(250,250);
		application.setVisible(true);
		
	}
}