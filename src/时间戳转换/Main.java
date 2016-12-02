package Ê±¼ä´Á×ª»»;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Vector;

public class Main {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat format =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    String time="2010-01-06 11:45:55";
	    java.util.Date date = format.parse(time);
	    System.out.println("Format To times:"+date.getTime());
	    Long times = new Long(1262749555000L);
	    String d = format.format(times);
	    System.out.println(d);
	}
}
