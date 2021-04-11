package cn.itcast_01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFomatDemo {
   public static void main(String[] args) throws ParseException {
	   //Date----String
	Date d=new Date();
	//

	SimpleDateFormat sdf=new SimpleDateFormat("yyyy��MM��dd�� HH��mm:ss");
	
	String s=sdf.format(d);
	System.out.println(s);
	
	
	//String---Date
	String ss=new String("2009-12-22 22:23:22");
	SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�˴���ʽҪ��String�ĸ�ʽһ��
	Date d1=sdf1.parse(ss);
	System.out.println(d1);
}
}
