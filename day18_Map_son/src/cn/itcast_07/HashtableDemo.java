package cn.itcast_07;

import java.util.HashMap;
import java.util.Hashtable;

/*
 *    1.Hashtable和HashMap的区别
 *     Hashtable:线程安全，效率低，不允许null键和null值
 *     HashMap:线程不安全，效率高，允许null键和null值
 *     
 *    2.List,Set和Map接口是否继承子接口Map
 *    List,Set不是继承Map接口，他们继承Collection接口
 *    Map接口本身就是一个顶层接口
 */
public class HashtableDemo {
	
	public static void main(String[] args) {
		Hashtable<String,String> hm=new Hashtable<String,String>();
		
		//hm.put(null,null);不可以
		HashMap<String,String> hm1=new HashMap<String,String>();
		hm1.put(null,null);
		System.out.println(hm1);
	}
	
	

}
