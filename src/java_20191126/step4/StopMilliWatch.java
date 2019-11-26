package java_20191126.step4;

import java_20191126.step1.FootStopWatch;

public class StopMilliWatch {
	
		private long startTime;
		private long endTime;
		public void start(){
			startTime = System.currentTimeMillis();
		}

		
		public void stop(){
			endTime = System.currentTimeMillis();
		}
		
		public double getElapsedTime(){
			return (double)(endTime - startTime)/(double)1000;
		}
		
}

