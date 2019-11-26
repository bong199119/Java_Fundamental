package java_20191126;


// 오버로딩  -> 한 클래스 내에서 메서드 이름이나 생성자 중첩   ->   예로 math클래스가 있음
// 오버라이딩 -> 부모의 기능을 재정의 할때 쓰는것 (상속관계 필수!)   


public class Child extends Parent{
	double height = 170.66;
	// overriding: 부모의 메서드를 재정의
	// 1. 메서드의 이름, 매개변수, 반환형 일치
	// 2. 접근 한정자는 부모보다 자식이 상위이거나 같으면 됨
	
	public void work(){
		super.work(); // Parent 클래스의 work() 메서드 호출
		System.out.println("Child work()");
		
	}
	public void playGame(){
		System.out.println("Child playGame()");
	}

}
