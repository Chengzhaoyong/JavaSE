package cn.itcast_02;

import java.util.HashSet;
import java.util.Iterator;/*

HashSet:�洢�ַ���
   Ϊʲôû�г�������hello 
   ͨ������add������Դ�룬����֪����������ײ�����������hashCode()��equals()
   
   ���裺
      ���ȱȽϹ�ϣֵ
      �����ͬ�������ߣ��Ƚϵ�ֵַ����equals����
         
      �����ͬ����ֱ����ӵ�������
       
       ���շ����Ĳ�����˵
          �ȿ�hashCode()ֵ�Ƿ���ͬ
            ��ͬ��������equals����
                   ����true��˵��Ԫ���ظ����Ͳ����
                   ����false:˵��Ԫ�ز��ظ�������ӵ�������
             
            ��ͬ����ֱ����ӵ�������
*/

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("hallo");
		hs.add("hello");
		hs.add("hafrf");
		
		Iterator<String> i=hs.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		for(String s:hs) {
			System.out.println(s);
		}
	}
}
