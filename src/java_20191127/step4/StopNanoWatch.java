package java_20191127.step4;

public class StopNanoWatch {
	//long startNanoTime;  분리해놓고 나니까 변수명자체가 밀리의 변수명(startTime)과 다를 이유가 없다 똑같이 고고
	//long endNanoTime;
	long startTime;
	long endTime;
		
	public void start(){
		startTime = System.nanoTime();
	}
	
	public void stop(){
		endTime = System.nanoTime();
	}
	
	public double getElapsedTime(){
		return (double)(endTime - startTime)/(double)1000000000;
	}
}
