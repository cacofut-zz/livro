package br.com.diagnosticit.api;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.ButtonGroup;

public class PopupFrame extends JFrame{

	private final JRadioButtonMenuItem[] items;
	private final Color[] colorValues = {Color.BLUE, Color.YELLOW, Color.RED};
	private final JPopupMenu popupMenu;

	public PopupFrame(){

		super("Using JPopupMenu");
		String[] colors = {"Blue", "Yellow", "Red"};
		ButtonGroup colorGroup = new ButtonGroup();
		popupMenu = new JPopupMenu();
		items     = new JRadioButtonMenuItem[colors.length];
		
			
		ActionListener itemHandler = e -> {
			for( int i = 0; i < items.length; i++ ){
				if( e.getSource() == items[i] ){
					getContentPane().setBackground(colorValues[i]);
				}// fim if
			}//fim for
		};

		for( int count = 0; count < items.length; count++ ){
			items[count] = new JRadioButtonMenuItem(colors[count]);
			popupMenu.add(items[count]);
			colorGroup.add( items[count] );
			items[count].addActionListener( itemHandler );
		}

		setBackground(Color.WHITE);

		addMouseListener(new MouseAdapter(){
			
			@Override
			public void mousePressed(MouseEvent event){
				checkTriggerEvent(event);
			}

			@Override
			public void mouseReleased(MouseEvent event){
				checkTriggerEvent(event);
			}

			private void checkTriggerEvent(MouseEvent event){
				if(event.isPopupTrigger())
					popupMenu.show(event.getComponent(), event.getX(), event.getY());
			}	

		});

		
	}
}
