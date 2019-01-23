

import javax.swing.JPanel;
import java.awt.Graphics;

public class DesenhoB extends JPanel{
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		int h = getHeight();
		int w = getWidth();
		
		int ax1 = 0;
		int ay1 = 0;
		int ax2 = 0;
		int ay2 = h;
		
		int bx1 = w;
		int by1 = 0;
		int bx2 = 0;
		int by2 = 0;
		
		int cx1 = w;
		int cy1 = h;
		int cx2 = w;
		int cy2 = 0;
		
		int dx1 = 0;
		int dy1 = h;
		int dx2 = w;
		int dy2 = h;
		
		for( int i = 0; i < 15; i++ ){
			g.drawLine(ax1, ay1, ax2, ay2);
			g.drawLine(bx1, by1, bx2, by2);
			g.drawLine(cx1, cy1, cx2, cy2);
			g.drawLine(dx1, dy1, dx2, dy2);
			ax2 += 15;
			ay2 -= 15;     									
			bx2 += 15;  
			by2 += 15;
			cx2 -= 15;
			cy2 += 15;
			dx2 -= 15;
			dy2 -= 15;
			
			
		}
		
		
	}
}