package java_20191126;

public class CallByRefDemo {
	
	public static void change(int i, int[] j,String str){
		i = 20;
		j[3] = 400;
		str +="123";
	}	
	
	/* 위는 아래와 같음int i = a라고 표현하면 i는 바뀌어도 a는 바뀌지 않음!!!
	public static void change(int i=a, int[] j=b){
		i = 20;
		j[3] = 400;
	}*/	
	
	public static void main(String[] args) {
		int a = 10;
		int b [] = {1,2,3,4};
		String str = "abc";
		System.out.println(a);
		System.out.println(b[3]);
		
		// a => call by value, b => call by reference
		change(a,b,str); 
		CallByRefDemo.change(a, b, str); // 같은 패키지 안에서는 클래스명 생략가능
		
		System.out.println(a); // call by value 메서드 호출후 변화 없음
		System.out.println(b[3]); // call by reference 메서드 호출후 변화 있음
		System.out.println(str);
		
		// 아래 두개의 선언은 다르다!
		int c[] ; // 현재 33번째줄인데 여기서 메모리 할당이 안됨
		// System.out.println(c); // 메모리 할당이 안되서 오류남
		c = new int [4]; // 35번째줄에서 메모리할당과 참조가 동시에 일어남!
		
		int[] d = null; // d는 37번째줄에서 생성은 되는데 참조는 안됨! 
		System.out.println(d); // 오류안나고 출력값은 null
		d = new int[4]; // 여기서 참조시작
		
		// 레퍼런스는 기본값이 null
		// primitive 기본값이 0
		// boolean 기본값이 false
		
		// 멤버변수는 기본값으로 초기화가 됨 but 로컬변수는 초기화가 안됨 
		int age;
		// int t = age + 20;  // 오류남
		// System.out.println(age);  // 오류남
		
		
		// 지역변수는 접근한정자를 붙일 수 없음
		
		
			
		
		
		
		
	}
}
