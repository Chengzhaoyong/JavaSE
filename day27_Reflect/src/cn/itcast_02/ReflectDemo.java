package cn.itcast_02;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class c=Class.forName("cn.itcast_01.Person");
		
		Constructor con=c.getConstructor();//��ȡ���캯���Ķ���
		Object obj=con.newInstance();//ʵ����
		
		System.out.println(obj);
		
	}
	
	

}
