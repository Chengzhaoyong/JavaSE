package cn.itcast_03;

import java.util.LinkedHashSet;
/*
 *  LinkedHashSet的底层数据结构是哈希表和链表组成
 *  哈希表是保证元素的唯一性
 *  链表是保证元素的有序性
 *  
 */
public class LinkedHashSetDemo {
		public static void main(String[] args) {
			//创建集合对象
			LinkedHashSet<String> hs=new LinkedHashSet<String>();
			
			//集合添加元素
			hs.add("hello");
			hs.add("world");
			hs.add("java");
			for(String s:hs) {
				System.out.println();
			}
			
		}
}
