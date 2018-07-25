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

	private final Color[] colorValues = { Color.BLACK, Color.BLUE, Color.RED, Color.GREEN };
	private final JRadioButtonMenuItem[] colorItems;
	private final JRadioButtonMenuItem[] fonts;
	private final JCheckBoxMenuItem[] styleItems;
	private final JLabel displayLabel;
	private final ButtonGroup fontButtonGroup;
	private final ButtonGroup colorButtonGroup;
	
	public MenuFrame(){
		super("Using JMenus");
		
		JMenu fileMenu = new JMenu("File");
		fileMenu.setMnemonic('F');
		
		JMenuItem aboutItem = new JMenuItem("About...");
		aboutItem.setMnemonic('A');
	
	}
}