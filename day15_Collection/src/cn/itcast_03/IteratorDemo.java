package cn.itcast_03;
import java.util.*;
/*
 *   Iterator iterator():迭代器，集合的专用遍历方式
 *     获取元素：object next(),并移动到下一个元素位置
 *     
 *     boolean hasNext():如果还可以迭代，就返回true
 */
public class IteratorDemo {
		public static void main(String[] args) {
			Collection c=new ArrayList();
			c.add("hello");
			c.add("world");
			c.add("java");
			
			
			Iterator i=c.iterator();
//			Object obj=i.next();
//			System.out.println(obj);
          
			while(i.hasNext()) {
				System.out.println(i.next());
			}
		}
}
