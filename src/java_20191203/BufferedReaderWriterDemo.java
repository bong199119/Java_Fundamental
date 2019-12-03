package java_20191203;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
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
			fr = new FileReader("C:\\dev\\io\\2019\\12\\test.txt");
			br = new BufferedReader(fr); // stream chaining

			fw = new FileWriter("C:\\dev\\io\\2019\\12\\test1.txt");
			bw = new BufferedWriter(fw);

			String readLine = null;
			while ((readLine = br.readLine()) != null) {  // readLine은 개행 전까지 문자열을 받고 배출  -> 출력때 개행이 안됨
				bw.write(readLine);
				bw.newLine();  //  개행해줌
			}
			bw.flush();   //버퍼쓰면 플러쉬 넣어주는게 좋음!

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				if (fr != null)
					fr.close();
				if (br != null)
					br.close();
				/*if (fw != null)
				    fw.close();*/
				if (bw != null)
					bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
