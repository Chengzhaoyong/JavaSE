package cn.itcast_01;

import java.util.HashMap;
import java.util.Map;

/*
 *  
 */
public class MapDemo {
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		
		map.put("�˳�","��ٳ");
		map.put("���׷�", "�����");
		map.put("������","����");
		map.put("�ܽ���","����");
		
		//V put(K key,V value):���Ԫ��
		//����ǵ�һ�δ洢���ͷ���null���ڶ��δ洢����ֵ�滻����������ǰ��ֵ
		//System.out.println(map.put("�ܽ���","zhoe"));
		
		//V remove(Object key):���ݼ�ɾ����ֵ��Ԫ�أ�����ֵ����
		//System.out.println(map.remove("�˳�"))
		
		//void clear():�Ƴ����м�ֵ��Ԫ��
		//map.clear();
		
		//boolean containsKey(Object key):�жϼ����Ƿ����ָ���ļ�
		//boolean containsValue(Object value):�жϼ����Ƿ����ָ����ֵ
		//System.out.println(map.containsKey("�ܽ���"));
		
		//boolean isEmpty():�жϼ����Ƿ�Ϊ��
		//map.isEmpty();
		
		//int size():
		//System.out.println(map.size());
		
		System.out.println("map:"+map);
	}
}
