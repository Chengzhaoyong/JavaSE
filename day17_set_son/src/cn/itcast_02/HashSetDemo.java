package cn.itcast_02;

import java.util.HashSet;
import java.util.Iterator;/*

HashSet:存储字符串
   为什么没有出现两个hello 
   通过查找add方法的源码，我们知道这个方法底层两个方法：hashCode()和equals()
   
   步骤：
      首先比较哈希值
      如果相同，继续走，比较地址值或者equals方法
         
      如果不同，就直接添加到集合中
       
       按照方法的步骤来说
          先看hashCode()值是否相同
            相同：继续走equals方法
                   返回true：说明元素重复，就不添加
                   返回false:说明元素不重复，就添加到集合中
             
            不同：就直接添加到集合中
*/

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("hallo");
		hs.add("hello");
		hs.add("hafrf");
		
		Iterator<String> i=hs.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		for(String s:hs) {
			System.out.println(s);
		}
	}
}
