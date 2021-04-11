package cn.itcast_03;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		ArrayList<Integer> array=new ArrayList<Integer>();
		
		Class c=array.getClass();
		Method m=c.getMethod("add",Object.class);
		
		m.invoke(array, "hello");
		System.out.println(array);
	}

}
