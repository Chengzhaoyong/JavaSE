package cn.itcast_06;

import java.util.ArrayList;
import java.util.Iterator;

/*
 *    ȥ��ArrayList�е��ظ�Ԫ��
 */
public class ArrayListDemo {
			public static void main(String[] args) {
				ArrayList array=new ArrayList();
				array.add("hello");
				array.add("world");
				array.add("java");
				array.add("hello");
				array.add("hello");
				array.add("world");
				array.add("java");
				array.add("java");
				array.add("java");
				array.add("world");
				
				//�����µļ���
				ArrayList newArray=new ArrayList();
				//����������
//				Iterator i=array.iterator();
//				while(i.hasNext()) {
//					String s=(String)i.next();
//					if(!newArray.contains(s)) {
//						newArray.add(s);
//					}
//				}
				
				//�ڶ��ַ���
				for(int i=0;i<array.size()-1;i++) {
					for(int j=i+1;j<array.size();j++) {
						if(array.get(i).equals(array.get(j))) {
							array.remove(j);
							j--;//��ֹ©��
						}
					}
				}
				System.out.println(array);
			}
}
