package java_20191127.step6;

public abstract class StopWatch {
	
	private long startTime; // 은닉화를 위해 private 붙임
	private long endTime;
	public abstract void run();
	
	public long getStartTime() { // startTime과 endTime에 private이 붙어서 꺼내쓰려면 setter, getter가 있어야함
		return startTime;
	}
	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}
	public long getEndTime(){
		return endTime;
	}
	public void setEndTime(long endTime){
		this.endTime = endTime;
	}
}
