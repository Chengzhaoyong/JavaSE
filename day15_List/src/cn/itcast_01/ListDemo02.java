package cn.itcast_01;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
 *      List的功能：
 *        A：添加功能：
 *            void add(int index,Object element):在指定位置添加元素
 *        B：获取动能：
 *              object get(int index):获取指定位置的元素
 *        C：列表迭代器：
 *             ListIterator listIterator():list集合特有的迭代器
 *        D；删除功能：
 *             Object remove(int index):根据索引删除元素，返回被删除的元素
 *        E：修改功能：
 *              Object set(int index,Object element):根据索引修改元素
 */
public class ListDemo02 {
			public static void main(String[] args) {
				List list=new ArrayList();
				list.add("hello");
				list.add("world");
				list.add("java");
				
			//	 A：添加功能：
			//	 void add(int index,Object element):在指定位置添加元素
				list.add(3,"haha");
			
	     	//  B：获取动能：
			//  object get(int index):获取指定位置的元素
				
			//	System.out.println(list.get(3));
				
		//  C：列表迭代器：
		// ListIterator listIterator():list集合特有的迭代器
			/*	ListIterator lit=list.listIterator();
				while(lit.hasNext()) {
					String s=(String)lit.next();
					System.out.println(s);
					
				}
				
				*/
			// D；删除功能：
		// Object remove(int index):根据索引删除元素，返回被删除的元素	
//				System.out.println(list.remove(2));
//				System.out.println(list);
				
		//  E：修改功能：
		// Object set(int index,Object element):根据索引修改元素
				
				list.set(2, "zhenhao");
				System.out.println(list);
	    
			}
}
