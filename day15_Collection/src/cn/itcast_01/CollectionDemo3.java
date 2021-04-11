package cn.itcast_01;

import java.util.ArrayList;
import java.util.Collection;

/*
 *    boolean addAll(Collection c):���һ�����ϵ�Ԫ��
 *    boolean removeAll��Collection c�����Ƴ�һ�����ϵ�Ԫ�أ���һ���������У�
 *    boolean containsAll(Collection c):�жϼ������Ƿ����ָ������Ԫ�أ���һ���������У�
 *    boolean retainAll(Collection c):�������϶��е�Ԫ��
 */
public class CollectionDemo3 {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();

		c1.add("abc1");
		c1.add("abc2");
		c1.add("abc3");
		c1.add("abc4");

		// �ڶ�������
		Collection c2 = new ArrayList();

		c2.add("abc4");
		c2.add("abc5");
		c2.add("abc6");
		c2.add("abc7");
		
		// boolean addAll(Collection c):���һ�����ϵ�Ԫ��
		//System.out.println(c1.addAll(c2));
		
		// boolean removeAll��Collection c�����Ƴ�һ�����ϵ�Ԫ�أ���һ���������У�
		//System.out.println(c1.removeAll(c2));
		//ֻҪһ��Ԫ���Ƴ�����true
		
		// boolean containsAll(Collection c):�жϼ������Ƿ����ָ������Ԫ�أ���һ���������У�
		//System.out.println(c1.containsAll(c2));
		//ֻ�а������е�Ԫ�أ��Žа���
		
		 //boolean retainAll(Collection c):�������϶��е�Ԫ��
		System.out.println(c1.retainAll(c2));
		//c1��c2�����������ս��������c1,c2����
		//����ֵ��ʾc1�Ƿ����ı�
		System.out.println("c1:"+c1);
		System.out.println("c2:"+c2);
		
		
	}
}
