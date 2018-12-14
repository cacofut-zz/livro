import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

public class ReadServerFile extends JFrame{
	private JTextField enterField;
	private JEditorPane contentsArea;
	
	public ReadServerFile(){
		super("Simple Web Browser");
		
		enterField = new JTextField("Enter file URL here");
		enterField.addActionListener( e -> {
				getThePage(e.getActionCommand());
		});
		
		add(enterField, BorderLayout.NORTH);
		
		contentsArea = new JEditorPane();
		contentsArea.setEditable(false);
		contentsArea.addHyperlinkListener( he -> {
				if( he.getEventType() == HyperlinkEvent.EventType.ACTIVATED )
					getThePage(he.getURL().toString());
		});
		
		add(new JScrollPane(contentsArea), BorderLayout.CENTER);
		setSize(400, 300);
		setVisible(true);
	}
	
	private void getThePage(String location){
		try{
			contentsArea.setPage(location);
			enterField.setText(location);
		}
		catch(IOException ioException){
			JOptionPane.showMessageDialog(this, 
				"Error retrieving specified URL", "Bad URL", JOptionPane.ERROR_MESSAGE);
		}
	}
	
}