package cn.itcast_06;

import java.util.HashMap;
import java.util.Set;

/*
 *   传智播客：
 *     jc   基础班：
 *                                            小明   23
 *                                            小兰   22
 *    jy    就业班
 *                                            小红   20
 *                                            小蓝   21
 */
public class HashMapDemo {
			public static void main(String[] args) {
				 HashMap<String,HashMap<String,Integer>> czbkMap=new  HashMap<String,HashMap<String,Integer>>();
				 
				 HashMap<String,Integer> jcMap=new HashMap<String,Integer>();
				 jcMap.put("小明", 23);
				 jcMap.put("小兰", 22);
				 czbkMap.put("jc", jcMap);
				 
				 HashMap<String,Integer> jyMap=new HashMap<String,Integer>();
				 jyMap.put("小红", 21);
				 jyMap.put("小蓝", 20);
				 czbkMap.put("jy", jyMap);
				 
				 Set<String> czbkMapSet=czbkMap.keySet();
				 
				 
				 for(String czbkMapKey:czbkMapSet) {
					 System.out.println(czbkMapKey);
					 HashMap<String,Integer> czbkMapValue=czbkMap.get(czbkMapKey);
					 
					 Set<String> czbkMapValueSet=czbkMapValue.keySet();
					 for(String czbkMapValueKey:czbkMapValueSet) {
						 Integer czbkMapValueValue=czbkMapValue.get(czbkMapValueKey);
						 System.out.println("\t"+czbkMapValueKey+"-----"+czbkMapValueValue);
					 }
				 }
			}
}
