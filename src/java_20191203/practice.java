package java_20191203;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class practice {
	public static void main(String[] args) throws IOException {
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		String url = "https://coinmarketcap.com/currencies/bitcoin/historical-data/?start=20171101&end=20191203";
		Document doc = null;
		
		fw = new FileWriter("C:\\dev\\io\\12\\2");
		bw = new BufferedWriter(fw);
		pw = new PrintWriter(bw,true);
		
		doc = Jsoup.connect(url).get();
		
		
		
		
		
		
		
		
	}
}
