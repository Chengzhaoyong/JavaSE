package cn.itcast_04;

import java.util.TreeSet;

public class TreeSetDemo2 {
		public static void main(String[] args) {
			TreeSet<Student> ts=new TreeSet<Student>();
			
			Student s1=new Student("s",23);
			Student s2=new Student("ss",13);
			Student s3=new Student("s",23);
			Student s4=new Student("sss",43);
			Student s5=new Student("ss",23);
			
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
