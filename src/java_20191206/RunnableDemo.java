package java_20191206;

public class RunnableDemo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0 ; i<1000; i++){
			String threadName = Thread.currentThread().getName();
			System.out.printf("%s : %d %n",threadName, i);
		}
	}
	
	public static void main(String[] args) {
		RunnableDemo r1 = new RunnableDemo();
		Thread t1 = new Thread(r1,"first Thread");
		t1.start();
		
		RunnableDemo r2 = new RunnableDemo();
		Thread t2 = new Thread(r1,"second Thread");
		t2.start();
		
	}
	
}
