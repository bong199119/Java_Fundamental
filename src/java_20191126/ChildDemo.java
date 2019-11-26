package java_20191126;

public class ChildDemo {
	public static void main(String[] args) {
		Parent p1 = new Parent();
		p1.age = 66;
		p1.work();
		p1.playBadook();
		
		Child c1 = new Child();
		c1.age = 25;
		c1.height = 140;
		c1.playBadook();
		c1.playGame();
		c1.work();
		
		
		Parent p2 = new Child(); //  (Parent)new Child(); 원래 이건데 오토캐스팅됨
		p2.age = 90;
		p2.work(); // 오버라이딩 되었기 때문에 자식의 work()가 호출이 됨!!
		p2.playBadook();
				
		
	}
}
