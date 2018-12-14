import javax.swing.JFrame;

public class DClientTest{
	
	public static void main(String[] args){
		DClient application = new DClient();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.waitForPackets();
	}
}