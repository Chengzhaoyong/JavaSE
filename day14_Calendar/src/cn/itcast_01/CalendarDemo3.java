package cn.itcast_01;

import java.util.Calendar;
import java.util.Scanner;
/*
 *  计算任何年的2月有多少天
 */
public class CalendarDemo3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入年：");
	    int year=sc.nextInt();
	 Calendar c=Calendar.getInstance();
	 
	 c.set(year,2,1);
	 c.add(Calendar.DATE, -1);
	 System.out.println(c.get(Calendar.DATE));
	}
}
