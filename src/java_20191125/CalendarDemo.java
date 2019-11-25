package java_20191125;

public class CalendarDemo {
	private int year;
	private int month;
	private int day;
	private int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private int tosum;
	
	
	public CalendarDemo(int y){
		//year = y;
		this(y,0,0);
	}
	
	public CalendarDemo(int y, int m){
		//year = y;
		//month = m;
		this(y,m,0);
	}
	
	
	
	//매개변수 3개짜리 생성자
	public CalendarDemo(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
		getTotalCount();
	}
	
	public void set(int y, int m, int d) {
		year = y;
		month = m;
		day = d;
		getTotalCount();
	}

	private int getTotalCount() {
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
	/* 일단 디폴트 생성자 만들고 시작하는게 좋음!
	public CalendarDemo(){
		
	}
	*/
	public static void main(String[] args) {
		CalendarDemo c = new CalendarDemo(2019,12,25); // 좋은코딩은 생성자에서 초기화하는것!
		//c.set(2019, 12, 25); // 반환값 없음
		//c.getTotalCount();
		c.print();
	}

}
