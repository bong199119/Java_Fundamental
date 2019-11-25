package java_20191121;

public class CalendarDemo {
	public static void main(String[] args){
		/*달력만들기
		1. 1년 1월 1일은 월요일
		2. 1년 365일 ,윤년은 366일 - 2월 29일
		3. 윤년은 4년마다 발생하고 100년마다 평년 400년마다 다시 윤년
		4. 2019년 12월 25일 무슨요일 일까요?
		
		*/
		
		
		int year = 2019;
		int month = 12;
		int day = 25;
		String message = null;
		int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
		int sum=0;
		
		//coding
		for(int i=0; i < month-1 ; i++){
			sum += monthArray[i];
			
		}
		
		int plus = year / 4;
		int minus = year / 100;
		int plus2 = year / 400;
		
		int tosum = sum + plus + (year-1) + (day-1) + plus2 - minus ;
		int over = tosum % 7;
		
		String today = null;
		
		switch(over){
	
		case 0 : today = "월요일"; break;
		case 1 : today = "화요일"; break;
		case 2 : today = "수요일"; break;
		case 3 : today = "목요일"; break;
		case 4 : today = "금요일"; break;
		case 5 : today = "토요일"; break;
		case 6 : today = "일요일"; break;
	
		}
		
		
		System.out.printf("%d년 %d월 %d일은 %s 입니다.%n%n", 
				year, month, day , today);
		
				
		System.out.println(plus);
		System.out.println(plus2);
		System.out.println(minus);
		System.out.println(tosum);
		System.out.println(over);
		
	}
}
