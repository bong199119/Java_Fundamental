package java_20191128;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		// HashSet은 데이터(객체)의 중복을 허용하지 않고, 순서가 없음.
		// HashSet set = new HashSet();

		// TreeSet은 데이터(객체)의 중복을 허용하지 않고, 출력시 오름차순 정렬된다.
		TreeSet<Integer> set = new TreeSet<Integer>(); // 이러면 데이터 안정성이 보장된다.
		// TreeSet<String> set = new TreeSet<String>(); 스트링만 받을 때
		while (true) {
			int random = (int) (Math.random() * 45) + 1;
			set.add(random);
			if (set.size() == 6)
				break;// 컬랙션은 사이즈 랭스가 아님!

		}
		Iterator i = set.iterator();
		while (i.hasNext()) { // hasNext() : HashSet에 출력할 객체가 존재하는지 판단하는 메서드
			int temp = (Integer) i.next(); // next() 해당 객체를 가져온다.
			System.out.println(temp + "\t");

			/*
			 * Iterator<Integer> i = set.iterator(); while(i.hasNext()){ //
			 * hasNext() : HashSet에 출력할 객체가 존재하는지 판단하는 메서드 int temp = i.next();
			 * // next() 해당 객체를 가져온다. System.out.println(temp+ "\t");
			 */
		}
		
		HashSet<Test> s = new HashSet<Test>();
		s.add(new Test(10));
		s.add(new Test(20));
		s.add(new Test(10));
		
		System.out.println(s.size());
	}
}

class Test{
	int a;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test other = (Test) obj;
		if (a != other.a)
			return false;
		return true;
	}                                               
	Test(int a){
		this.a = a;
	}
}













