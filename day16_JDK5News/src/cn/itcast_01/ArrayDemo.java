package cn.itcast_01;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayDemo {
		public static void main(String[] args) {
			ArrayList<String> array=new ArrayList<String>();
			
			array.add("hello");
			array.add("world");
			array.add("java");
			
		  //��һ�ַ���
			Iterator<String> i=array.iterator();
			while(i.hasNext()) {
				String s=i.next();
				System.out.println(s);
			}
			
			//�ڶ��ַ���
			for(int i1=0;i1<array.size();i1++) {
				String s=array.get(i1);
				System.out.println(s);
			}
			
			//�����з���
			for(String s:array) {
				System.out.println(s);
			}
		}
}
