package Homework;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class practice {
	static String timeConversion(String s) {
        String t = null;
        String time = null;
        String fm = "FM";
        String am = "AM";
        int temp = 0;
        int plustime = 12;

        t = s.substring(s.length()-2, s.length());

        if(am.equals(t)){
        	 time = s.substring(0,2);
            if(Integer.parseInt(time) == 12){
                time = "00"+s.substring(2,8);
            }else{
                time = s.substring(0,8);
            }
        }else{
            time = s.substring(0,2);
            if(Integer.parseInt(time) == 12){
                time = "12"+s.substring(2,8);
            }else{
                temp = Integer.parseInt(time) + plustime;
                time = temp+""+s.substring(2,8);
            }
            
        }
        System.out.println(time);
        return time;
    }
	public static void main(String[] args){
		
		timeConversion("12:55:55AM"); 
	}

	
}
