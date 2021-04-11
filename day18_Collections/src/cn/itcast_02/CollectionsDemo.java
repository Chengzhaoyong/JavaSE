package cn.itcast_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 *    
 */
public class CollectionsDemo {
		public static void main(String[] args) {
			List<Student> list=new ArrayList<Student>();
			
			Student s1=new Student("�ܽ���",21);
			Student s2=new Student("������",18);
			Student s3=new Student("������",20);
			Student s4=new Student("������",19);
			
			list.add(s1);
			list.add(s2);
			list.add(s3);
			list.add(s4);
			
		//	Collections.sort(list);//��Ȼ����
			 
		Collections.sort(list,new Comparator<Student>() {//�Ƚ�������
		public int compare(Student s1,Student s2) {
			int num=s2.getAge()-s1.getAge();
			int num2=num==0?s1.getName().compareTo(s2.getName()):num;
			return num2;
		}
		});
			for(Student s:list) {
				System.out.println(s.getName()+"----"+s.getAge());
			}
		}
}
