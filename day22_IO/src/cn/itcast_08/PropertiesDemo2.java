package cn.itcast_08;

import java.util.Properties;
import java.util.Set;

/*
 *   ���⹦�ܣ�
 *     public Object setProperty(String key,String value):���Ԫ��
 *     public String getProperty(String key):��ȡԪ��
 *     public Set<String> stringPropertyNames():��ȡ���еļ��ļ���
 */
public class PropertiesDemo2 {
		public static void main(String[] args) {
			Properties prop=new Properties();
			
			//���Ԫ��
			prop.setProperty("����", "20");
			prop.setProperty("ˢ��", "220");
			prop.setProperty("����", "70");
		
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