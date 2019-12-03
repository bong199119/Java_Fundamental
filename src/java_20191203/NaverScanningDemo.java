package java_20191203;
//강사님 코드랑 비교하기

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class NaverScanningDemo {
	public static void main(String[] args) throws IOException {
		File f1 = new File("c:\\dev\\io\\2019\\12\\2"); // 객체생성		
		boolean isSuccess = f1.mkdirs(); // 폴더 생성 여러개 가능 io,2019,12만들어줌
		URL url= new URL("https://www.naver.com/");
		InputStream in = url.openStream();
		BufferedReader br = null;
		InputStreamReader isr = null;
		BufferedWriter bw = null;
		FileWriter fw = null;
		
		//1. InputStream을 InputStreamReader로 스트림체이닝을 한다.
		//2. InputStreamReader를 BuferedReader로 스트림체이닝을 한다.
		//3. BufferedReader로 읽은 정보(HTML)를 C:\dev\io\12\2\naver.html 파일로 저장한다.
		//
		isr = new InputStreamReader(in);
		br = new BufferedReader(isr); // stream chaining
		fw = new FileWriter("C:\\dev\\io\\2019\\12\\2\\naver.html");
		bw = new BufferedWriter(fw);
		
		String readLine = null;
		while ((readLine = br.readLine()) != null) {  // readLine은 개행 전까지 문자열을 받고 배출  -> 출력때 개행이 안됨
			bw.write(readLine);
			bw.newLine();  //  개행해줌
		}
	
	} 
}







