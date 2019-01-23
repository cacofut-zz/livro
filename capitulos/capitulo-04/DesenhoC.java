
import javax.swing.JPanel;
import java.awt.Graphics;

public class DesenhoC extends JPanel{

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		int width   = getWidth();
		int height  = getHeight();
		int limite  = 15;
		int espacoX =  width / limite;
		int espacoY =  height / limite;
		
		int ax1 = 0;
		int ay1 = 0;
		int ax2 = espacoX;
		int ay2 = height;
	    
		int bx1 = 0;
		int by1 = height;
		int bx2 = espacoX;
		int by2 = 0;
		
		int cx1 = width;
		int cy1 = height;
		int cx2 = width - espacoX;
		int cy2 = 0;
		
		int dx1 = width;
		int dy1 = 0;
		int dx2 = width - espacoX;
		int dy2 = height;
		
		System.out.printf("%n%n");
		do{
			g.drawLine(ax1, ay1, ax2, ay2);
			g.drawLine(bx1, by1, bx2, by2);
			g.drawLine(cx1, cy1, cx2, cy2);
			g.drawLine(dx1, dy1, dx2, dy2);
			
			ay1 += espacoY;
			ax2 += espacoX;	
			
			by1 -= espacoY;
			bx2 += espacoX;
			
			cy1 -= espacoY;
			cx2 -= espacoX;
			
			dy1 += espacoY;
			dx2 -= espacoX;
			
		}while( ax2 <= width ); 

	}
}