package java_20191119;

public class CharLiteralDemo {
	
	public static void main(String[] args){
		//1. 유니코드 표현  => '\u0000'
		char c1 = '\uC12C';
		char c2 = '\uBD09';
		char c3 = '\uC11D';
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		
		//2. 아스키코드 표현 = > '00'
		// 48에서 57까지 -> 0부터 9까지
		// 65 - 90 -> A - Z
		// 97 - 122 -> a - z
		
		char c4 = 97;
		System.out.println(c4);
		
		//3 문자 표현 => ''
		
		char c5 = 'a';
		char c6 = '봉';
		
		System.out.println(c5);
		
		//escape char
		// \n => line feed
		// \t => tab
		// \\ => \
		
		
		
		System.out.println("hello\n"+"world");
		System.out.println("hello\t"+"world");
		System.out.println("hello\b"+"world");
		
		
		String path = "C:\bev\bclipse";
		String path1 = "C:\\dev\\eclipse";
		String path2 = "C:\\dev\\\"eclipse\"";
		
		
		System.out.println(path);
		System.out.println(path1);
		System.out.println(path2);
		
		
		
	}
}
