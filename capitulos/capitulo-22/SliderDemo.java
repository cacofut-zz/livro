import javax.swing.JFrame;
import br.com.diagnosticit.api.SliderFrame;

public class SliderDemo{

	public static void main( String[] args ){
		
		SliderFrame sliderFrame = new SliderFrame();
		sliderFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		sliderFrame.setSize(200,270);
		sliderFrame.setVisible(true);
	}
}
