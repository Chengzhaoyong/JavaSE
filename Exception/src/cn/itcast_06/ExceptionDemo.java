package cn.itcast_06;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
 *  finally:��finally���Ƶ����һ��ִ��
 *  ע�⣺�����ִ�е�finally֮ǰjvm�˳��ˣ��Ͳ���ִ����
 *  
 *    �����ͷ���Դ����io�����������ݿ�����п��Լ���
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
				System.out.println("����Ĵ������ִ��");
			}
		}
}
