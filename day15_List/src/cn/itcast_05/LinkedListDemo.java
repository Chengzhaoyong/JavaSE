package cn.itcast_05;

import java.util.LinkedList;

/*
 *  LinkedList�����й��ܣ�
 *        		A����ӹ��ܣ�
 *        			public void addFirst(Object obj)
 *     			   public void addLast(Object obj)
 *				B:��ȡ���ܣ�
 *						public Object getFirst()
 *						public Object getLast();
 *				C:ɾ�����ܣ�
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
