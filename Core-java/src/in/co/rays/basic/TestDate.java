package in.co.rays.basic;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) {
		 Date date = new Date();
		 System.out.println("date:"+ date);
		 
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		 
		 String formatedDate = sdf.format(date);
		 
		 System.out.println("my format;" + formatedDate);
		
	}
}
