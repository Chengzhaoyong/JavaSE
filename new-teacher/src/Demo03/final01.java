package Demo03;

import Demo02.mianshiti;

/*
 * �̳еĴ�������
 * ���ڼ̳з�����һ�����󣺷�����д
 * �ͻḲ�Ǹ���ķ�������������Ҫ�ùؼ���final
 * 
 * final���������࣬����������
 * 
 * �ص㣺
 *    final���������࣬���ǲ��ܱ��̳�
 *    final�������η������÷���������д
 *    final�������α������ñ���������д����Ϊ��������Ǹ�����
 *    ������final  int  age=10;-----���峣��
 *  
 *    �����⣺final���ξֲ�����������
 *    
 *    �������ͣ��������͵�ֵ���ܷ����ı�
 *    ��������:�������͵ĵ�ֵַ���ܷ����ı䣬���ǣ��ö���Ķ��ڴ��е�ֵ�ǿ��Ըı��
 *    
 *       
 */
class Student{
	int age=20;
}
public class final01 {
	public static void main(String[] args) {
		final Student ss=new Student();
		ss.age=200;
		System.out.println(ss.age);
	}
}
