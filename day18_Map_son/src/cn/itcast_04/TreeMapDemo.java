package cn.itcast_04;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		 TreeMap<String,String> tm=new TreeMap<String,String>();
		 
		 tm.put("hello", "���");
		 tm.put("world", "����");
		 tm.put("java", "צ��");
		 tm.put("hello", "���2");
		 
		 Set<String> set=tm.keySet();
		 
		 for(String key:set) {
			 String value=tm.get(key);
			 
			 System.out.println(key+"-----"+value);
		 }
	}
}
