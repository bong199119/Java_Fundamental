package java_20191206;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInOutputStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
		fis = new FileInputStream("C:\\Users\\bong\\git\\Java_Fundamental2\\깃_and_메모장\\git.txt");
		fos = new FileOutputStream("C:\\Users\\bong\\git\\Java_Fundamental2\\깃_and_메모장\\git41321.txt");
		
		int readBytecount = 0;
		byte[] readByte = new byte[1024*8];
		
		while((readBytecount = fis.read(readByte)) != -1){
			
				fos.write(readByte,0,readBytecount);
			} 
			
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
