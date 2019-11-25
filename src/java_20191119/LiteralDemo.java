package java_20191119;

public class LiteralDemo {
	public static void main(String[] args){
	int a1 = 128;
	int a2 = 076;
	int a3 = 0x123;
	int a4 = 0b101010;
	
	System.out.println(a1);
	System.out.println(a2);
	System.out.println(a3);
	System.out.println(a4);
	
	//long 리터럴은 숫자위에 1 또는 L로 표기
	long l1 = 2200000l;
	
	//float 리터럴은 소수점 위에 f 또는 F로 표기
	float f1 = 123.43f;
	
	//double 리터럴은 소수점 뒤에 d 또는 D로 표기. 생략도 가능함
	double d1 = 1234.56;
	
	//boolean 리터럴은 true 또는 false
	boolean isExisted = false;
	
	System.out.println();
	
	a1 = 10;
	d1 = 10.0;
	
	//primitive data type의  == 연산자는 값만 비교함
	System.out.println(a1==d1);
	
	int first = 10;
	int second = first;
	first = 20;
	
	System.out.println(first);
	System.out.println(second);
	
	
	
	}
}
