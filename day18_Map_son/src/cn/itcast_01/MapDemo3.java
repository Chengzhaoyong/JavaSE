package cn.itcast_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 *    set<Map.entry<String,String>>  entrySet():·µ»ØÊÇ¼ü¶ÔÖµ¶ÔÏó
 */
public class MapDemo3 {
	public static void main(String[] args) {
Map<String,String> map=new HashMap<String,String>();
		
		map.put("µË³¬","ËïÙ³");
		map.put("ÀîÒ×·å", "ÁõÒà·Æ");
		map.put("ÁõâıÍş","ÑîÃİ");
		map.put("ÖÜ½ÜÂ×","À¥Áè");
		
		Set<Map.Entry<String,String>> set=map.entrySet();
		for(Map.Entry<String,String>me:set) {
			String key=me.getKey();
			
			String value=me.getValue();
			System.out.println(key+"-------"+value);
		}
	}
}
