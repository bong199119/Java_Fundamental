package java_20191126;
import java.lang.*;  //이거 생략
public class Super { //public class Super extends Object -> 원래 이거임!  항상 최상위는 Object!
	int money;
	public Super(){
		
	}
	public Super(int money){ //  클래스 생성자
		
		this.money = money;
	}
	
	public void makeMoney(){
		System.out.println("Super makeMoney()");
		
	}
	
	public void play(String omok){
		System.out.println("Super play()");
	}
	
	
	
	
	
}
