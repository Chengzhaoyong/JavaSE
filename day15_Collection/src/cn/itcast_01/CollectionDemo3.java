package cn.itcast_01;

import java.util.ArrayList;
import java.util.Collection;

/*
 *    boolean addAll(Collection c):添加一个集合的元素
 *    boolean removeAll（Collection c）：移除一个集合的元素（是一个还是所有）
 *    boolean containsAll(Collection c):判断集合中是否包含指定集合元素（是一个还是所有）
 *    boolean retainAll(Collection c):两个集合都有的元素
 */
public class CollectionDemo3 {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();

		c1.add("abc1");
		c1.add("abc2");
		c1.add("abc3");
		c1.add("abc4");

		// 第二个集合
		Collection c2 = new ArrayList();

		c2.add("abc4");
		c2.add("abc5");
		c2.add("abc6");
		c2.add("abc7");
		
		// boolean addAll(Collection c):添加一个集合的元素
		//System.out.println(c1.addAll(c2));
		
		// boolean removeAll（Collection c）：移除一个集合的元素（是一个还是所有）
		//System.out.println(c1.removeAll(c2));
		//只要一个元素移除，就true
		
		// boolean containsAll(Collection c):判断集合中是否包含指定集合元素（是一个还是所有）
		//System.out.println(c1.containsAll(c2));
		//只有包含所有的元素，才叫包含
		
		 //boolean retainAll(Collection c):两个集合都有的元素
		System.out.println(c1.retainAll(c2));
		//c1对c2作交集，最终结果保存在c1,c2不变
		//返回值表示c1是否发生改变
		System.out.println("c1:"+c1);
		System.out.println("c2:"+c2);
		
		
	}
}
