package cn.itcast_09;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
/*
 *  �쳣ע�����
 A��������д����ķ���ʱ������ķ��������׳���ͬ���쳣�����쳣�����ࣨ���׻��ˣ����Ӳ��ܱȸ��׸�����
 B����������׳�����쳣��������д����ʱ��ֻ���׳���ͬ���쳣���������Ӽ������಻���׳�����û�е��쳣
 C���������д�ķ���û���׳��쳣����ô����ķ������Բ������׳��쳣��������������쳣��������ô����ֻ��
    try������throws
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
