package cn.itcast_06;

import java.util.HashMap;
import java.util.Set;

/*
 *   ���ǲ��ͣ�
 *     jc   �����ࣺ
 *                                            С��   23
 *                                            С��   22
 *    jy    ��ҵ��
 *                                            С��   20
 *                                            С��   21
 */
public class HashMapDemo {
			public static void main(String[] args) {
				 HashMap<String,HashMap<String,Integer>> czbkMap=new  HashMap<String,HashMap<String,Integer>>();
				 
				 HashMap<String,Integer> jcMap=new HashMap<String,Integer>();
				 jcMap.put("С��", 23);
				 jcMap.put("С��", 22);
				 czbkMap.put("jc", jcMap);
				 
				 HashMap<String,Integer> jyMap=new HashMap<String,Integer>();
				 jyMap.put("С��", 21);
				 jyMap.put("С��", 20);
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
