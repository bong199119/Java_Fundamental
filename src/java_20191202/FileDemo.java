package java_20191202;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileDemo {
	public static void main(String[] args) {
		File f1 = new File("c:\\dev\\io\\2019\\12"); // 객체생성		
		boolean isSuccess = f1.mkdirs(); // 폴더 생성 여러개 가능 io,2019,12만들어줌
		//boolean isSuccess = f1.mkdir(); // -> 디렉토리1개밖에 못만듬
		System.out.println(isSuccess);	
		
		File f2 = new File(f1, "jdk-11.0.3_windows-x64_bin.exe");
		//File f2 = new File("c:\\dev\\io\\2019\\12\\jdk-11.0.3_windows-x64_bin.exe"); 위랑 같은방식
		//File f2 = new File("c:\\dev\\io\\2019\\12" , "jdk-11.0.3_windows-x64_bin.exe"); 위랑 같은방식
		long fileSize = f2.length()/1024;
		System.out.println(fileSize);
		long lastModified = f2.lastModified(); // 1970년 1월1일부터 마지막 수정한 날자까지 시간을 밀리세컨드로 제출 (반환형 long)
		
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(lastModified);
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int day = c.get(Calendar.DATE);
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss E요일");
		String date = sdf.format(c.getTime());
		System.out.println(date);
		
		
		File f3 = new File("c:\\");
		//list() : c 드라이브에 있는 모든 파일과 디렉토리를 String[] 배열로 반환
		String[] list = f3.list();
		for ( String temp : list){
			File f4 = new File(f3, temp);
			if(f4.isDirectory()){
				System.out.println("디렉토리: "+ temp);
			}else if(f4.isFile()){
				System.out.println("파일: "+temp);
				
			}else{
				System.out.println("?: "+temp);
			}
			//System.out.println(temp);
		}
				
		File f5 = new File(f1, "jdk.exe"); // 이름바꾸기
		f2.renameTo(f5);
		
		
		
		File f6 = new File(f1,"a.txt"); // 파일 만들기
		try {
			f6.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//아래 3가지 메소드 기억하기
		System.out.println(f6.getName());
		System.out.println(f6.getPath());
		System.out.println(f6.getParent());
	
		
		
		String extension = f6.getName().substring(f6.getName().lastIndexOf("."));
		System.out.println(extension);
		
		String L = System.currentTimeMillis()+extension;
		
		File f7 = new File(f1, L); // 이름바꾸기
		f6.renameTo(f7);
		f7.delete();
		
	}
}









