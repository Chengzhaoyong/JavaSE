package cn.itcast_02;

import java.lang.reflect.Constructor;

public class ReflectDemo3 {
	
	public static void main(String[] args) throws Exception{
		Class c=Class.forName("cn.itcast_01.Person");
		
		Constructor con=c.getDeclaredConstructor(String.class);
		
		con.setAccessible(true);//ֵΪ true ��ָʾ����Ķ�����ʹ��ʱӦ��ȡ�� Java ���Է��ʼ��
		Object obj=con.newInstance("linqinxia");
		System.out.println(obj);
		
	}

}
