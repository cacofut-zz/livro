import javax.swing.JFrame;
import br.com.diagnosticit.api.LookAndFeelFrame;

public class LookAndFeelDemo{

	public static void main(String[] args){
		
		LookAndFeelFrame lookAndFeelFrame = new LookAndFeelFrame();
		lookAndFeelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lookAndFeelFrame.setSize(400,220);
		lookAndFeelFrame.setVisible(true);

	}
}
