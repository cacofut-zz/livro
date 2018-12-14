import javax.swing.JFrame;

public class DServerTest{
	
	public static void main(String[] args){
		DServer application = new DServer();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.waitForPackets();
	}
}