package java_20191129;

public class ThrowsDemo {
	public static double getAverage(int[] temp) throws ArrayIndexOutOfBoundsException{
		int sum = 0;
		int k = temp [0]; 
		int m = temp [1];  //에러날수있음
		int e = temp [2];  //에러날수있음
		int h = temp [3];  //에러날수있음 전부다 에러날 수 있기때문에 묶을수 없음 & 개별처리하기도 뭐함 -> throws로 던져버리자!
		
		sum = k+m+e+h;
		return (double)sum/(double)4;
	}
	
	
	public static void main(String[] args) {
		int[] exam = {10,20,30};
		try{
		double avg = getAverage(exam);
		}catch(ArrayIndexOutOfBoundsException e){
			System.err.println("국어, 영어, 수학, 국사 4과목을 입력해야 합니다. ^^");
		}
		
	
		
	}
}
