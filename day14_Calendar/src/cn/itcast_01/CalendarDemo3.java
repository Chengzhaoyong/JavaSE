package cn.itcast_01;

import java.util.Calendar;
import java.util.Scanner;
/*
 *  �����κ����2���ж�����
 */
public class CalendarDemo3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�������꣺");
	    int year=sc.nextInt();
	 Calendar c=Calendar.getInstance();
	 
	 c.set(year,2,1);
	 c.add(Calendar.DATE, -1);
	 System.out.println(c.get(Calendar.DATE));
	}
}
