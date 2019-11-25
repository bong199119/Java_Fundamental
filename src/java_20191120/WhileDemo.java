package java_20191120;

public class WhileDemo {
	public static void main(String[] args){

		int sum = 0;
		int i = 1;    // 초기값은 항상 밖에 적고
		while(i<=10000){
			sum += i;
			i++; // 증감 안에다가
			
		}
		System.out.printf("1부터 100까지의 합은 %,d입니다.",sum); // 천단위마다,가능
		
		System.out.printf("%n");
		System.out.printf("%n");
		
		int first = 2;
		while(first<=9){
		
			int second = 1;
			while(second<=9){
				System.out.printf("%d*%d = %d%n",first,second,first*second);
				second++;
				
			}
			System.out.printf("%n");
			first++;
		}
	
	
	}
	
	//gg
}

