package java_20191202;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class practice {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
		fis = new FileInputStream("C:\\Users\\bong\\git\\Java_Fundamental2\\깃_and_메모장\\git.txt");
		fos = new FileOutputStream("C:\\Users\\bong\\git\\Java_Fundamental2\\깃_and_메모장\\git4321.txt");
		
		int readBytecount = 0;
		byte[] readByte = new byte[1024*8];
		while(fis.read(readByte) != -1){
			
				fos.write(readByte);
			}
			
		} catch (IOException e) {
		
		}
	}
}
