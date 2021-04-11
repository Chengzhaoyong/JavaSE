package cn.itcast_09;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
/*
 *  异常注意事项：
 A：子类重写父类的方法时，子类的方法必须抛出相同的异常或父类异常的子类（父亲坏了，儿子不能比父亲更坏）
 B：如果父亲抛出多个异常，子类重写父类时，只能抛出相同的异常或者他的子集，子类不能抛出父类没有的异常
 C：如果被重写的方法没有抛出异常，那么子类的方法绝对不可以抛出异常，如果子类内有异常发生，那么子类只能
    try，不能throws
 */  
public class ExceptionDemo {
		class Fu{
			public void show() throws Exception{
				
			}
			public void method() {
				
			}
		}
		class Zi extends Fu{
			public void show() throws Exception{
				
			}
			public void method() {
				String s="2019-5-1";
				SimpleDateFormat a=new SimpleDateFormat("yyyy-m-d");
				Date d;
				try {
					d = a.parse(s);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}
		}
}
