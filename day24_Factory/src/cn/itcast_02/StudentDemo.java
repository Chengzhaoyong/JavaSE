package cn.itcast_02;
/*
 *   ����ģʽ����֤�����ڴ���ֻ��һ������
 *   
 *   ��α�֤�����ڴ���ֻ��һ��������
 *   
 *   A���ѹ��췽��˽��
 *   B���ڳ�Աλ���Լ�����һ������
 *   C��ͨ��һ�������ķ����ṩ����
 */
public class StudentDemo {
			public static void main(String[] args) {
				Student s=Student.getStudent();
				Student s1=Student.getStudent();
				System.out.println(s==s1);
				
				System.out.println(s);
				System.out.println(s1);
			}
}
