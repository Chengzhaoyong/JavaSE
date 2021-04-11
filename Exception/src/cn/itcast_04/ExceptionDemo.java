package cn.itcast_04;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
 * 有些异常我们没有权限处理
 * java针对这种情况，就提供了另一种情况方案1：抛出
 * 
 * 注意：尽量不要main方法上抛出异常
 *    小结：
 *       编译异常抛出，将来调用者必须处理
 *       运行期异常抛出，将来调用可以不用处理
 */
public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("今天天气很好");
		try {
			method();
		}catch(ParseException e) {
			e.printStackTrace();
			
		}
		System.out.println("但是今天没有雾霾");
		method2();
	}
	
	
	public static void method2() throws ArithmeticException{
		int a=10;
		int b=0;
		System.out.println(a/b);
	}
	public static void method()throws ParseException{
		String s="2019-11-12";
		SimpleDateFormat a=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d=a.parse(s);
		System.out.println(d);
	}
}
