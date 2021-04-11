
package cn.itcast_01;

import java.util.Date;

/*
 *     public long getTime():获取当前时间，以毫秒为单位
 *     public void setTime(long time):设置时间
 *     
	从Date得到一个毫秒值
	  getTime()
	  
	以毫秒值转换Date
	    构造方法
	     setTime(long time)

 */
public class DateDemo {
		public static void main(String[] args) {
			Date d=new Date();
			
			long time=d.getTime();
			System.out.println(time);
			System.out.println("d:"+d);
			
			//设置时间
			d.setTime(time);
			System.out.println("d:"+d);
			
		}
}
