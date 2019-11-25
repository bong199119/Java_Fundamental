package java_20191121;

public class ArrayDemo {
	public static void main(String[] args){
		
		//1. 배열 선언
		int [] a = new int[5];
		
		
		//2. 배열 할당
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 5;
		a[4] = 7;
		
		//3. 배열의 출력
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}
		
		//배열 생성과 할당이 동시에 이루어지는 경우

		int [] b = {1,2,3,4,5}; // int[] b = new int[]{1,2,3,4};
		
		
		//배열의 값 변경
		
		b[1] = 100;
		b[3] = 200;
		
		
		//enhanced for loop
		for(int temp : b){
			System.out.println(temp);
		}
		
	
		
		
		
		
	}
}
