package java_20191206;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		try {
		fr = new FileReader("C:\\Users\\bong\\git\\Java_Fundamental2\\깃_and_메모장\\git.txt");
		fw = new FileWriter("C:\\Users\\bong\\git\\Java_Fundamental2\\깃_and_메모장\\git222.txt");
		
		char [] readchars = new char[10];
		int readcharcount = 0;
		while((readcharcount = fr.read(readchars)) != -1){
			
				fw.write(readchars,0,readcharcount);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
}
