package cn.itcast_04;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
 * ��Щ�쳣����û��Ȩ�޴���
 * java���������������ṩ����һ���������1���׳�
 * 
 * ע�⣺������Ҫmain�������׳��쳣
 *    С�᣺
 *       �����쳣�׳������������߱��봦��
 *       �������쳣�׳����������ÿ��Բ��ô���
 */
public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("���������ܺ�");
		try {
			method();
		}catch(ParseException e) {
			e.printStackTrace();
			
		}
		System.out.println("���ǽ���û������");
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
