package cn.itcast_01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*
 * ArrayList: �ײ����ݽṹ�����飬��ѯ�죬��ɾ�졣�̲߳���ȫ��Ч�ʸ�
   Vector:�ײ����ݽṹ�����飬��ѯ�죬��ɾ�����̰߳�ȫ��Ч�ʵ͡�
    LinkedList:�ײ����ݽṹ��������ѯ������ɾ�죬�̲߳���ȫ��Ч�ʸ�
 * 
 */
public class ListDemo {

		public static void main(String[] args) {
			//��������
			List list=new ArrayList();
			list.add("hello");
			list.add("world");
			list.add("java");
			
			Iterator i=list.iterator();
			
			while(i.hasNext()) {
				String s=(String)i.next();
				System.out.println(s);
			}
		}
}
