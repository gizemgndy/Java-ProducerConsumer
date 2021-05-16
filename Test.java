
public class Test {
public static void main(String[] args) {
	Counter counter=new Counter();
	Producer p1=new Producer(counter);
	p1.start();
	
	
	Producer p2=new Producer(counter);
	p2.start();
	
	
	Producer p3=new Producer(counter);
//	p3.start();
	
	
	
	Consumer c1=new Consumer(counter);
	Thread t1=new Thread(c1);
	t1.start();
	
}
}
