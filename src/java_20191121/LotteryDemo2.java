package java_20191121;

public class LotteryDemo2 {
	public static void main(String[] args) {

		int num = Integer.parseInt(args[0]);
		// Math.random() => 0보다 크거나 같고 1보다 작은 임의의 double 값을 반환

		int[] lotto = new int[6];
		for (int k = 0; k < num; k++){
		for (int i = 0; i < lotto.length; i++) {

			double random = Math.random();
			int temp = (int) (random * 45) + 1;

			if (i > 0) {

				for (int j = 0; j < i; j++) {
					
					if (lotto[j] == temp) {
						i--;
						break;
					} 
					else {

						lotto[i] = temp;

					}

				}

			} else {

				lotto[i] = temp;

			} 
		}
		//(버블 소트) 오름차순
		for(int i = 0; i < lotto.length-1; i++){
			for (int j = 0; j < lotto.length - (i +1); j++){
				if(lotto[j] > lotto[j+1]){
					int temp = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = temp;
				}
			}
		}
		

		for (int i : lotto) {
			System.out.print(i + "\t");
		}
		System.out.printf("%n");
		}
	}
}
