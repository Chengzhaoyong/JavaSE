package cn.itcast_06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
 *    三国演义： 
 *                      吕布
 *                      关羽
 *    
 *    西游记：  
 *                     孙悟空
 *                     猪八戒
 *                     
 *     水浒传：
 *                     武松
 *                     宋江
 *                     
 *                     hashMap嵌套ArrayList
 */
public class HashMapDemo2 {
		public static void main(String[] args) {
			HashMap<String,ArrayList<String>> hm=new HashMap<String,ArrayList<String>>();
			
			ArrayList<String> array1=new ArrayList<String>();
			array1.add("吕布");
			array1.add("关羽");
			hm.put("三国演义", array1);
			
			ArrayList<String> array2=new ArrayList<String>();
			array2.add("孙悟空");
			array2.add("猪八戒");
			hm.put("西游记", array2);
			
			ArrayList<String> array3=new ArrayList<String>();
			array3.add("武松");
			array3.add("宋江");
			hm.put("水浒传", array3);
			
			Set<String> set=hm.keySet();
			
			for(String key:set) {
				System.out.println(key);
				ArrayList<String> array=hm.get(key);
				for(String s:array) {
					System.out.println("\t"+s);
				}
			}
			
			
			
		}
}
