package cn.itcast_02;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
 *    列表迭代器：
 *      ListIterator listIterator():List集合特有的迭代器
 *      该迭代器继承了Iterator迭代器，所以，就可以直接使用hasNext()和next()方法
 *      
 *      特有功能：
 *         Object previous():获取上一个元素
 *         boolean hasPrevious():判断是否有元素
 *         这个方法没意义，只有正向遍历，才能逆向遍历
 */
public class ListDemo02 {
       public static void main(String[] args) {
		List list=new ArrayList();
		
		list.add("hello");
		list.add("world");
		list.add("java");
		
		ListIterator lit=list.listIterator();
		while(lit.hasNext()) {
			String s=(String)lit.next();
			System.out.println(s);
		}
		
		System.out.println("======");
		//逆向遍历
		while(lit.hasPrevious()) {
			String s=(String)lit.previous();
			System.out.println(s);
		}
	}
}
