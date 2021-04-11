package cn.itcast_03;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
     public static void main(String[] args) {
		List list=new ArrayList();
		list.add("hello");
		list.add("world");
		list.add("java");
		
		//java.util.ConcurrentModificationException(并发修改异常，迭代时不能通过集合修改元素，迭代器不知道)
//		ListIterator lit=list.listIterator();
//		while(lit.hasNext()) {
//		  String s=(String)lit.next();
//		  if("world".equals(s)) {
//			  list.add("javaee");
//		  }
//		
//		}
		//第一种迭代器修改元素，Iterator没有添加功能，所以用ListIterator
		ListIterator lit=list.listIterator();
	/*	while(lit.hasNext()) {
			String s=(String)lit.next();
			if("world".equals(s)) {
				lit.add("javaee");   //[hello, world, javaee, java]
			}
		}*/
		
		//第二种遍历集合，集合修改
		for(int i=0;i<list.size();i++) {
			String s=(String)list.get(i);
			if(s.contentEquals("world")) {
				list.add("javaee");
			}
		}
		
		System.out.println(list);
	}
}
