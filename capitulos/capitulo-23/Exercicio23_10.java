/*
23.10 (Rebatendo a bola) Escreva um programa que faz uma bola azul rebater dentro de um JPanel. A bola deve começar a se mover com
um evento mousePressed. Quando a bola atingir a borda do JPanel, ela deve rebater fora da borda e continuar na direção oposta. A
bola deve ser atualizada com uma interface Runnable.
*/

import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.security.SecureRandom;
import java.awt.Point;

class PanelBola extends JPanel{
	
	private Point point;
	private boolean umavez = true;
	
	public PanelBola(){
		
		this.point = new Point( 0, 0 );
		addMouseListener( new MouseListener(){
				
			@Override
			public void mouseClicked( MouseEvent event ){
			
			}
			
			@Override
			public void mousePressed( MouseEvent event ){
				if( umavez ){
					System.out.printf("\nClicado em [%d, %d]", event.getX(), event.getY());
					umavez = false;
							
					UpdateBola updateBola = new UpdateBola( PanelBola.this );		
					ExecutorService executor = Executors.newCachedThreadPool();
					executor.execute( updateBola );
		
				}
			}
			
			@Override
			public void mouseReleased( MouseEvent event ){
			
			}
			
			@Override
			public void mouseEntered( MouseEvent event ){
				
			}
			
			@Override
			public void mouseExited( MouseEvent event ){
				
			}
			
		});
		
	}
	
	public void setPoint ( Point point ){
		this.point = point;
	}
	
	public Point getPoint(){
		return this.point;
	}
	
	@Override
	public void paintComponent( Graphics g ){
		super.paintComponent(g);
		g.setColor( Color.BLUE );
		g.fillOval( this.point.x, this.point.y, 90, 55 );

	}
			
}

class UpdateBola implements Runnable{
	
	private final PanelBola painelBola;
	//private final Graphics g;
	private static final SecureRandom generator = new SecureRandom();	
	private int count = 0;
	private int max   = 50;
	private boolean trocar;
	private int sinal = 1;
	
	public UpdateBola( PanelBola painelBola ){
		this.painelBola = painelBola; 
	}
	public void run(){		
		try{
			do{
				Thread.sleep( generator.nextInt(400) );				
				count++;
				
				Point point = painelBola.getPoint();
								
				if( point.x >= 450 ){											
					sinal = -1;
				}
				else if( point.x <= 0 ){										
					sinal = 1;
				}
				else{
					sinal = 1;	
				}
				
				Point newPoint = new Point( point.x + count * sinal,0 );
				System.out.println( "newPoint " + newPoint.x);
				painelBola.setPoint( newPoint );
				painelBola.repaint();
					
			}while( count < max );
		}
		catch( InterruptedException ex ){
			Thread.currentThread().interrupt();
		}
	}
	
}

public class Exercicio23_10 extends JFrame{

	private final JPanel panel;
	
	public Exercicio23_10(){
		
		panel = new PanelBola();
		add( panel, BorderLayout.CENTER );
		
		setSize( 500, 500 );
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setVisible(true);

	
	}
	
	public static void main( String[] args ){
		Exercicio23_10 exercicio = new Exercicio23_10();
	}
}