
package cn.itcast_01;

import java.util.Date;

/*
 *     public long getTime():��ȡ��ǰʱ�䣬�Ժ���Ϊ��λ
 *     public void setTime(long time):����ʱ��
 *     
	��Date�õ�һ������ֵ
	  getTime()
	  
	�Ժ���ֵת��Date
	    ���췽��
	     setTime(long time)

 */
public class DateDemo {
		public static void main(String[] args) {
			Date d=new Date();
			
			long time=d.getTime();
			System.out.println(time);
			System.out.println("d:"+d);
			
			//����ʱ��
			d.setTime(time);
			System.out.println("d:"+d);
			
		}
}
