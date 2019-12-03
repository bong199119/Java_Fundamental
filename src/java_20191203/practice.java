package java_20191203;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class practice {
 public static void main(String[] args) {
	FileReader fr = null;
	FileWriter fw = null;
	BufferedReader br = null;
	BufferedWriter bw = null;
	
	
	try {
		fr = new FileReader("C:\\dev\\io\\2019\\12\\test.txt");
		br = new BufferedReader(fr);
	
		
		fw = new FileWriter("C:\\dev\\io\\2019\\12\\test1.txt");
		bw = new BufferedWriter(fw);
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
 }
 
}
