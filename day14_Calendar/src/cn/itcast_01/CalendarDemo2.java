package cn.itcast_01;

import java.util.Calendar;

/*
 *   public void add(int field,int amount):���ݸ����������ֶκͶ�Ӧ��ʱ�䣬�Ե�ǰ�ĵ��������в���
 *   public final void set(int year,int month,int date):���õ�ǰ������������
 */
public class CalendarDemo2 {
	public static void main(String[] args) {
		//��ȡ��ǰ������ʱ��
		Calendar c=Calendar.getInstance();
		
		
		int year=c.get(Calendar.YEAR);
		int month=c.get(Calendar.MONTH);
		int day=c.get(Calendar.DATE);
		
		System.out.println(year+"��"+(month+1)+"��"+day+"��");
		c.add(Calendar.YEAR, -3);
		c.add(Calendar.MONTH, -3);
		c.add(Calendar.DATE, -56);

		int year1=c.get(Calendar.YEAR);
		int month1=c.get(Calendar.MONTH);
		int day1=c.get(Calendar.DATE);
		System.out.println(year1+"��"+(month1+1)+"��"+day1+"��");
		
		//set  ����������
		c.set(2010, 2, 13);

		 year=c.get(Calendar.YEAR);
		 month=c.get(Calendar.MONTH);
	  day=c.get(Calendar.DATE);
		
		System.out.println(year+"��"+(month+1)+"��"+day+"��");
	}
}
