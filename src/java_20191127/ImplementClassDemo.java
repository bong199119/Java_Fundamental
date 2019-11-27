package java_20191127;
/**
 이 클래스는 인터페이스를 테스트합니다.
 */

import java.util.*; // Date 들어있음
import java.sql.*; //  Date 들어있음
public class ImplementClassDemo {
	/**
	 이 메서드는 JVM이 호출해주는 매서드 입니다.
	 */
	public static void main(String[] args) {
		// Date d = new Date(); 요러면 유틸, 에스큐엘둘다에 데이트가 있기때문에 애매모호하다고 나옴
		java.util.Date d = new java.util.Date(); // 이것처럼 써줘야됨 명확하게!! 
		InterA a = new ImplementClass();
		a.mA();
		a.mB();
		a.mC();
	}
}
