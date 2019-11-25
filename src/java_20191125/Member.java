package java_20191125;

public class Member {
	private String name;
	private String zipcode;
	private String address1;
	private String address2;
	private String ssn;
	private int age;
	private double height;
	private String password;
	private String email;
	
	//멤버변수 setter 자동 단축키 
	//alt + shift + s => r => tab => enter => tab*4 => enter
	
	
	//name에 대한 setter 메서드
	public void setName(String n){
		name = n;
	}
	
	//name에 대한 getter 메서드
	public String getName(){
		return name;
	}
	
	public void setZipcode(String z){
		zipcode = z;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getZipcode(){
		return zipcode;
	}
	
	public void setAddress1(String A1){
		address1 = A1;
	}
	
	public String getAddress1(){
		return address1;
	}
	
	public void setAddress2(String A2){
		address2 = A2;
	}
	
	public String getAddress2(){
		return address2;
	}
	
	public void setSsn(String s){
		ssn = s;
	}
	
	public String getSsn(){
		return ssn;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setHegiht(double h){
		height = h;
	}
	
	public double getHeight(){
		return height;
	}
	
	public void setPassword(String p){
		password = p;
	}
	
	public String getPassword(){
		return password;
	}
	
}
