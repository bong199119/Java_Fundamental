package java_20191202;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class practice {
	public static void main(String[] args) {
		try{
		FileInputStream fis = new FileInputStream("c:\\dev\\io\\2019\\12\\jdk.exe");
		FileOutputStream fos = new FileOutputStream("c:\\dev\\io\\2019\\12\\jdk-3.exe");
		
		byte[] readBytes = new byte[1024];
		int readByteCount = 0;
		while((readByteCount = fis.read(readBytes)) != -1){
			fos.write(readBytes,0,readByteCount);
		}
		}catch(IOException e){
			e.printStackTrace();
			
		}
	}
}

//***** 이거 숙달하기!!!!!!