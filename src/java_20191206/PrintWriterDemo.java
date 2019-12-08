package java_20191206;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		try {
		fr = new FileReader("C:\\Users\\bong\\git\\Java_Fundamental2\\깃_and_메모장\\git.txt");
		br = new BufferedReader(fr);
		fw = new FileWriter("C:\\Users\\bong\\git\\Java_Fundamental2\\깃_and_메모장\\git1991.txt");
		bw = new BufferedWriter(fw);
		pw = new PrintWriter(bw,true);
		
		String readLine = null;
	
			while((readLine = br.readLine())!=null){
				pw.println(readLine);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
