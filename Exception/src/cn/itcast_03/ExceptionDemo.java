package cn.itcast_03;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
 *   ��try���淢�������jvm�����������һ���쳣����Ȼ�������Զ����׳�����catch����������ƥ��
 *   ����ö�����ĳ�����͵ģ��ͻ�ִ�и�catch����Ĵ�����Ϣ
 *   
 *   �쳣����Ҫ�˽�ļ���������
 *   public String getMessage():�쳣����Ϣ�ַ���
 *   public String toString():�����쳣�ļ���Ϣ����
 *      �˶������name��ȫ·����
 *      ���� ����ð�źͿո�
 *      ���ô˶���getLocalizeMessage()�����Ľ����Ĭ�Ϸ��ص���getMessage()�����ݣ�
 */
public class ExceptionDemo {
		public static void main(String[] args) {
			String s="2019-06-22 ";
			SimpleDateFormat a=new SimpleDateFormat("yyyy-MM-dd ");
			try {
      	Date d=a.parse(s);//������һ��ParseException����Ȼ���׳�����catch�������ƥ��
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
