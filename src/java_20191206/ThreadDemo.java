package java_20191206;

public class ThreadDemo extends Thread {
	public void run() {
		for(int i =0; i<1000; i ++){
			String threadName = Thread.currentThread().getName();
			System.out.printf("%s %d%n",threadName,i);
		}
	}

	public static void main(String[] args) {
		ThreadDemo t1 = new ThreadDemo();
		t1.start();
		
		ThreadDemo t2 = new ThreadDemo();
		t2.start();
	}
}
