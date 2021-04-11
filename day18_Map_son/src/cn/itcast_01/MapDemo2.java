package cn.itcast_01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 *   ��ȡ���ܣ�
 *      V get(Object key):���ݼ���ȡֵ
 *      Set<K> keySet():��ȡ�����е����м��ļ���
 *      Collection<V> values():��ȡ�����е����м���ֵ�ļ���
 */
public class MapDemo2 {
public static void main(String[] args) {
	Map<String,String> map=new HashMap<String,String>();
	
	map.put("�˳�","��ٳ");
	map.put("���׷�", "�����");
	map.put("������","����");
	map.put("�ܽ���","����");
	
	//V get(Object key):���ݼ���ȡֵ
	System.out.println(map.get("���׷�"));
	System.out.println("----------");
	// Set<K> keySet():��ȡ�����е����м��ļ���
	Set<String> set=map.keySet();
	for(String key:set)
	{
		System.out.println(key);
	}
	System.out.println("-------");
	//Collection<V> values():��ȡ�����е����м���ֵ�ļ���
	Collection<String> values=map.values();
	for(String value:values) {
		System.out.println(value);
	}
}
}
