package java_20191206;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderWriterDemo {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
		fr = new FileReader("");
		br = new BufferedReader(fr);
		fw = new FileWriter("");
		bw = new BufferedWriter(fw);
		
		String readLine = null;
		while((readLine = br.readLine()) != null){
			bw.write(readLine);
			
				bw.newLine();
			
		}bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
