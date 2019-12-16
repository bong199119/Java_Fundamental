package java_20191127;

import java.util.ArrayList;

public class WrapperDemo {
	public static void main(String[] args) {
		//자바 1.4이전 버전에서는 primitive data type을 cllection에 저장
		//할 수없었기 때문에 primitive data type을 객체화 할 수 있는 wrapper
		//class로 변환하여 저장 해야 한다.
		ArrayList list = new ArrayList();
		list.add(9);
		list.add(new Integer(2));
		
		Integer i1 = (Integer)list.get(0);
		Integer i2 = (Integer)list.get(1);
		
		int a = i1.intValue() + i2.intValue();

		System.out.println(a);
		//java 5.0 이후
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(1); // auto-unboxing
		list1.add(2); // auto-unboxing
		
		
		Integer i3 = list1.get(0);
		Integer i4 = list1.get(1);
		
		int b = i3 + i4; // auto-unboxing
		
		//숫자를 문자열로
		String str = 10+""; // 굉장히 저급한 방법
		String str1 = String.valueOf(10); // 노말한 방법!
		
		//문자열을 int로 바꿀때 사용
		int d = Integer.parseInt("100");
		
		
 	}
}
