package cn.itcast_01;

import java.util.ArrayList;

public class ArrayListDemo {
		public static void main(String[] args) {
			ArrayList<ArrayList<Student>> array=new ArrayList<ArrayList<Student>>();
		    
			//��һ������
			Student s1=new Student("��ɮ",19);
			Student s2=new Student("��˽�",16);
			Student s3=new Student("�����",69);
			Student s4=new Student("������",14);
			Student s5=new Student("ɳɮ",39);
			
			ArrayList<Student> array1=new ArrayList<Student>();
			array1.add(s1);
			array1.add(s2);
			array1.add(s3);
			array1.add(s4);
			array1.add(s5);
			
			//�ڶ�������
			Student s11=new Student("��ɮ1",19);
			Student s22=new Student("��˽�1",16);
			Student s33=new Student("�����1",69);
			Student s44=new Student("������1",14);
			Student s55=new Student("ɳɮ1",39);
			
			ArrayList<Student> array11=new ArrayList<Student>();
			array11.add(s11);
			array11.add(s22);
			array11.add(s33);
			array11.add(s44);
			array11.add(s55);
			
			//����������
			Student s111=new Student("��ɮ2",19);
			Student s222=new Student("��˽�2",16);
			Student s333=new Student("�����2",69);
			Student s444=new Student("������2",14);
			Student s555=new Student("ɳɮ2",39);
			
			ArrayList<Student> array111=new ArrayList<Student>();
			array111.add(s111);
			array111.add(s222);
			array111.add(s333);
			array111.add(s444);
			array111.add(s555);
			
			array.add(array1);
			array.add(array11);
			array.add(array111);
			
			for(ArrayList<Student> arr:array) {
				for(Student s:arr) {
				//	Student ss=(Student)s;
					System.out.println(s.getName()+"---"+s.getAge());
				}
			}
		}
}
