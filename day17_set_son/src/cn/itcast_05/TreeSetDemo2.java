package cn.itcast_05;

import java.util.TreeSet;
/*
 *   ����������ĳ�������
 *     TreeSet���ϱ�֤Ԫ��Ψһ�Ժ������ԭ��
 *       Ψһ�ԣ��Ǹ��ݱȽϵķ����Ƿ�Ϊ0��������
 *       ����
 *          A����Ȼ����Ԫ�ؾ߱��Ƚ��ԣ�
 *                                  ��Ԫ����������ʵ����Ȼ����Ľӿ�
 *          B���Ƚ������򣨼��Ͼ߱�����
 *                                  �ü��ϵĹ��췽������һ���Ƚ����ӿڵ��������Comparator
 */
public class TreeSetDemo2 {
		public static void main(String[] args) {
			TreeSet<Student> ts=new TreeSet<Student>(new MyComparator());
			//TreeSet<Student> ts=new TreeSet<Student>(Comparator comparator)//�Ƚ�����
			//TreeSet<Student> ts=new TreeSet<Student>()//��Ȼ����
			
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
