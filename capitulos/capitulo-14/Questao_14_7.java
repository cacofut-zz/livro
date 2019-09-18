import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Questao_14_7{

    private static AreaTexto areaTexto = new AreaTexto();

    public static void main(String[] args) {

        
        areaTexto.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        areaTexto.setSize(500,500);
        areaTexto.setVisible(true);

        String sentence = "Where are you from in the United States";
        String[] tokens = sentence.split("\\s+");

        for( String token : tokens ){
            printLatinWord(token);
        }

    }

    private static void printLatinWord(String word){
        char firstLetter = word.charAt(0);
        StringBuilder builder = new StringBuilder(word.substring(1));
        builder.append(firstLetter);
        builder.append("ay");        
        System.out.println(builder.toString());
        areaTexto.appendValueTextArea(builder.toString() + " ");
    }
}

class AreaTexto extends JFrame{

    private JTextArea txtArea1;
    private JTextArea txtArea2;

    AreaTexto(){
        super("Area de Texto");
        txtArea1 = new JTextArea(5, 5);
        txtArea2 = new JTextArea(5, 5);

        add(txtArea1, BorderLayout.SOUTH);
        add(txtArea2, BorderLayout.NORTH);
    }

    public void appendValueTextArea(String text){
        txtArea1.append(text);
    }
}