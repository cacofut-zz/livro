

public class Teste{
	
	public static void main(String ...args){	
		try{
			a();
			b();
			c();
			d();
		}
		catch( Exception e ){
			
		}
	}
	
	public static void a() throws InterruptedException{		
		System.out.println("a dormindo");
		Thread.sleep(5000);
		System.out.println("a acordou");
	}
	
	public static void b() throws InterruptedException{
		System.out.println("b");
	}
	
	public static void c() throws InterruptedException{		
		System.out.println("c dormindo");
		Thread.sleep(4000);
		System.out.println("c acordou");
	}
	
	public static void d() throws InterruptedException{
		System.out.println("d");
	}
}