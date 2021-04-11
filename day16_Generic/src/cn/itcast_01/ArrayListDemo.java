package cn.itcast_01;

import java.util.ArrayList;
import java.util.Iterator;
public  class ArrayListDemo {
		public static void main(String[] args) {
			ArrayList<String> array=new ArrayList<String>();
			
			array.add("hello");
			array.add("world");
			array.add("java");
			
			Iterator<String> i=array.iterator();
			while(i.hasNext()) {
				String s=i.next();
				System.out.println(s);
			}
			System.out.println("==============");
			
			for(int ii=0;ii<array.size();ii++) {
				String s=array.get(ii);
				System.out.println(s);
			}
		}
}
