package java_20191122.bb;
//서로 다른 패키지의 클래스를 사용하기 위해서는 반드시 import 해줘야 한다.
import java_20191122.aa.Notice;




public class NoticeDemo2 extends Notice{
	public static void main(String[] args){
		Notice n = new Notice();   
		n.number = 10;
		//n.title ="title";   //자기자신에게 바로 접근시도해도 불가능!!
		//n.hit = 100;
		//n.regdate = "2019-11-22";
		NoticeDemo2 nc = new NoticeDemo2();
		nc.number = 10;
		nc.title = "title";
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}


