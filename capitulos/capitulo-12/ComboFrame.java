
import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.ItemEvent;

public class ComboFrame extends JFrame{

    private static final long serialVersionUID = 1L;

    private final JComboBox<String> imagesJComboBox;
    private final JLabel label;


    private static final String[] names = {
        "bug1.png", "bug2.png","bug3.png","bug4.png"
    };

    private final Icon[] icons = {
        new ImageIcon(getClass().getResource(names[0])),
        new ImageIcon(getClass().getResource(names[1])),
        new ImageIcon(getClass().getResource(names[2])),
        new ImageIcon(getClass().getResource(names[3]))
    };

    public ComboFrame(){
        super("Testing JComboBox");
        setLayout(new FlowLayout());

        imagesJComboBox = new JComboBox<String>(names);
        imagesJComboBox.setMaximumRowCount(3);
        
        imagesJComboBox.addItemListener(
            new ItemListener(){

                @Override
                public void itemStateChanged(ItemEvent event){
                    if( event.getStateChange() == ItemEvent.SELECTED ){
                        label.setIcon( icons[imagesJComboBox.getSelectedIndex()] );
                    }
                }
            }
        );

        add(imagesJComboBox);
        label = new JLabel(icons[0]);
        add(label);

    }

}