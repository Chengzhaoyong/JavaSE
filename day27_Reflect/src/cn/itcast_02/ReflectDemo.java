package cn.itcast_02;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class c=Class.forName("cn.itcast_01.Person");
		
		Constructor con=c.getConstructor();//获取构造函数的对象
		Object obj=con.newInstance();//实例化
		
		System.out.println(obj);
		
	}
	
	

}
