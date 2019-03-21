import java.security.SecureRandom;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Exercicio_6_2{
	
	public static void main(String[] args){
		DrawCircle panel = new DrawCircle();
		JFrame application = new JFrame();
		application.add(panel);
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.setSize(600,600);
		application.setVisible(true);
		
	}

}

class DrawCircle extends JPanel{
	
	private SecureRandom randomNumbers = new SecureRandom();
	private boolean toggleCircle = false;
	
	public void paintComponent( Graphics graphics ){
			
		int width  = getWidth();
		int height = getHeight();
						
		for( int i = 1; i <= 10; i++ ){
			
			int r = randomNumbers.nextInt(255);
			int g = randomNumbers.nextInt(255);
			int b = randomNumbers.nextInt(255);
			Color color = new Color(r,g,b);
			graphics.setColor(color);
			
			int randomX = randomNumbers.nextInt(width);
			int randomY = randomNumbers.nextInt(height);
			int randomW = randomNumbers.nextInt((width  / 2));
			int randomH = randomNumbers.nextInt((height / 2));
								
			if(toggleCircle){
				graphics.fillOval(randomX,randomY,randomW,randomH);
			}
			else{
				graphics.fillRect(randomX,randomY,randomW,randomH);
			}
			
			toggleCircle = !toggleCircle;
		}
	}
	
}