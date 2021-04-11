package cn.itcast_03;

import java.util.LinkedHashMap;
import java.util.Set;

/*
 *   LinkedHashMap:是Map接口的哈希表和链表列表实现，具有可预知的迭代顺序
 *   有哈希表保证键的唯一性
 *   有链表保证键的有序（存储和取出的顺序一致）
 */
public class LinkedHashMapDemo {
		public static void main(String[] args) {
			LinkedHashMap<String,String> hm=new LinkedHashMap<String,String>();
			
			
			hm.put("0001","hello");
			hm.put("0002","world");
			hm.put("0003","javase");
			hm.put("0004","javaee");
			
			Set<String> set=hm.keySet();
			for(String key:set) {
				String value=hm.get(key);
				
				System.out.println(key+"----"+value);
			}
		}
}
