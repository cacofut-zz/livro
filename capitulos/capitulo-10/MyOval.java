import java.awt.Color;
import java.awt.Graphics;



public class MyOval extends MyBoundedShape {

    public MyOval() {
        super(0, 0, 0, 0, Color.BLACK, false);
    }

    public MyOval(int x1, int y1, int width, int height, Color color, boolean filled){
        super(x1, y1, width, height, color, filled);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        if(getFilled()){
            g.fillOval(getX1(), getY1(), getWidth(), getHeight());
            return;
        }
        g.drawOval(getX1(), getY1(), getWidth(), getHeight());

    }

    
}