package Homework;

public class homework2 {
	public static void main(String[] args) {

		// 문자 reverse 하기
		// 1. input "abcd" => "dcba"
		// 2. input "abcde" => "edcba"
		

		// 1. "abcd" => "dcba"
		String input = "abcd";
		char[] ch = input.toCharArray();
		input = "";

		int length = ch.length / 2;

		for (int i = 0; i < length; i++) {

			char temp = ch[i];
			ch[i] = ch[ch.length - i - 1];
			ch[ch.length - i - 1] = temp;

		}
		for (int t = 0; t < ch.length; t++) {

			input += ch[t];
		}
		System.out.println(input);
		System.out.println();

		
		
		
		//2. "abcde" => "edcba"
		String input1 = "abcde";
		char[] ch1 = input1.toCharArray();
		input1 = "";

		int length1 = ch1.length / 2;
	
		for (int i = 0; i < length1; i++) {

			char temp = ch1[i];
			ch1[i] = ch1[ch1.length - i - 1];
			ch1[ch1.length - i - 1] = temp;

		}
		for (int t = 0; t < ch1.length; t++) {

			input1 += ch1[t];
		}
		System.out.println(input1);
		System.out.println();

		
		
		
		
		
		
		
		// 1-100까지 소수 구하기
		int num = 1;
		System.out.println("1번째 소수 2");
	
		for (int i = 2; i < 100; i++) {
			int count = 0;

			if (i % 2 == 0) {
				continue;
			
			} else {
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						break;

					} else {
						count = j;
						continue;
					}

				}
				if (count == i - 1) {
					num++;
					System.out.printf("%d번째 소수 %d%n", num, i);
					continue;
				}

			}

		}

	}
}
