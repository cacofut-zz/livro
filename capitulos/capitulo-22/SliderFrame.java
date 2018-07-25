package br.com.diagnosticit.api;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import br.com.diagnosticit.api.*;

public class SliderFrame extends JFrame{

	
	private final JSlider diameterSlider;
	private final OvalPane myPanel;

	public SliderFrame(){
		super("Slider Demo");

		myPanel = new OvalPane();
		myPanel.setBackground(Color.YELLOW);

		diameterSlider = new JSlider( SwingConstants.HORIZONTAL, 0, 200, 10 );
		diameterSlider.setMajorTickSpacing(10);
		diameterSlider.setPaintTicks(true);

		diameterSlider.addChangeListener( new ChangeListener(){
			@Override
			public void stateChanged( ChangeEvent e ){
				myPanel.setDiameter(diameterSlider.getValue());
			}
		});

		add(diameterSlider, BorderLayout.SOUTH);
		add(myPanel, BorderLayout.CENTER);
	 }

	
}
