package java_20191128;

public class StringDemo {
	public static void main(String[] args) {
		String str = "abdccd";
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i)); // 문자열에서 문자를 하나씩 끄집어 낼수 잇음
		}
		str = str.concat("abcd");  // str + "abcd"
		System.out.println(str);
		
		String fileName = "abc.zip";
		if(fileName.endsWith("zip")){
			System.out.println("zip 파일입니다.");
		}else if(fileName.endsWith("ppt")){
			System.out.println("ppt 파일입니다.");
		}
		
		String uri = "artist/index.jsp";
		if(uri.startsWith("artist")){
			System.out.println("작가 페이지입니다.");
			
		}else if(uri.startsWith("exhibition")){
			System.out.println("전시 페이지 입니다.");
		}
		
		System.out.println("abc".equalsIgnoreCase("aBC"));
		
		String s1 = "a";  // 1바이트
		String s2 = "성"; // 2바이트 
				
		
		System.out.println(s1.getBytes().length);
		System.out.println(s2.getBytes().length);
		
		
		str = "111111-1111118";
		System.out.println(str.indexOf("-")); 
		fileName = "abc.bde.fafb.asdf.ppt"; //lastindexOf() 쓰면 뒤에서부터 세주기때문에 파일확장자 가려낼때 많이씀
		System.out.println(fileName.lastIndexOf("."));
		String first = str.substring(0,str.indexOf("-"));
		String second = str.substring(str.indexOf("-")+1);
		System.out.println(first);
		System.out.println(second);
		
		// String replaceAll (String regex, String replace)  regex -> regular expression  -> 정규표현
		
		String content = "abc\nabc\nabc";
		System.out.println(content);
		content = content.replaceAll("\n","<br>");
		System.out.println(content);
		
		
		s1 = "abc";
		s2 = "abc ";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.trim().equals(s2.trim())); // trim -> 앞뒤의 공백 제거
		
		
		//String.valueOf() 은 primitive data type -> String
		s1 = String.valueOf(100);// 1 +""; 과 같은표현
		s2 = 100+"";
		System.out.println(s1);
		System.out.println(s2);
		
		
		String phone = "010-3024-1703";
		String[] temp = phone.split("-");
		for (String string : temp) {
			System.out.println(string);
		}
		
		str = String.format("아에이오우 %3$,.3f %2$d %d", 10000000,20,30000000.2034);
		
		System.out.println(str);

		
		
		
		
	}
}











