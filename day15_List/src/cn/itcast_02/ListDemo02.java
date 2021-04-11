package cn.itcast_02;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
 *    �б��������
 *      ListIterator listIterator():List�������еĵ�����
 *      �õ������̳���Iterator�����������ԣ��Ϳ���ֱ��ʹ��hasNext()��next()����
 *      
 *      ���й��ܣ�
 *         Object previous():��ȡ��һ��Ԫ��
 *         boolean hasPrevious():�ж��Ƿ���Ԫ��
 *         �������û���壬ֻ����������������������
 */
public class ListDemo02 {
       public static void main(String[] args) {
		List list=new ArrayList();
		
		list.add("hello");
		list.add("world");
		list.add("java");
		
		ListIterator lit=list.listIterator();
		while(lit.hasNext()) {
			String s=(String)lit.next();
			System.out.println(s);
		}
		
		System.out.println("======");
		//�������
		while(lit.hasPrevious()) {
			String s=(String)lit.previous();
			System.out.println(s);
		}
	}
}
