package cn.itcast_01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*
 * ArrayList: 底层数据结构是数组，查询快，增删快。线程不安全，效率高
   Vector:底层数据结构是数组，查询快，增删慢。线程安全，效率低。
    LinkedList:底层数据结构是链表，查询慢，增删快，线程不安全，效率高
 * 
 */
public class ListDemo {

		public static void main(String[] args) {
			//创建对象
			List list=new ArrayList();
			list.add("hello");
			list.add("world");
			list.add("java");
			
			Iterator i=list.iterator();
			
			while(i.hasNext()) {
				String s=(String)i.next();
				System.out.println(s);
			}
		}
}
