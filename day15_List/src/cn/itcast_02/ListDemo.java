package cn.itcast_02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("hello");
		list.add("world");
		list.add("java");
		
		//第一种方式遍历
		Iterator i=list.iterator();
		while(i.hasNext()) {
			String s=(String)i.next();
			System.out.println(s);
		}
		System.out.println("=============");
		
		//for循环遍历
		for(int i1=0;i1<list.size();i1++) {
			String s=(String)list.get(i1);
			System.out.println(s);
		}
		
	}
}
