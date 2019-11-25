package java_20191122.aa;

public class NoticeDemo {
	public static void main(String[] args){
		Notice n = new Notice();
		n.number = 10;
		n.title ="title";
		n.hit = 100;
		//n.regdate = "2019-11-22";  //private String regdate;  -> private로 설정해놔서 같은 클래스에서만됨-> 패키지 내에서는 안됨 
		
	}
}
