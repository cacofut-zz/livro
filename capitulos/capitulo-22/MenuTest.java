import javax.swing.JFrame;
import br.com.diagnosticit.api.MenuFrame;

public class MenuTest{
	
	public static void main(String[] args){
		
		MenuFrame menuFrame = new MenuFrame();
		menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menuFrame.setSize(500, 200);
		menuFrame.setVisible(true);
	}
}
