package cn.itcast_06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
 *    �������壺 
 *                      ����
 *                      ����
 *    
 *    ���μǣ�  
 *                     �����
 *                     ��˽�
 *                     
 *     ˮ䰴���
 *                     ����
 *                     �ν�
 *                     
 *                     hashMapǶ��ArrayList
 */
public class HashMapDemo2 {
		public static void main(String[] args) {
			HashMap<String,ArrayList<String>> hm=new HashMap<String,ArrayList<String>>();
			
			ArrayList<String> array1=new ArrayList<String>();
			array1.add("����");
			array1.add("����");
			hm.put("��������", array1);
			
			ArrayList<String> array2=new ArrayList<String>();
			array2.add("�����");
			array2.add("��˽�");
			hm.put("���μ�", array2);
			
			ArrayList<String> array3=new ArrayList<String>();
			array3.add("����");
			array3.add("�ν�");
			hm.put("ˮ䰴�", array3);
			
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
