package java_20191127.step6;

public class StopMilliWatch extends StopWatch {

	private void start(){
		setStartTime(System.currentTimeMillis());
	}
	private void stop(){
		setEndTime(System.currentTimeMillis());
	}

	private double getElapsedTime(){
		return (double)(getEndTime() - getStartTime())/(double)1000;
	}
	
	public void run(){
		start();

		for (long i = 0; i < 250000000; i++) {

		}

		stop();

		double elapsedTime = getElapsedTime();

		System.out.printf("경과시간 : %.9f %n", elapsedTime);
	}
}
