
public class Producer extends Thread{
	private Counter counter;
	
	public Producer(Counter counter ) {
this.counter=counter;
}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(;;) {
			try {
			counter.increase();
			sleep(100);
		}catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("Producer: "+e.getMessage());
		}
	}
}}
