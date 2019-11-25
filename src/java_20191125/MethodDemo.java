package java_20191125;

public class MethodDemo {
	
	//method 생성
	public int plus(int first, int second){  // int first, int second -> 매개변수(parameter) //중요한것! -> int+int는 자료형을 높게 잡아야함
		return first+second;
	}
	
	public double divide(int first, int second){
		return (double)first / (double)second;
	}

	public int[] ascending(int[] array){
		for (int i=0; i<array.length; i ++){
			for(int j=0; j<array.length-(i+1); j++){
				if(array[j] > array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					
				}
			}
		}
		return array;
	}
	
	//윤년계수 메서드
	public boolean isLeafYear(int year){
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
	
	//void는 반환값이 없음
	public void print(String str){
		System. out.println(str);
	}
	
	public static void main(String[] args){
		MethodDemo md = new MethodDemo();
		
		int temp1 = md.plus(10, 20);  // 10, 20 -> 전달인자(Argument)
		
		System.out.println(temp1);
		
		double temp2 = md.divide(22, 5);
		
		System.out.println(temp2);
		
		int [] temp4 = {1,42,32,66,97,40,21};
		
		int [] temp5 = md.ascending(temp4);
		
		for(int value : temp5){
			System.out.print(value + "\t");
		}
		
		boolean temp6 = md.isLeafYear(2020);
		if(temp6){
			System.out.println("윤년");
			
		}else{
			System.out.println("평년");
		}
		
		md.print("월요일 입니다.");
	}
}
