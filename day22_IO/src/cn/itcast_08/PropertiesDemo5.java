package cn.itcast_08;

import java.util.Properties;
import java.util.Set;

/*
 *      Properties:属性集合，是一个可以和IO流相结合使用的集合类
 *      Properties:可保存在流中或从流中加载，属性列表中每个键及其对应值都是一个字符串
 *      
 *      是Hashtable的子类，说明是一个Map集合
 *      
 */
public class PropertiesDemo5 {
		public static void main(String[] args) {
			//作为Map集合的使用
			//下面这种做法是错误的，一定要看API，如果没有<>，说明该类不是一个泛型类，在使用的时候不能加泛型
			
			Properties prop=new Properties();
			
			//添加元素
			prop.put("it002", "hello");
			prop.put("it001", "world");
			prop.put("it003", "java");
			
  //		System.out.println("prop="+prop);
			
			//遍历集合
			Set<Object> set=prop.keySet();
			for(Object key:set) {
			Object	value=prop.get(key);
			
				System.out.println(key+"-----"+value);
			}
		}
}
