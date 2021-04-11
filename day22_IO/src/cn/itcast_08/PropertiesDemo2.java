package cn.itcast_08;

import java.util.Properties;
import java.util.Set;

/*
 *   特殊功能：
 *     public Object setProperty(String key,String value):添加元素
 *     public String getProperty(String key):获取元素
 *     public Set<String> stringPropertyNames():获取所有的键的集合
 */
public class PropertiesDemo2 {
		public static void main(String[] args) {
			Properties prop=new Properties();
			
			//添加元素
			prop.setProperty("张三", "20");
			prop.setProperty("刷个", "220");
			prop.setProperty("张四", "70");
		
			Set<String> set=prop.stringPropertyNames();
			for(Object key:set) {
			String value=prop.getProperty((String) key);
				 System.out.println(key+"------"+value);
			}
			
			
		}
}


/*
 * class Hashtable{
 * public V put(K key,V value){
 * ....
}
}
   class Properties extends Hashtable{
     public V setProperties(String key,String value){
     	return put(key,value);
     }
   }
*
*/