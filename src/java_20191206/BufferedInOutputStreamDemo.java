package java_20191206;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInOutputStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
		fis = new FileInputStream("C:\\Users\\bong\\git\\Java_Fundamental2\\깃_and_메모장\\git.txt");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("C:\\Users\\bong\\git\\Java_Fundamental2\\깃_and_메모장\\git3333.txt");
		bos = new BufferedOutputStream(fos);
		
		int readByte = 0;
		while((readByte = bis.read()) != -1){
			
				bos.write(readByte);
			} 
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
