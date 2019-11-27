package java_20191127.step2;


//1. 실제클래스와 실행되는 클래스를 분류하자
//2. 시간을 측정하는 기능을 메서드로 추출
public class StopWatchDemo {
	public static void main(String[] args) {
		
			StopWatch s = new StopWatch();
			s.startNano();
			
			for(long i = 0; i<250000000; i++){
				
			}
			
			s.stopNano();
						
			double elapsedTime =  s.getElapsedNanoTime();
			
			System.out.printf("경과시간 : %.9f %n",elapsedTime);
			
		
		
		
	}
}
// 다음에 할것 클래스 정체성 살려주기 !!!