package cn.itcast_02;

import java.lang.reflect.Constructor;

public class ReflectDemo2 {
	public static void main(String[] args) throws Exception{
		Class c=Class.forName("cn.itcast_01.Person");
		
		Constructor con=c.getConstructor(String.class,int. class,String.class);
		
		
		Object obj=con.newInstance("����ϼ",23,"�ÿ�");
		System.out.println(obj);
		
	}

}
