package java_20191126.step5;

public class StopWatchDemo {
	public static void execute(StopWatch s){
		s.run();
	}
	
	public static void main(String[] args) {
		
		StopNanoWatch s1 = new StopNanoWatch();
		execute(s1);
		
		StopMilliWatch s2 = new StopMilliWatch();
		execute(s2);
		
		StopMicroWatch s3 = new StopMicroWatch();
		execute(s3);
	}
}

