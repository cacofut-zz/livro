
package br.com.diagnosticit.api;

import javax.swing.SwingWorker;
import javax.swing.JLabel;
import java.util.concurrent.ExecutionException;

public class BackgroundCalculator extends SwingWorker<Long, Object>{
	
	private final int n;
	private final JLabel resultJLabel;
	
	public BackgroundCalculator( int n, JLabel resultJLabel ){
		this.n = n;
		this.resultJLabel = resultJLabel;		
	}
	
	public Long doInBackground(){
		return fibonacci(n);
	}
	
	public void done(){
		try{
			resultJLabel.setText(get().toString());
		}
		catch( InterruptedException ex ){
			resultJLabel.setText("Interrupted while waiting for results.");
		}
		catch( ExecutionException ex ){
			resultJLabel.setText("Error encountered while performing calculation.");
		}
	}
	
	public long fibonacci(long number){
		if( number == 0 || number == 1 )
			return number;
		else
			return fibonacci( number -1 ) + fibonacci( number - 2 );		
	}
}