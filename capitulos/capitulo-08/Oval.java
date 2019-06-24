
import java.awt.Graphics;

public class Oval extends Shape{
	
	public Oval(int x1, int y1, int x2, int y2){
		super(x1, y1, x2, y2);
	}
	
	public void draw(Graphics g){
		g.drawOval(getUpperLeftX(), getUpperLeftY(), 
		getWidth(), getHeight());
	}
	
}