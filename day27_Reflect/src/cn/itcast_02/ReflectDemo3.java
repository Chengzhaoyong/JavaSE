package cn.itcast_02;

import java.lang.reflect.Constructor;

public class ReflectDemo3 {
	
	public static void main(String[] args) throws Exception{
		Class c=Class.forName("cn.itcast_01.Person");
		
		Constructor con=c.getDeclaredConstructor(String.class);
		
		con.setAccessible(true);//值为 true 则指示反射的对象在使用时应该取消 Java 语言访问检查
		Object obj=con.newInstance("linqinxia");
		System.out.println(obj);
		
	}

}
