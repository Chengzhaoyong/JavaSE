package cn.itcast_01;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
 *      List�Ĺ��ܣ�
 *        A����ӹ��ܣ�
 *            void add(int index,Object element):��ָ��λ�����Ԫ��
 *        B����ȡ���ܣ�
 *              object get(int index):��ȡָ��λ�õ�Ԫ��
 *        C���б��������
 *             ListIterator listIterator():list�������еĵ�����
 *        D��ɾ�����ܣ�
 *             Object remove(int index):��������ɾ��Ԫ�أ����ر�ɾ����Ԫ��
 *        E���޸Ĺ��ܣ�
 *              Object set(int index,Object element):���������޸�Ԫ��
 */
public class ListDemo02 {
			public static void main(String[] args) {
				List list=new ArrayList();
				list.add("hello");
				list.add("world");
				list.add("java");
				
			//	 A����ӹ��ܣ�
			//	 void add(int index,Object element):��ָ��λ�����Ԫ��
				list.add(3,"haha");
			
	     	//  B����ȡ���ܣ�
			//  object get(int index):��ȡָ��λ�õ�Ԫ��
				
			//	System.out.println(list.get(3));
				
		//  C���б��������
		// ListIterator listIterator():list�������еĵ�����
			/*	ListIterator lit=list.listIterator();
				while(lit.hasNext()) {
					String s=(String)lit.next();
					System.out.println(s);
					
				}
				
				*/
			// D��ɾ�����ܣ�
		// Object remove(int index):��������ɾ��Ԫ�أ����ر�ɾ����Ԫ��	
//				System.out.println(list.remove(2));
//				System.out.println(list);
				
		//  E���޸Ĺ��ܣ�
		// Object set(int index,Object element):���������޸�Ԫ��
				
				list.set(2, "zhenhao");
				System.out.println(list);
	    
			}
}
