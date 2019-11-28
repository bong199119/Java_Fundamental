package java_20191128;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		//HashMap : key 값은 반드시 유일해야하고, value에는 데이터(객체)을 저장하는데
		// 데이터의 중복을 허용한다. key값이 중복되는 경우는 덮어쓴다.
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		
		map.put("1", 11111);
		map.put("2", 22222);
		map.put("3", 33333);
		map.put("4", 44444);
		map.put("5", 55555);
		map.put("1", 66666);
		
		Integer value = map.get("1");
		System.out.println(value);
		
		Set<String> set = map.keySet(); //key를가져와서 set에 넣겠다.
		
		Iterator<String> i = set.iterator(); // 이 코드는 기억잘해두자 변함이 없다.
		while(i.hasNext()){
			String k = i.next();
			Integer v = map.get(k);
			System.out.format("key : %s, value : %d%n",k,v);
		}
		
	}
}
