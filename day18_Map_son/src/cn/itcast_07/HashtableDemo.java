package cn.itcast_07;

import java.util.HashMap;
import java.util.Hashtable;

/*
 *    1.Hashtable��HashMap������
 *     Hashtable:�̰߳�ȫ��Ч�ʵͣ�������null����nullֵ
 *     HashMap:�̲߳���ȫ��Ч�ʸߣ�����null����nullֵ
 *     
 *    2.List,Set��Map�ӿ��Ƿ�̳��ӽӿ�Map
 *    List,Set���Ǽ̳�Map�ӿڣ����Ǽ̳�Collection�ӿ�
 *    Map�ӿڱ������һ������ӿ�
 */
public class HashtableDemo {
	
	public static void main(String[] args) {
		Hashtable<String,String> hm=new Hashtable<String,String>();
		
		//hm.put(null,null);������
		HashMap<String,String> hm1=new HashMap<String,String>();
		hm1.put(null,null);
		System.out.println(hm1);
	}
	
	

}
