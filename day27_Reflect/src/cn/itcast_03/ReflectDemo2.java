package cn.itcast_03;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

import java.lang.reflect.Method;

public class ReflectDemo2 {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Properties prop=new Properties();
		
		FileReader fr=new FileReader("class.txt");
		
		prop.load(fr);
		
		//获取数据
		String className=prop.getProperty("className");
		String method=prop.getProperty("methodName");
		
		Class c=Class.forName(className);
	Constructor con=c.getConstructor();
	    Object obj=con.newInstance();
		
		//调用方法
	    Method m=c.getMethod("show");
	    
	    m.invoke(obj);
		
		
		
		
	}

}
