package java_20191125;

public class CalendarDemo {
	private int year;
	private int month;
	private int day;
	int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private int tosum;
	
	public void set(int y, int m, int d) {
		year = y;
		month = m;
		day = d;

	}

	public int getTotalCount() {
		int sum = 0;

		// coding
		for (int i = 0; i < month - 1; i++) {
			sum += monthArray[i];

		}

		int plus = year / 4;
		int minus = year / 100;
		int plus2 = year / 400;

		tosum = sum + plus + (year - 1) + (day - 1) + plus2 - minus;

		return tosum;
	}

	public void print() {
		String today = null;
		int over = tosum % 7;

		switch (over) {

		case 0:
			today = "월요일";
			break;
		case 1:
			today = "화요일";
			break;
		case 2:
			today = "수요일";
			break;
		case 3:
			today = "목요일";
			break;
		case 4:
			today = "금요일";
			break;
		case 5:
			today = "토요일";
			break;
		case 6:
			today = "일요일";
			break;

		}
		System.out.printf("%d년 %d월 %d일은 %s 입니다.%n%n", year, month, day, today);
	}

	public static void main(String[] args) {
		CalendarDemo c = new CalendarDemo();
		c.set(2019, 12, 25); // 반환값 없음
		c.getTotalCount();
		c.print();
	}

}
