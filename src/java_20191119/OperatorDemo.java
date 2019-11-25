package java_20191119;

public class OperatorDemo {
	public static void main(String[] args){
		int a = 7, b =20;
		int c = 0;
		float d = 0;
		double f = 0;
		
		
		
		c = a + b;
		System.out.println(c);
		
		c = a - b;
		System.out.println(c);
		
		d = (float)b / (float)a;
		System.out.println(d);
		
		f = (double)b % (double)a;
		System.out.println(f);
		
		
		a += b;
		
		a = 10;
		
		c = a++;
		System.out.println(c);
		
		a = 10;
		
		c = ++a;
		System.out.println(c);
		
		
		
		boolean isSuccess = false;
		isSuccess= a>b;
		System.out.println(isSuccess);
		
		isSuccess = a<b;
		System.out.println(isSuccess);
		
		
		isSuccess = a==b;
		System.out.println(isSuccess);
		
		isSuccess = a != b;
		System.out.println(isSuccess);
		
		
		
		// a && b => a가 false 이면 b연산을 하지 않음(short circuit)
		// a || b => a가 true 이면 b연산을 하지않음(short circuit)
		
		
		isSuccess = (a == b) && (++a == ++b); // 여기서 볼 수 있듯이 &&논리연산에서 앞쪽이 false면 뒤에 안보고 값을 내어놈
		System.out.println(isSuccess);        // 따라서 a와 b는 값이 증가하지 않은채로 남는다.
		System.out.println(a);
		System.out.println(b);
		
		
		
		
		
		
		
	}
}
