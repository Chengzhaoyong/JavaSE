package cn.itcast_06;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
 *  finally:被finally控制的语句一定执行
 *  注意：如果在执行到finally之前jvm退出了，就不能执行了
 *  
 *    用于释放资源，在io流操作和数据库操作中可以见到
 */

public class ExceptionDemo {
		public static void main(String[] args) {
			String s="2019-11-12";
			SimpleDateFormat a=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			
			Date d=null;
			try {				System.exit(0);

				d=a.parse(s);
			}
			catch(ParseException e) {
				e.printStackTrace();
				
			}
			finally {
				System.out.println("这里的代码可以执行");
			}
		}
}
