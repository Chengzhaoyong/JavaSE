package cn.itcast_02;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
 *   �����쳣�������쳣������
 *   �����쳣��java���������ʾ�������������ִ����޷�ͨ������
 *   
 *   �����쳣��������ʾ����Ҳ���Ժͱ���ʱ�쳣һ������
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
				System.out.println("�������ڳ�������");
			}
			System.out.println("over");
		}
}
