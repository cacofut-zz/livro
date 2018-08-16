
package br.com.diagnosticit.api;

import java.security.SecureRandom;

public class Consumer implements Runnable{
	
	private final Buffer sharedLocation;
	private static final SecureRandom generator = new SecureRandom();
	
	public Consumer( Buffer sharedLocation ){
		this.sharedLocation = sharedLocation;
	}
		
	public void run(){
		int sum = 0;
		for( int i = 1; i <= 10; i++ ){
			try{
				Thread.sleep(generator.nextInt(3000));
				sum += sharedLocation.blockingGet();
				//System.out.printf( "\t\t\t%2d\n", sum );
			}
			catch( InterruptedException ex ){
				Thread.currentThread().interrupt();
			}
		}
		
		System.out.printf("\n%s %d\n%s\n", "Consumer read values totaling", sum, "Termination Consumer");
	}
}