package cn.itcast_02;

import java.util.HashSet;
/*
 *   需求：存储自定义对象，并保证元素的唯一性
 *   要求：如果两个对象的成员变量都相同，则为一个元素
 *   
 *   目前不符合我的要求：因为我们知道HashSet底层依赖的是hashCode()和equals()方法
 *   而这两个方法我们在学生类没有充血，所以，默认使用的是object类
 *    这个时候，我们的哈希值不一样，根本就不会继续判断，执行了添加操作
 */
public class HashSetDemo2 {
public static void main(String[] args) {
	HashSet<Student> hs=new HashSet<Student>();
	
	//创建学生对象
	Student s1=new Student("林青霞1",23);
	Student s2=new Student("林青霞2",52);
	Student s3=new Student("林青霞1",23);
	Student s4=new Student("林青霞1",15);
	Student s5=new Student("林青霞5",38);
	
	hs.add(s1);
	hs.add(s2);
	hs.add(s3);
	hs.add(s4);
	hs.add(s5);
	
	for(Student s:hs){
		System.out.println(s.getName()+"-----------"+s.getAge());
	}
	
}
}
