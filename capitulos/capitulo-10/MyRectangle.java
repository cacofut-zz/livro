import java.awt.Color;
import java.awt.Graphics;

public class MyRectangle extends MyBoundedShape {
    
    public MyRectangle() {
        super(0, 0, 0, 0, Color.BLACK, false);        
    }

    public MyRectangle(int x1, int y1, int width, int height, Color color, boolean filled) {
        super(x1, y1, width, height, color, filled);
    }   

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        if(getFilled()){
            g.fillRect(getX1(), getY1(), getX2(), getY2());
            return;
        }        
        g.drawRect(getX1(), getY1(), getX2(), getY2());
    }

        
}