package java_20191122;

public class CustomerDemo {
	public static void main(String[] args){
	
		Customer.interestRate = 10.2;  // new로 새로 객체를 생성하지 않아도 쓸수있음 interestRate가 static으로 되어있으므로
		
		Customer c1 = new Customer();
		c1.name = "서봉석";
		c1.email = "sbskh11@gmail.com";
		
		System.out.println(c1.name + " , " + c1.email);
		
		Customer c2 =new Customer();
		c2.name = "손정의";
		c2.email = "masayosi@yahoo.co.jp";
		
		System.out.println(c2.name + " , " + c2.email);

		Customer c3 = new Customer();
		c3.name = "베조스";
		c3.email = "ceo@amazon.com";
		
		System.out.println(c3.name + " , " + c3.email);
		
		// static변수는 reference variable로 접근이 가능하나 일반적으로 클래스 이름을 접근한다.
		c1.interestRate = 10.2;
		System.out.println(c3.interestRate);
		
		Customer.interestRate = 12.2;
		System.out.println(Customer.interestRate);
		
		//Customer.BANKNAME = "국민은행"; // FINAL 변수는 수정 불가능
		Customer c4 = c3;
		c4.name = "잡스";
		
		
		System.out.println(c3.name);
		
		
		Customer c5 = new Customer();
		c5.name = "손정의";
		c5.email = "masayosi@yahoo.co.jp";
		
		System.out.println(c2==c5);
		System.out.println(c2.name);
		System.out.println(c5.name);
		System.out.println(c3==c4);
		
		
		
		
		
		
		
		
		
		
	}
}
