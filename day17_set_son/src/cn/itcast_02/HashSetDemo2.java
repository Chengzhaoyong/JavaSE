package cn.itcast_02;

import java.util.HashSet;
/*
 *   ���󣺴洢�Զ�����󣬲���֤Ԫ�ص�Ψһ��
 *   Ҫ�������������ĳ�Ա��������ͬ����Ϊһ��Ԫ��
 *   
 *   Ŀǰ�������ҵ�Ҫ����Ϊ����֪��HashSet�ײ���������hashCode()��equals()����
 *   ������������������ѧ����û�г�Ѫ�����ԣ�Ĭ��ʹ�õ���object��
 *    ���ʱ�����ǵĹ�ϣֵ��һ���������Ͳ�������жϣ�ִ������Ӳ���
 */
public class HashSetDemo2 {
public static void main(String[] args) {
	HashSet<Student> hs=new HashSet<Student>();
	
	//����ѧ������
	Student s1=new Student("����ϼ1",23);
	Student s2=new Student("����ϼ2",52);
	Student s3=new Student("����ϼ1",23);
	Student s4=new Student("����ϼ1",15);
	Student s5=new Student("����ϼ5",38);
	
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
