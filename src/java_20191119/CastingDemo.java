package java_20191119;

public class CastingDemo {
	public static void main(String[] args){
		//overflow 발생하여 compile error 발생
		//byte b1 = 250;
		
		byte b1 = (byte) 129;  // circuit 발생, 권장하지 않음
		System.out.println(b1);
		
		int i1 = (int) 125.34;
		System.out.println(i1); // cut 발생
		
		double d1 = 123.2f; //auto casting
		System.out.println(d1);
		
		
		byte b2 = 10;
		byte b3 = 20;
		byte b5 = (byte)(b3 + b2);
		//산술연산자는 변환값이 int이기 때문에 전체를 byte로 
		//casting 해야 에러가 발생하지 않는다.
		//
		System.out.println(b5);
		
		
		int a10 = 100_000; //천단위로 언더스코어 사용 가능  -> 보기 편하게
		
		

		
	
		
		
	}
}
