package cn.itcast_02;

import java.text.ParseException;
import java.util.Date;

public class DateUtilDemo {
public static void main(String[] args) throws ParseException {
	  Date d=new Date();
	  System.out.println(DateUtil.dateToString(d, "yyyy��MM��dd�� HH:mm:ss"));
	  
	  String s=new String("2019��05��21�� 00:14:30");
	  System.out.println(DateUtil.stringToDate(s,"yyyy��MM��dd�� HH:mm:ss"));
	  
}
}
