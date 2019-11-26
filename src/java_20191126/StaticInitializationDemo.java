package java_20191126;
//i18n  -> Internationalization -> 국제화
//l10N  -> Localization -> 지역화 
public class StaticInitializationDemo {
	int age; // instance variable
	static String title;
	static{
		System.out.println("static block"); // 제일 먼저 프린트 찍힘 -> static{}가 메모리에 제일 먼저 올라옴
		title = "모기지론";
		
	}
	
	//생성자의 접근 한정자는 객체생성과 관련있다.
	public StaticInitializationDemo(int age){  // public -> private 바꾸면 class내에서만 사용가능
		this.age = age;
		System.out.println("constructor");
	}
	
	public static void main(String[] args){
		System.out.println("main");
		new StaticInitializationDemo(20);
		new StaticInitializationDemo(30);
		new StaticInitializationDemo(10);
		
		// new StaticInitializationDemo();  에러남 이유-> 위에 StaticInitializationDemo의 디폴트생성자가 없음!
		// 다른생성자 public StaticInitializationDemo(int age)는 있는데 이걸론 안되고 디폴트생성자가 잇어야함
		// 14번째줄에 public StaticInitializationDemo(int age)이게 없으면 자동으로 생성자 만들어줘서 new StaticInitializationDemo(); 써도 오류 안남
	}
	
}
