package cn.itcast_04;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo2 {
		public static void main(String[] args) {
			TreeMap<Student,String> tm=new TreeMap<Student,String>(new Comparator<Student>() {
			public int compare(Student s1,Student s2) {
				int num=s1.getAge()-s2.getAge();
				int num2=num==0?s1.getName().compareTo(s2.getName()):num;
				return num2;
			}
			});
			
			
			
			Student s1=new Student("�Ʋ���",23);
			Student s2=new Student("�˰�",30);
			Student s3=new Student("ף֦ɽ",25);
			Student s4=new Student("����",45);
			
			tm.put(s1,"�γ�");
			tm.put(s2,"����");
			tm.put(s3,"�Ƴ�");
			tm.put(s4,"Ԫ��");
			
			Set<Student> set=tm.keySet();
			for(Student s:set) {
				System.out.println(s.getName()+"-----"+s.getAge()+"-----"+tm.get(s));
			}
			
		}
}
