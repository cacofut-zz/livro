
import br.com.diagnosticit.api.BlockingBuffer;
import br.com.diagnosticit.api.Buffer;
import br.com.diagnosticit.api.Producer;
import br.com.diagnosticit.api.Consumer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class BlockingBufferTest{
	
	public static void main(String[] args) throws InterruptedException{
	
		ExecutorService executorService = Executors.newCachedThreadPool();
		
		Buffer sharedLocation = new BlockingBuffer();
		
		executorService.execute(new Producer(sharedLocation));
		executorService.execute(new Consumer(sharedLocation));
		
		executorService.shutdown();
		executorService.awaitTermination(1, TimeUnit.MINUTES);
		
	}
	
}