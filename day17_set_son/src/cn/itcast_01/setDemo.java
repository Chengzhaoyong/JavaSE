package cn.itcast_01;

import java.util.HashSet;
import java.util.Set;

/*
 *   Collection
 *      List:有序（存储顺序和去顺序一致），可重复
 *      Set:无序，不可重复
 */
public class setDemo {
		public static void main(String[] args) {
			Set<String> set=new HashSet<String>();
			set.add("javase");
			set.add("hello");
			set.add("java");
			set.add("world");
			set.add("xixi");
			
			for(String s:set) {
				System.out.println(s);
			}
		}
}
