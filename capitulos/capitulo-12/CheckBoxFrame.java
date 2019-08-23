
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class CheckBoxFrame extends JFrame{

    private final JTextField textField;
    private final JCheckBox boldJTextBox;
    private final JCheckBox italicJTextBox;

    public CheckBoxFrame(){
        super("JCheckBox Test");
        setLayout(new FlowLayout());

        textField = new JTextField("Watch the font style change", 20);
        textField.setFont(new Font("Serif", Font.PLAIN, 14));
        add(textField);

        boldJTextBox = new JCheckBox("Bold");
        italicJTextBox = new JCheckBox("Italic");
        add(boldJTextBox);
        add(italicJTextBox);

        CheckBoxHandler handler = new CheckBoxHandler();
        boldJTextBox.addItemListener(handler);
        italicJTextBox.addItemListener(handler);
        

    }

    private class CheckBoxHandler implements ItemListener{

        @Override
        public void itemStateChanged( ItemEvent event ){

            Font font = null;
            if( boldJTextBox.isSelected() && italicJTextBox.isSelected() ){
                font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
            }
            else if(boldJTextBox.isSelected()){
                font = new Font("Serif", Font.BOLD, 14);
            }
            else if( italicJTextBox.isSelected() ){
                font = new Font("Serif", Font.ITALIC, 14);
            }
            else{
                font = new Font("Serif", Font.PLAIN, 14);
            }

            textField.setFont(font);
        }
    }
}