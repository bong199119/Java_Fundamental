package java_20191202;

public class SynchronizedDemo implements Runnable {
	int x;
	int y;

	public synchronized void run() { // 두 쓰레드가 같은 객체를 공유할 때 syncronized 블록을 만나는
										// 순간 한놈이 주도권잡고 쭉 실행한다.

		for (int i = 0; i < 1000; i++) {
			x++;
			y++;
			String threadName = Thread.currentThread().getName();
			System.out.printf("x: %d, y: %d - %s%n", x, y, threadName);

		}
	}

	/*
	 * public void run(){ for(int i = 0; i < 100000; i++){
	 * synchronized(SynchronizedDemo.class){ x ++; y ++; String threadName =
	 * Thread.currentThread().getName(); System.out.printf("x: %d, y: %d - %s%n"
	 * ,x,y,threadName); }
	 * 
	 * }
	 * 
	 * }
	 */

	public static void main(String[] args) {
		SynchronizedDemo s1 = new SynchronizedDemo();
		SynchronizedDemo s2 = new SynchronizedDemo();
		Thread t1 = new Thread(s1); // 두 쓰레드가 같은 객체를 공유한다.
		Thread t2 = new Thread(s1); // 두 쓰레드가 같은 객체를 공유한다.

		t1.start();
		t2.start();

		while(true) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			new Thread(s1).start();
		}
	}
}
