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
import java.util.List;
import java.util.ArrayList;
import java.security.SecureRandom;
import java.awt.Point;

class ColorPoint{
	
	public Point point;
	public Point pointShadom;
	public Color color;
	public int width;
	public int height;
	
	public ColorPoint( Point point, Point pointShadom, Color color, int width, int height ){
		this.point = point;
		this.pointShadom = pointShadom;
		this.color  = color;
		this.width  = width;
		this.height = height;
	}
}

class PanelBola extends JPanel{
	
	private Point point;
	private boolean umavez = true;
	private int qtdBolas   = 0;
	private List<ColorPoint> colorPoint;
	
	private static final SecureRandom generate = new SecureRandom();
	
	public PanelBola(){
		
		this.point = new Point( 0, 0 );
		colorPoint = new ArrayList<>();

		addMouseListener( new MouseListener(){
				
			@Override
			public void mouseClicked( MouseEvent event ){
				
				qtdBolas++;
				Point point = new Point( PanelBola.this.point.x, qtdBolas * 55 );
				Point pointShadow = new Point( PanelBola.this.point.x, qtdBolas * 55 );
				Color color = new Color( 
					generate.nextInt(255), 
					generate.nextInt(255),
					generate.nextInt(255));
				
				colorPoint.add( new ColorPoint( point, pointShadow, color, 90, 55 ));
				PanelBola.this.repaint();
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
							
	public List<ColorPoint> getColorPoints(){
		return this.colorPoint;
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
		
		g.setColor( Color.BLACK );
		g.fillOval( this.point.x - 10, this.point.y, 90, 55 );
		
		g.setColor( Color.BLUE );
		g.fillOval( this.point.x, this.point.y, 90, 55 );
		

		
		for( ColorPoint cp : colorPoint ){
			g.setColor( Color.BLACK );
			g.fillOval( cp.pointShadom.x, cp.pointShadom.y, 90, 55 );
			g.setColor( cp.color );
			g.fillOval( cp.point.x, cp.point.y, cp.width, cp.height );
		}
					
	}
			
}

class UpdateBola implements Runnable{
	
	private final PanelBola painelBola;
	//private final Graphics g;
	private static final SecureRandom generator = new SecureRandom();	
	private int count = 0;
	private int max   = 1050;
	private int sinal = 1;
	private int sinalSombra = -1;

	public UpdateBola( PanelBola painelBola ){
		this.painelBola = painelBola; 
	}
	public void run(){		
		try{
			do{
				Thread.sleep( 10 );				
				count++;
				
				Point point = painelBola.getPoint();
										
				if( point.x >= 450 ){											
					sinal = -1;		
					sinalSombra = 1;
				}
				else if( point.x <= 0 ){										
					sinal = 1;
					sinalSombra = -1;
				}
							
				int total = 10 + 1;
				int x       = point.x + 1 * sinal;
				int shadowX = point.x + total * sinalSombra;
				
				
				Point newPoint = new Point( x, 0 );
				List<ColorPoint> colorPoint = painelBola.getColorPoints();
				
				
				for( ColorPoint cp : colorPoint ){
					cp.pointShadom.x = shadowX;
					cp.point.x = x;
					
					int width = cp.width;					
					if( cp.point.x <= 100 && sinal == -1 ){
						width++;
					}
					if( cp.point.x >= 350 && sinal == 1 ){
						width++;	
					}
										
				}
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