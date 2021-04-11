package cn.itcast_06;

import java.util.ArrayList;
import java.util.Iterator;

/*
 *    去除ArrayList中的重复元素
 */
public class ArrayListDemo {
			public static void main(String[] args) {
				ArrayList array=new ArrayList();
				array.add("hello");
				array.add("world");
				array.add("java");
				array.add("hello");
				array.add("hello");
				array.add("world");
				array.add("java");
				array.add("java");
				array.add("java");
				array.add("world");
				
				//定义新的集合
				ArrayList newArray=new ArrayList();
				//迭代器遍历
//				Iterator i=array.iterator();
//				while(i.hasNext()) {
//					String s=(String)i.next();
//					if(!newArray.contains(s)) {
//						newArray.add(s);
//					}
//				}
				
				//第二种方法
				for(int i=0;i<array.size()-1;i++) {
					for(int j=i+1;j<array.size();j++) {
						if(array.get(i).equals(array.get(j))) {
							array.remove(j);
							j--;//防止漏查
						}
					}
				}
				System.out.println(array);
			}
}
