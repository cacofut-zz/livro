import java.awt.Color;
import java.awt.Graphics;

public class MyRectangle extends MyShape {

    private boolean filled;

    public MyRectangle() {
        super(0, 0, 0, 0, Color.BLACK);
        this.filled = false;
    }

    public MyRectangle(int x1, int y1, int width, int height, Color color, boolean filled) {
        super(x1, y1, width, height, color);
        this.filled = filled;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public boolean getFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillRect(getX1(), getY1(), getX2(), getY2());
        g.drawRect(getX1(), getY1(), getX2(), getY2());
    }

        
}