package br.com.diagnosticit.api;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.security.SecureRandom;


public class DesktopFrame extends JFrame{
	
	private final JDesktopPane theDesktop;

	public DesktopFrame(){
		
		super("Using a JDesktopPane");
		JMenuBar bar  = new JMenuBar();
		JMenu addMenu = new JMenu("Add");
		JMenuItem newFrame = new JMenuItem("Internal Frame");

		addMenu.add(newFrame);
		bar.add(addMenu);
		setJMenuBar(bar);

		theDesktop = new JDesktopPane();
		add(theDesktop);

		newFrame.addActionListener( e -> {
			JInternalFrame frame = new JInternalFrame(
				"Internal Frame", true, true,true, true	);

			MyJPanel panel = new MyJPanel();
			frame.add(panel, BorderLayout.CENTER);
			frame.pack();

			theDesktop.add(frame);
			frame.setVisible(true);
			
		});		
		
	}


}

class MyJPanel extends JPanel{

	private static final SecureRandom generator = new SecureRandom();
	private final ImageIcon picture;
	private static final String[] images = {
		"image1.jpeg","image2.jpeg",
		"image3.jpeg","image4.jpeg"
	};

	public MyJPanel(){
		int randomNumber = generator.nextInt(images.length);
		picture = new ImageIcon(images[randomNumber]);		
	}

	@Override
	public void paintComponent( Graphics g ){
		super.paintComponent(g);
		picture.paintIcon(this, g, 0, 0);
	}

	public Dimension getPreferredSize(){
		return new Dimension(
			picture.getIconWidth(), 
			picture.getIconHeight());
	}
}











