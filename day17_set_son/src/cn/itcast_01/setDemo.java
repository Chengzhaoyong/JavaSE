package cn.itcast_01;

import java.util.HashSet;
import java.util.Set;

/*
 *   Collection
 *      List:���򣨴洢˳���ȥ˳��һ�£������ظ�
 *      Set:���򣬲����ظ�
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
