package cn.itcast_01;

import java.util.Calendar;

/*
 *   public void add(int field,int amount):根据给定的日历字段和对应的时间，对当前的的日历进行操作
 *   public final void set(int year,int month,int date):设置当前日历的年月日
 */
public class CalendarDemo2 {
	public static void main(String[] args) {
		//获取当前的日历时间
		Calendar c=Calendar.getInstance();
		
		
		int year=c.get(Calendar.YEAR);
		int month=c.get(Calendar.MONTH);
		int day=c.get(Calendar.DATE);
		
		System.out.println(year+"年"+(month+1)+"月"+day+"日");
		c.add(Calendar.YEAR, -3);
		c.add(Calendar.MONTH, -3);
		c.add(Calendar.DATE, -56);

		int year1=c.get(Calendar.YEAR);
		int month1=c.get(Calendar.MONTH);
		int day1=c.get(Calendar.DATE);
		System.out.println(year1+"年"+(month1+1)+"月"+day1+"日");
		
		//set  设置年月日
		c.set(2010, 2, 13);

		 year=c.get(Calendar.YEAR);
		 month=c.get(Calendar.MONTH);
	  day=c.get(Calendar.DATE);
		
		System.out.println(year+"年"+(month+1)+"月"+day+"日");
	}
}
