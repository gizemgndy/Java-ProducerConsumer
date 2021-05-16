import java.util.Random;

//shared object

public class Counter {

	private int counter; //common variable
	private Random ran;
	public Counter() {
		counter=0;
		ran=new Random();
	}
	//supposed to execute by a producer
	public synchronized void increase() {
		int number=ran.nextInt(5);
		if(counter+number>100) { //counter 95,number is:3
			try {
				System.out.println("Producer is waiting and current value is:  " +counter);
				System.out.println("Producer generated number is: " +number);
			wait();//stop he current thread
		}
		catch (InterruptedException e) {
			// TODO: handle exception
		}
	}//end of the if condition.
	
			counter=counter+number;
			notifyAll();//send message to consumer....
			System.out.println("Producer: " +counter);
	}
//supposed to executer by a consumer
	public synchronized void decrease() {
		int number=ran.nextInt(5);
		
		if(counter-number<0) {//counter:99 ,number=4
			try {
				System.out.println("The consumer is waiting ant the currentvalue is: " +counter );
				System.out.println("Consumer generated number is: " +number);
				wait();
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		} 
		counter=counter-number; //counter =99-4=95
		notifyAll(); //send message to producer....
		System.out.println("Consumer: " +counter);

	}
}
