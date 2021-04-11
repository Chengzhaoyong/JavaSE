package cn.itcast_03;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
 *   在try里面发现问题后，jvm会帮我们生成一个异常对象，然后把这个对对象抛出，和catch里面的类进行匹配
 *   如果该对象是某个类型的，就会执行该catch里面的处理信息
 *   
 *   异常处理要了解的几个方法：
 *   public String getMessage():异常的消息字符串
 *   public String toString():返回异常的简单信息描述
 *      此对象的类name（全路径）
 *      ”： “（冒号和空格）
 *      调用此对象getLocalizeMessage()方法的结果（默认返回的是getMessage()的内容）
 */
public class ExceptionDemo {
		public static void main(String[] args) {
			String s="2019-06-22 ";
			SimpleDateFormat a=new SimpleDateFormat("yyyy-MM-dd ");
			try {
      	Date d=a.parse(s);//创建了一个ParseException对象，然后抛出，和catch里面进行匹配
			System.out.println(d);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
			e.printStackTrace();
			//	System.out.println(e.getMessage());
				//Unparseable date: "2019-11-12"
			//   System.out.println(e.toString());
			}//java.text.ParseException: Unparseable date: "2019-11-12"
			
			System.out.println("over");
		}
}
