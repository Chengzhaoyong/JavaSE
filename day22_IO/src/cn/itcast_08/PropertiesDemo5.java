package cn.itcast_08;

import java.util.Properties;
import java.util.Set;

/*
 *      Properties:���Լ��ϣ���һ�����Ժ�IO������ʹ�õļ�����
 *      Properties:�ɱ��������л�����м��أ������б���ÿ���������Ӧֵ����һ���ַ���
 *      
 *      ��Hashtable�����࣬˵����һ��Map����
 *      
 */
public class PropertiesDemo5 {
		public static void main(String[] args) {
			//��ΪMap���ϵ�ʹ��
			//�������������Ǵ���ģ�һ��Ҫ��API�����û��<>��˵�����಻��һ�������࣬��ʹ�õ�ʱ���ܼӷ���
			
			Properties prop=new Properties();
			
			//���Ԫ��
			prop.put("it002", "hello");
			prop.put("it001", "world");
			prop.put("it003", "java");
			
  //		System.out.println("prop="+prop);
			
			//��������
			Set<Object> set=prop.keySet();
			for(Object key:set) {
			Object	value=prop.get(key);
			
				System.out.println(key+"-----"+value);
			}
		}
}
