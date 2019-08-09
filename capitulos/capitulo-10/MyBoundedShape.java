import java.awt.Color;
import java.awt.Graphics;

public abstract class MyBoundedShape extends MyShape {

    private boolean filled;

    public MyBoundedShape(int x1, int y1, int width, int height, Color color, boolean filled) {
        super(x1, y1, (x1 + width), (y1 + height), color);
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

    public int getWidth() {
        return Math.abs(getX1() - getX2());
    }

    public void setWidth(int width) {
        setX2((getX1() + width));
    }

    public int getHeight() {
        return Math.abs(getY1() - getY2());
    }

    public void setHeight(int height) {
        setY2(getY1() + height);
    }

}