package cn.itcast_03;

import java.util.LinkedHashMap;
import java.util.Set;

/*
 *   LinkedHashMap:��Map�ӿڵĹ�ϣ��������б�ʵ�֣����п�Ԥ֪�ĵ���˳��
 *   �й�ϣ��֤����Ψһ��
 *   ������֤�������򣨴洢��ȡ����˳��һ�£�
 */
public class LinkedHashMapDemo {
		public static void main(String[] args) {
			LinkedHashMap<String,String> hm=new LinkedHashMap<String,String>();
			
			
			hm.put("0001","hello");
			hm.put("0002","world");
			hm.put("0003","javase");
			hm.put("0004","javaee");
			
			Set<String> set=hm.keySet();
			for(String key:set) {
				String value=hm.get(key);
				
				System.out.println(key+"----"+value);
			}
		}
}
