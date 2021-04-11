package cn.itcast_02;

import java.text.ParseException;
import java.util.Date;

public class DateUtilDemo {
public static void main(String[] args) throws ParseException {
	  Date d=new Date();
	  System.out.println(DateUtil.dateToString(d, "yyyy年MM月dd日 HH:mm:ss"));
	  
	  String s=new String("2019年05月21日 00:14:30");
	  System.out.println(DateUtil.stringToDate(s,"yyyy年MM月dd日 HH:mm:ss"));
	  
}
}
