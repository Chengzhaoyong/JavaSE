package cn.itcast_02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class MyYearDemo {
		public static void main(String[] args) throws ParseException {
			Scanner sc=new Scanner(System.in);//键盘输入你的出生日期
			System.out.println("请输入你的出生日期：");
			
			String s=sc.nextLine();
			
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");//日期格式对象
			Date d=sdf.parse(s);
			//以毫秒值做单位
			long myTime=d.getTime();
			long nowTime=System.currentTimeMillis();
			System.out.println((nowTime-myTime)/1000/60/60/24);
		}
}
