package java_20191206;


public class practice implements Runnable {

	@Override
	public void run() {
		for(int i =0 ; i < 1000; i++){
			String ThreadName = Thread.currentThread().getName();
			System.out.printf("%s : %d %n",ThreadName, i);
		}
		
	}

	public static void main(String[] args) {
		
		practice r1 = new practice();
		Thread t1 = new Thread(r1,"firstThread");
		t1.start();
		

		practice r2 = new practice();
		Thread t2 = new Thread(r1,"secondThread");
		t1.start();
		
	}
}
