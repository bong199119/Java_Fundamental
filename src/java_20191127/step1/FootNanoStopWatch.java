package java_20191127.step1;
//1. 요구사항 : 나노 세컨드로 시간을 측정할 수 있는 애플리케이션을 만들어 주세요
public class FootNanoStopWatch {
	long startTime;
	long endTime;
	
	long startNanoTime;
	long endNanoTime;
	
	public double getElapsedTime(){
		return (double)(endTime - startTime)/(double)1000;
	}
	
	public double getElapsedNanoTime(){
		return (double)(endNanoTime - startNanoTime)/(double)1000000000;
	}
	
	
	public static void main(String[] args) {
		
		FootNanoStopWatch f = new FootNanoStopWatch();
		//f.startTime = System.currentTimeMillis();
		f.startNanoTime = System.nanoTime();
		for(long i = 0; i<250000000; i++){
			
		}
		//f.endTime = System.currentTimeMillis();
		f.endNanoTime = System.nanoTime();
			
		
		double elapsedTime =  f.getElapsedNanoTime();
		
		System.out.printf("경과시간 : %.9f %n",elapsedTime);
			
	}	
}
// 이 다음 할것 클래스 나누기  (클래스는 정체성이 있어야함)

