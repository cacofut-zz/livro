import java.security.SecureRandom;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class Exercicio_6_1{

	public static void main(String[] args){
		DrawCircleColorRandom panel = new DrawCircleColorRandom();
		JFrame application = new JFrame();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(600,600);
		application.setVisible(true);
	}
}

class DrawCircleColorRandom extends JPanel{
	
	private SecureRandom randomNumbers = new SecureRandom();
	
	public void paintComponent(Graphics graphics){	
		super.paintComponent(graphics);
		int width  = getWidth();
		int height = getHeight();
		
		int halfX  = width / 2;
		int halfY  = height / 2;
		
		int oval_width  = 30;
		int oval_height = 30;
		
		for( int i = 5; i >= 1; i-- ){
			
			int r = randomNumbers.nextInt(255);
			int g = randomNumbers.nextInt(255);
			int b = randomNumbers.nextInt(255);

			System.out.printf("oval width %d %n", oval_width * i);
			System.out.printf("oval height %d %n", oval_height * i);
			graphics.setColor(new Color(r,g,b));
			graphics.fillOval( 
				(halfX - ((oval_width  * i ) / 2)), 
				(halfX - ((oval_height * i ) / 2)), 
				oval_width * i, 
				oval_height * i
			);
			
			
		}
		
	}
}