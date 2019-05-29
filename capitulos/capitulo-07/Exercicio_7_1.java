import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.Color;

public class Exercicio_7_1{
	public static void main(String[] args){
		JFrame application = new JFrame();
		EspiralQuadrada espiral = new EspiralQuadrada();
		application.add(espiral);
		application.setSize(400,400);
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.setVisible(true);
	}	

}

class EspiralQuadrada extends JPanel{

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		g.setColor(Color.BLACK);
 
		int lineWidth = 20;	
		int width  = getWidth();
		int height = getHeight();
		int ax1 = width / 2;
		int ay1 = height / 2;
		int ax2 = ax1;
		int ay2 = ay1 + lineWidth;
				
		int bx1 = ax1;
		int by1 = ay2;
		int bx2 = bx1 - lineWidth;
		int by2 = ay2;
				
		g.drawLine(ax1, ay1, ax2, ay2);
		g.drawLine(bx1, by1, bx2, by2);
		
		lineWidth += 20;
		
		while( ( bx2 >= 0 && bx2 <= width ) && ( ay2 >= 0 && ay2 <= height ) ){
								
			ax1 = bx2;
			ay1 = by2;
			ax2 = ax1;
			ay2 = ay1 - (lineWidth);
			
			bx1 = ax2;
			by1 = ay2;
			bx2 = bx1 + (lineWidth);
			by2 = by1;
			
			g.drawLine(ax1, ay1, ax2, ay2);
			g.drawLine(bx1, by1, bx2, by2);
			
			lineWidth = (lineWidth < 0) ? Math.abs(lineWidth) + 20 : 
				((lineWidth + 20) * -1);
			
		}

	}
}
