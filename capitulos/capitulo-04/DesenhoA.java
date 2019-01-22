

import javax.swing.JPanel;
import java.awt.Graphics;

public class DesenhoA extends JPanel{
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		System.out.printf("Chamou%n");
		
		int h = getHeight();
		int w = getWidth();				
		int count  = 1;		
		
		int x1 = 0;
		int y1 = 0;
		int x2 = 0;
		int y2 = h;
		while( count <= 15 ){			
			g.drawLine(x1, y1, x2, y2);			
			x2 += 15;
			y2 -= 15;
			count++;
		}
		
	}
}