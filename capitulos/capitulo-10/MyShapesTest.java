import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Label;
import java.awt.Panel;
import java.lang.reflect.Constructor;
import java.security.SecureRandom;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyShapesTest{

    private static Scanner input = new Scanner(System.in);
    private static SecureRandom randomNumbers = new SecureRandom();

    public static void main(String[] args) throws ClassNotFoundException {
        
        String[] clazzNames = { "MyLine", "MyRectangle", "MyOval" };
        int[] contadores = {0, 0, 0};

        System.out.print( "Type the amount: ");
        int qtdShapes    = input.nextInt();
        MyShape[] shapes = new MyShape[qtdShapes];

        for( int i = 0; i < qtdShapes; i++ ){
            int random   = randomNumbers.nextInt(clazzNames.length);
            String clazz = clazzNames[random];

            int x1 = 100 + randomNumbers.nextInt(300);
            int y1 = 50 + randomNumbers.nextInt(300);
            int x2 = 100 + randomNumbers.nextInt(300);
            int y2 = 50 + randomNumbers.nextInt(300);
            Color color = new Color(1 + randomNumbers.nextInt(255), 1 + 
                randomNumbers.nextInt(255), 1 + randomNumbers.nextInt(255));

            switch (clazz) {
                case "MyLine":
                    shapes[i] = new MyLine(x1, y1, x2, y2, color);
                    contadores[0]++;
                    break;
                case "MyRectangle":
                    shapes[i] = new MyRectangle(x1, y1, Math.abs(x1 - x2), Math.abs(y1 - y2), color, false);
                    contadores[1]++;
                    break;
                case "MyOval":
                    shapes[i] = new MyOval(x1, y1, Math.abs(x1 - x2), Math.abs(y1 - y2), color, true);
                    contadores[2]++;
                    break;
                default:
                    break;

            }
            
        }

        
        JPanel panelLabel = new JPanel();
        for (int i = 0; i < contadores.length; i++){
            String text = String.format("%s tem %d %s", 
                clazzNames[i], contadores[i], (contadores[i] > 1) ? "formas" : "forma");
            panelLabel.add(new Label(text), BorderLayout.SOUTH);
        }

        PanelShape panel = new PanelShape(shapes);

        
        JFrame application = new JFrame();
        application.setSize(800, 600);
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel, BorderLayout.CENTER);
        application.add(panelLabel, BorderLayout.SOUTH);
        application.setVisible(true);
    }
}