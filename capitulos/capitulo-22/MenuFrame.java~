package br.com.diagnosticit.api;

import java.awt.Color;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;

public class MenuFrame extends JFrame{

	
	private final Color[] colorsValue = { Color.BLACK, Color.BLUE, Color.RED, Color.GREEN };
	private final JRadioButtonMenuItem[] colorItems;
	private final JRadioButtonMenuItem[] fonts;
	private final JCheckBoxMenuItem[] styleItems;
	private final JLabel displayLabel;
	private final ButtonGroup fontButtonGroup;
	private final ButtonGroup colorButtonGroup;

	private int style;
	
	public MenuFrame(){
	
		super("Using JMenus");
		String[] fontNames  = {"Serif", "Monospaced", "SansSerif"};
		String[] colors     = {"Black","Blue","Red","Green"};
		String[] styleNames = {"Bold", "Italic"};

		JMenuBar bar        = new JMenuBar();

		JMenu fileMenu      = new JMenu("File");
		JMenu formatMenu    = new JMenu("Format");
		JMenu colorMenu     = new JMenu("color");
		JMenu fontMenu      = new JMenu("Font");
					
		JMenuItem aboutItem = new JMenuItem("About...");
		JMenuItem exitItem  = new JMenuItem("Exit");
		
		colorItems          = new JRadioButtonMenuItem[colors.length];
		fonts               = new JRadioButtonMenuItem[fontNames.length];

		colorButtonGroup    = new ButtonGroup();
		fontButtonGroup     = new ButtonGroup();

		displayLabel        = new JLabel("Sample Text", SwingConstants.CENTER);

		styleItems	    = new JCheckBoxMenuItem[styleNames.length];
				
		ActionListener itemHandler = e -> {
			for(int i = 0; i < colorItems.length; i++){
				if(colorItems[i].isSelected()){
					displayLabel.setForeground(colorsValue[i]);
					break;
				}//fim if
			}//fim for
	
			for(int j = 0; j < fonts.length; j++){
				if( e.getSource() == fonts[j] ){
					displayLabel.setFont(new Font(fonts[j].getText(), style, 72));
				}// fim if
			}//fim for	
			repaint();
		};

		aboutItem.addActionListener( 
			e -> JOptionPane.showMessageDialog(this, 
				"This is an exemplo\nof using menus", "About", JOptionPane.PLAIN_MESSAGE));

		exitItem.addActionListener( e -> System.exit(0) );

		exitItem  .setMnemonic('x');
		formatMenu.setMnemonic('r');
		colorMenu .setMnemonic('c');
		fileMenu  .setMnemonic('F');
		aboutItem .setMnemonic('A');
		fontMenu  .setMnemonic('n');

				
		
		displayLabel.setForeground(colorsValue[0]);
		displayLabel.setFont(new Font("Serif", Font.PLAIN, 72));

		for( int count = 0; count < colors.length; count++ ){
			colorItems[count] = new JRadioButtonMenuItem(colors[count]);
			colorMenu.add(colorItems[count]);
			colorButtonGroup.add(colorItems[count]);
			colorItems[count].addActionListener( itemHandler );	
		}// fim for
				
		
		for(int count = 0; count < styleNames.length; count++){
			styleItems[count] = new JCheckBoxMenuItem(styleNames[count]);
			fontMenu.add( styleItems[count] );
			styleItems[count].addItemListener(e->{
				String name = displayLabel.getFont().getName();
				Font font;

				if(styleItems[0].isSelected() && styleItems[1].isSelected())
					font = new Font(name, Font.BOLD + Font.ITALIC, 72);
				else if(styleItems[0].isSelected())
					font = new Font(name, Font.BOLD, 72);
				else if(styleItems[1].isSelected())
					font = new Font(name, Font.ITALIC, 72);
				else
					font = new Font(name, Font.PLAIN, 72);

				displayLabel.setFont(font);
				repaint();
			});	
		}
								
		for(int count = 0; count < fontNames.length; count++){
			fonts[count] = new JRadioButtonMenuItem(fontNames[count]);
			fontMenu.add(fonts[count]);
			fontButtonGroup.add(fonts[count]);
			fonts[count].addActionListener( itemHandler );
		}
	
		colorItems[0].setSelected(true);

		fileMenu  .add(exitItem);
		fileMenu  .add(aboutItem);

		formatMenu.add(colorMenu);
		formatMenu.addSeparator();
		formatMenu.add(fontMenu);
				
		
		bar.add(fileMenu);
		bar.add(formatMenu);

		setJMenuBar(bar);
		
		getContentPane().setBackground(Color.CYAN);
		add(displayLabel, BorderLayout.CENTER);

	}
	


}

