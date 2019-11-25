package java_20191125;


//setter getter 연습
public class MemberDemo {
	public static void main(String[] args){
		Member m = new Member();
		m.setName("서봉석");
		m.setZipcode("123123");
		m.setAddress1("서울");
		m.setAddress2("종로");
		m.setEmail("president@bluehouse.go.kr");
		m.setSsn("2222-2222");
		m.setAge(90);
		m.setPassword("123123");
		m.setHeight(123);
		
		System.out.println(m.getName());
		System.out.println(m.getZipcode());
		System.out.println(m.getAddress1());
		System.out.println(m.getAddress2());
		System.out.println(m.getEmail());
		System.out.println(m.getSsn());
		System.out.println(m.getAge());
		System.out.println(m.getHeight());
	}
}
