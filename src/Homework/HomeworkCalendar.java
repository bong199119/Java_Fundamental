package Homework;


	public class HomeworkCalendar {
	    private int year;
	    private int month;
	    private int day;
	    private int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	    private int totalsum;
	    private int totalsum1;
	    private int i;
	    private int totalday = 0;
	     
	    public HomeworkCalendar (int year){
	     
	        this.year = year;
	        getTotalCount1(year);
	        print1();
	    }
	     
	 
	    public HomeworkCalendar (int year, int month){
	     
	        this.year = year;
	        this.month = month;
	        getTotalCount2(year,month);
	        print2();
	    }
	     
	     
	     
	    //매개변수 3개짜리 생성자
	    public HomeworkCalendar (int year, int month, int day){
	        this.year = year;
	        this.month = month;
	        this.day = day;
	        getTotalCount(year, month, day);
	        print();
	    }
	     
	 
	    private int getTotalCount(int year, int month, int day) {
	        int sum = 0;
	 
	        // coding
	        for (int i = 0; i < month - 1; i++) {
	            sum += monthArray[i];
	 
	        }
	 
	        int plus = year / 4;
	        int minus = year / 100;
	        int plus2 = year / 400;
	 
	        totalsum = sum + plus + (year - 1) + (day - 1) + plus2 - minus;
	 
	        return totalsum;
	    }
	private int getTotalCount1(int year) {
	         
	 
	        int plus = year / 4;
	        int minus = year / 100;
	        int plus2 = year / 400;
	        if((year%4 == 0 || year%400==0) && (year % 100 != 0 || year%400 == 0)){
	        totalsum1 =plus + (year - 1) + plus2 - minus -1;
	        }else {
	            totalsum1 =plus + (year - 1) + plus2 - minus;
	        }
	         
	        return totalsum1;
	    }
	 
	private int getTotalCount2(int year, int month) {
	    int sum = 0;
	    for (int i = 0; i < month - 1; i++) {
	        sum += monthArray[i];
	 
	    }
	    int plus = year / 4;
	    int minus = year / 100;
	    int plus2 = year / 400;
	    if((year%4 == 0 || year%400==0) && (year % 100 != 0 || year%400 == 0)){
	    totalsum =sum +plus + (year - 1) + plus2 - minus -1;
	    }else {
	        totalsum =sum + plus + (year - 1) + plus2 - minus;
	    }
	     
	    return totalsum;
	}
	 
	    public void print() {
	        String today = null;
	        int over = totalsum % 7;
	 
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
	    private int month() {
	 
	        if (i == 1) {
	            totalday = 31;
	        } else if (i == 2) {
	            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
	                totalday = 29;
	            } else {
	                totalday = 28;
	            }
	        } else if (i == 3) {
	            totalday = 31;
	        } else if (i == 4) {
	            totalday = 30;
	        } else if (i == 5) {
	            totalday = 31;
	        } else if (i == 6) {
	            totalday = 30;
	        } else if (i == 7) {
	            totalday = 31;
	        } else if (i == 8) {
	            totalday = 31;
	        } else if (i == 9) {
	            totalday = 30;
	        } else if (i == 10) {
	            totalday = 31;
	        } else if (i == 11) {
	            totalday = 30;
	        } else if (i == 12) {
	            totalday = 31;
	        }
	 
	        return totalday;
	    }
	    private int month1() {
	 
	        if (month == 1) {
	            totalday = 31;
	        } else if (month == 2) {
	            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
	                totalday = 29;
	            } else {
	                totalday = 28;
	            }
	        } else if (month == 3) {
	            totalday = 31;
	        } else if (month == 4) {
	            totalday = 30;
	        } else if (month == 5) {
	            totalday = 31;
	        } else if (month == 6) {
	            totalday = 30;
	        } else if (month == 7) {
	            totalday = 31;
	        } else if (month == 8) {
	            totalday = 31;
	        } else if (month == 9) {
	            totalday = 30;
	        } else if (month == 10) {
	            totalday = 31;
	        } else if (month == 11) {
	            totalday = 30;
	        } else if (month == 12) {
	            totalday = 31;
	        }
	 
	        return totalday;
	    }
	 
	    private void print1() {
	        String today = null;
	        int over = (totalsum1 + 1) % 7;
	        int k = 0;
	        for (i = 1; i <= 12; i++) {
	            System.out.printf("\t\t      %d월 달력\n\n", i);
	            System.out.println("일\t월\t화\t수\t목\t금\t토\t");
	            for (k = 0; k < over; k++) {
	                System.out.printf(" \t");
	            }
	            k = 0;
	 
	            for (int j = 1; j <= month(); j++) {
	                System.out.printf("%d\t", j);
	                if ((j + over) % 7 == 0) {
	                    System.out.println();
	                }
	 
	            }
	            over = (over + month())%7;
	            System.out.println();
	            System.out.println();
	        }
	 
	    }
	    private void print2() {
	     
	        int over = (totalsum + 1) % 7;
	        int k = 0;
	         
	            System.out.printf("\t\t      %d월 달력\n\n", month);
	            System.out.println("일\t월\t화\t수\t목\t금\t토\t");
	            for (k = 0; k < over; k++) {
	                System.out.printf(" \t");
	            }
	            k = 0;
	 
	            for (int j = 1; j <= month1(); j++) {
	                System.out.printf("%d\t", j);
	                if ((j + over) % 7 == 0) {
	                    System.out.println();
	                }
	 
	            }
	 
	    }
	    public static void main(String[] args) {
	        HomeworkCalendar  c = new HomeworkCalendar (2011);
	        //c.print();
	    }
	 
	 
	 
	}

