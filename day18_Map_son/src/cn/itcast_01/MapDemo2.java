package cn.itcast_01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 *   获取动能：
 *      V get(Object key):根据键获取值
 *      Set<K> keySet():获取集合中的所有键的集合
 *      Collection<V> values():获取集合中的所有键的值的集合
 */
public class MapDemo2 {
public static void main(String[] args) {
	Map<String,String> map=new HashMap<String,String>();
	
	map.put("邓超","孙俪");
	map.put("李易峰", "刘亦菲");
	map.put("刘恺威","杨幂");
	map.put("周杰伦","昆凌");
	
	//V get(Object key):根据键获取值
	System.out.println(map.get("李易峰"));
	System.out.println("----------");
	// Set<K> keySet():获取集合中的所有键的集合
	Set<String> set=map.keySet();
	for(String key:set)
	{
		System.out.println(key);
	}
	System.out.println("-------");
	//Collection<V> values():获取集合中的所有键的值的集合
	Collection<String> values=map.values();
	for(String value:values) {
		System.out.println(value);
	}
}
}
