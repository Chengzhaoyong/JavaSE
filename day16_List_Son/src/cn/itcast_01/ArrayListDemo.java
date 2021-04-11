package cn.itcast_01;

import java.util.ArrayList;

public class ArrayListDemo {
		public static void main(String[] args) {
			ArrayList<ArrayList<Student>> array=new ArrayList<ArrayList<Student>>();
		    
			//µÚÒ»¸ö¼¯ºÏ
			Student s1=new Student("ÌÆÉ®",19);
			Student s2=new Student("Öí°Ë½ä",16);
			Student s3=new Student("ËïÎò¿Õ",69);
			Student s4=new Student("°×ÁúÂí",14);
			Student s5=new Student("É³É®",39);
			
			ArrayList<Student> array1=new ArrayList<Student>();
			array1.add(s1);
			array1.add(s2);
			array1.add(s3);
			array1.add(s4);
			array1.add(s5);
			
			//µÚ¶ş¸ö¼¯ºÏ
			Student s11=new Student("ÌÆÉ®1",19);
			Student s22=new Student("Öí°Ë½ä1",16);
			Student s33=new Student("ËïÎò¿Õ1",69);
			Student s44=new Student("°×ÁúÂí1",14);
			Student s55=new Student("É³É®1",39);
			
			ArrayList<Student> array11=new ArrayList<Student>();
			array11.add(s11);
			array11.add(s22);
			array11.add(s33);
			array11.add(s44);
			array11.add(s55);
			
			//µÚÈı¸ö¼¯ºÏ
			Student s111=new Student("ÌÆÉ®2",19);
			Student s222=new Student("Öí°Ë½ä2",16);
			Student s333=new Student("ËïÎò¿Õ2",69);
			Student s444=new Student("°×ÁúÂí2",14);
			Student s555=new Student("É³É®2",39);
			
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
