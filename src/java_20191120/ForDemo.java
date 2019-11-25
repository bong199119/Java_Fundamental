package java_20191120;

public class ForDemo {
	public static void main(String[] args) {
		String str = "hello";
		int a1 = 10;
		int a2 = 20;
		double d1 = 12.4567;
		System.out.printf(" %s, %d, %10d, %.2f, %f %n ", str, a1, a2, d1, d1);
		System.out.println(str + ", " + a1 + ", " + a2 + ", " + d1);

		double sum = 0;
		long start = System.currentTimeMillis();

		double target = 10;

		for (double i = 1; i <= target; i++) {
			if (i % 2 == 0) {

				sum = sum + i;

			} else {
				sum = sum;
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("경과시간:" + (end - start));
		System.out.printf("1부터 %.0f까지 합은 %f입니다.%n", target, sum);

		sum = 0;

		double target1 = 100_000_000;

		long start1 = System.currentTimeMillis();
		for (double i = 1; i <= target1; i++) {

			sum = sum + i;

		}
		long end1 = System.currentTimeMillis();
		System.out.println("경과시간:" + (end1 - start1));
		System.out.printf("1부터 %.0f까지 합은 %f입니다.%n", target1, sum);

		
		
		
		
		// 구구단 - 단마다 개행
		for (int j = 2; j <= 9; j++) {

			for (int i = 1; i <= 9; i++) {

				System.out.printf("%d X %d = %d %n", j, i, j * i);

			}
			System.out.printf("%n");
		}

		
		
		// 구구단 역으로
		for (int j = 9; j >= 2; j--) {

			for (int i = 1; i <= 9; i++) {

				System.out.printf("%d X %d = %d %n", j, i, j * i);

			}
			System.out.printf("%n");
		}
		
		
		
		
		
		//별찍기1 
		for (int i = 1; i < 6; i++) {
			for (int j = 6; j > 1; j--) {

				if (j > i) {
					System.out.printf("1");
				} else {
					System.out.printf("0");
				}

			}
			System.out.printf("%n");

		}
		System.out.printf("%n");

		
		
		
		//별찍기2
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < i + 1; j++) {

				System.out.print("*");

			}
			System.out.printf("%n");

		}
		

		//별찍기2 if안쓰고 
		
		System.out.printf("%n");
		
		for (int i = 1; i < 6; i++) {
			
			for (int j = 0; j < 6-i; j++) {
				
				System.out.printf("0");
				
			}
			for (int j = 0; j < i; j++) {
				
				System.out.printf("1");
				
			}
			System.out.printf("%n");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
