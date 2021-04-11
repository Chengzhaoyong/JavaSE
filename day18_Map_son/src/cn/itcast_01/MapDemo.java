package cn.itcast_01;

import java.util.HashMap;
import java.util.Map;

/*
 *  
 */
public class MapDemo {
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		
		map.put("邓超","孙俪");
		map.put("李易峰", "刘亦菲");
		map.put("刘恺威","杨幂");
		map.put("周杰伦","昆凌");
		
		//V put(K key,V value):添加元素
		//如果是第一次存储，就返回null，第二次存储就用值替换掉，返回以前的值
		//System.out.println(map.put("周杰伦","zhoe"));
		
		//V remove(Object key):根据键删除键值对元素，并把值返回
		//System.out.println(map.remove("邓超"))
		
		//void clear():移除所有键值对元素
		//map.clear();
		
		//boolean containsKey(Object key):判断集合是否包含指定的键
		//boolean containsValue(Object value):判断集合是否包含指定的值
		//System.out.println(map.containsKey("周杰伦"));
		
		//boolean isEmpty():判断集合是否为空
		//map.isEmpty();
		
		//int size():
		//System.out.println(map.size());
		
		System.out.println("map:"+map);
	}
}
