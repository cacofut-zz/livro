import java.awt.Graphics;

import javax.swing.JPanel;

public class PanelShape extends JPanel {

    MyShape[] shapes;

    public PanelShape(MyShape[] shapes) {
        this.shapes = shapes;
    }

    public MyShape[] getShapes() {
        return shapes;
    }

    public void setShapes(MyShape[] shapes) {
        this.shapes = shapes;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (MyShape currentShape : shapes) {
            currentShape.draw(g);
        }
    }

    

}