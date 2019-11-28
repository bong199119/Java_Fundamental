package java_20191128;

public class Member {   //맴버변수 만들면 -> 생성자, setter,getter만들기 -> 생성자 더 필요하면 오버로딩
	private String id;    // encapsulation
	private String name;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
