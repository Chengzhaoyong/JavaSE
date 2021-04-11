package cn.itcast_04;

import java.util.TreeSet;
/*
 *  TreeSet:能够对元素按照某种规则进行排序
 *  排序有两种方式：
 *    A：自然排序
 *    B：比较排序
 */
public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();

		ts.add(23);
		ts.add(34);
		ts.add(11);
		ts.add(2);
		ts.add(2);
		ts.add(22);
		ts.add(21);
		ts.add(21);

		for (Integer i : ts) {
			System.out.println(i);
		}
	}
}
