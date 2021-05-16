
public class Consumer implements Runnable{
	private Counter counter;
	
	public Consumer(Counter counter ) {
this.counter=counter;
}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(;;) {
			try {
			counter.decrease();
			Thread.currentThread().sleep(100);
			
		}catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("Consumer: "+e.getMessage());
		}
	}
}}
