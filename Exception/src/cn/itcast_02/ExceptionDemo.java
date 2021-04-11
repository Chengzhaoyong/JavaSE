package cn.itcast_02;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
 *   编译异常与运行异常的区别
 *   编译异常：java程序必须显示处理，否则程序出现错误，无法通过编译
 *   
 *   运行异常：无需显示处理，也可以和编译时异常一样处理
 */
public class ExceptionDemo {
		public static void main(String[] args) {
			String s="2019-5-1";
			SimpleDateFormat a=new SimpleDateFormat("yyyy-MM-dd");
			try {
				Date d=a.parse(s);
				System.out.println(s);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("解析日期出现问题");
			}
			System.out.println("over");
		}
}
