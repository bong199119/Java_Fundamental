package java_20191127.step6;

public class StopNanoWatch extends StopWatch {
	//long startNanoTime;  분리해놓고 나니까 변수명자체가 밀리의 변수명(startTime)과 다를 이유가 없다 똑같이 고고
	//long endNanoTime;
	
	private void start(){
		setStartTime(System.nanoTime());
	}
	
	private void stop(){
		setEndTime(System.nanoTime());
	}
	
	private double getElapsedTime(){
		return (double)(getEndTime() - getStartTime())/(double)1000000000;
	}
	
	public void run(){
		start();

		for (long i = 0; i < 250000000; i++) {

		}

		stop();

		double elapsedTime = getElapsedTime();

		System.out.printf("경과시간 : %.3f %n", elapsedTime);
	}
}
