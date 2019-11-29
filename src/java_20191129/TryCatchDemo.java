package java_20191129;

public class TryCatchDemo {
	public static double getAvg(int k, int e){
		int sum = k+e;
		double avg = (double)sum/(double)2;
		return avg;
	}
	
	public static void main(String[] args) {
		
		try{
		int k = Integer.parseInt(args[0]);
		int e = Integer.parseInt(args[1]);
		double average = getAvg(k,e);
		System.out.printf("평균: %f",average);
		}catch(NumberFormatException e){
			// e.printStackTrace(); // 개발 초창기에는 요걸 씀 (어디가 잘못됬는지 메세지가 다나옴)
			System.out.println(e.getMessage());
			System.err.println("숫자를 입력해주세요 ^^");
		}catch(ArrayIndexOutOfBoundsException e){
			System.err.println("국어와 영어점수를 넣어주세요 ^^");
		}
		
	}
}
