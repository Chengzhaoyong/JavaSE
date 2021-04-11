package cn.itcast_05;

import java.util.TreeSet;
/*
 *   请根据姓名的长度排序
 *     TreeSet集合保证元素唯一性和排序的原理
 *       唯一性：是根据比较的返回是否为0来决定的
 *       排序：
 *          A：自然排序（元素具备比较性）
 *                                  让元素所属的类实现自然排序的接口
 *          B：比较器排序（集合具备排序）
 *                                  让集合的构造方法接收一个比较器接口的子类对象Comparator
 */
public class TreeSetDemo2 {
		public static void main(String[] args) {
			TreeSet<Student> ts=new TreeSet<Student>(new MyComparator());
			//TreeSet<Student> ts=new TreeSet<Student>(Comparator comparator)//比较排序
			//TreeSet<Student> ts=new TreeSet<Student>()//自然排序
			
			Student s1=new Student("cheng",3);
			Student s2=new Student("zhao",13);
			Student s3=new Student("cheng",23);
			Student s4=new Student("chengzhaoyong",43);
			Student s5=new Student("yong",23);
			
			ts.add(s1);
			ts.add(s2);
			ts.add(s3);
			ts.add(s4);
			ts.add(s5);
			
			
			for(Student s:ts) {
				System.out.println(s.getName()+"-----------"+s.getAge());
			}
		}
}
