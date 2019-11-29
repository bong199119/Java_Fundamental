package java_20191129;

public class ReturnDemo {
	public void m() {
		int a = 10;
		int b = 20;
		int c = a + b;
		if (c == 30) {
			return; // 값을 반환하고 나가버림
		}

		System.out.printf("a + b = %d", c);
	}

	public static void main(String[] args) {
		int a = 10;
		int b = a;
		int c = a + b;

		ReturnDemo rd = new ReturnDemo();
		rd.m();

		if (c == 20) {
			return; // 메인에서 리턴하면 프로그램 종료
		}
		System.out.println(c);
	}
}
