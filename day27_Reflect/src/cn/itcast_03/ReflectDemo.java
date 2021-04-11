package cn.itcast_03;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;





public class ReflectDemo {
	public static void main(String[] args) throws Exception{
		Class c=Class.forName("cn.itcast_01.Person");
		
		Constructor con=c.getConstructor();
		
		Object obj=con.newInstance();
		
		 Field nameField=c.getDeclaredField("name");
		 nameField.setAccessible(true);
		 nameField.set(obj,"chengzhaoyong");
		 System.out.println(nameField);
		
		//方法：
		 Method m1=c.getMethod("show");
		 
		m1.invoke(obj);
		System.out.println("----------");
		//带参数
		Method m2=c.getMethod("method",String.class);
		m2.invoke(obj, "helloworld");
		
		
		
		
		
	}

}
