package cn.itcast_01;

import java.util.ArrayList;
import java.util.Collection;

/*|
 *  集合的遍历：其实就是依次获取集合中的每个元素
 *  Object[] toArray():把集合转换为数组，可以实现集合的遍历
 */
public class CollectionDemo4 {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		c.add("hello");
		c.add("world");
		c.add("java");
		
		//遍历
		// Object[] toArray():把集合转换为数组，可以实现集合的遍历
		Object[] objs=c.toArray();
		for(int x=0;x<objs.length;x++) {
			//System.out.println(objs[x]);
			//我知道元素是字符串，获取元素的同时，还想知道元素的长度
			//把元素转换为字符串，向下转型
			String s=(String)objs[x];
			System.out.println(s+"------"+s.length());
		}
	}

}
