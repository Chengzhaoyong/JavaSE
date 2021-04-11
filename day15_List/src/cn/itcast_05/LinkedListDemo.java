package cn.itcast_05;

import java.util.LinkedList;

/*
 *  LinkedList的特有功能：
 *        		A：添加功能：
 *        			public void addFirst(Object obj)
 *     			   public void addLast(Object obj)
 *				B:获取功能：
 *						public Object getFirst()
 *						public Object getLast();
 *				C:删除功能：
 *  					public Object removeFirst()
 *  					public Object removeLast()
 */
public class LinkedListDemo {
		public static void main(String[] args) {
	LinkedList link=new LinkedList();
			
			link.add("hello");
			link.add("world");
			link.add("java");
			
			System.out.println(link.removeFirst());
			link.addLast("javaee");
			System.out.println(link);
		}
		
}
