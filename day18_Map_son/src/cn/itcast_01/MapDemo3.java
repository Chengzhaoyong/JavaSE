package cn.itcast_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 *    set<Map.entry<String,String>>  entrySet():�����Ǽ���ֵ����
 */
public class MapDemo3 {
	public static void main(String[] args) {
Map<String,String> map=new HashMap<String,String>();
		
		map.put("�˳�","��ٳ");
		map.put("���׷�", "�����");
		map.put("������","����");
		map.put("�ܽ���","����");
		
		Set<Map.Entry<String,String>> set=map.entrySet();
		for(Map.Entry<String,String>me:set) {
			String key=me.getKey();
			
			String value=me.getValue();
			System.out.println(key+"-------"+value);
		}
	}
}
