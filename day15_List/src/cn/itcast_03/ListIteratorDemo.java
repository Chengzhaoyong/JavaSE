package cn.itcast_03;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
     public static void main(String[] args) {
		List list=new ArrayList();
		list.add("hello");
		list.add("world");
		list.add("java");
		
		//java.util.ConcurrentModificationException(�����޸��쳣������ʱ����ͨ�������޸�Ԫ�أ���������֪��)
//		ListIterator lit=list.listIterator();
//		while(lit.hasNext()) {
//		  String s=(String)lit.next();
//		  if("world".equals(s)) {
//			  list.add("javaee");
//		  }
//		
//		}
		//��һ�ֵ������޸�Ԫ�أ�Iteratorû����ӹ��ܣ�������ListIterator
		ListIterator lit=list.listIterator();
	/*	while(lit.hasNext()) {
			String s=(String)lit.next();
			if("world".equals(s)) {
				lit.add("javaee");   //[hello, world, javaee, java]
			}
		}*/
		
		//�ڶ��ֱ������ϣ������޸�
		for(int i=0;i<list.size();i++) {
			String s=(String)list.get(i);
			if(s.contentEquals("world")) {
				list.add("javaee");
			}
		}
		
		System.out.println(list);
	}
}
