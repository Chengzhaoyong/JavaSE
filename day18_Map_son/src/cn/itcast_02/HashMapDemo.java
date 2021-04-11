package cn.itcast_02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String,String> hm=new HashMap<String,String>();
		
		hm.put("001","马云");
		hm.put("002","乔布斯");
		hm.put("003","马化腾");
		hm.put("004","比尔盖茨");
		
		Set<String> set=hm.keySet();
		
		for(String key:set) {
			String value=hm.get(key);
			System.out.println(key+"----------"+value);
			
		}
		
		Set<Map.Entry<String,String>> set1=hm.entrySet();
		for(Map.Entry<String,String> me:set1) {
			String key=me.getKey();
			
			String value=me.getValue();
			System.out.println(key+"-------"+value);
		}
		
		
	}

}