package cn.itcast_03;

import java.util.LinkedHashSet;
/*
 *  LinkedHashSet�ĵײ����ݽṹ�ǹ�ϣ����������
 *  ��ϣ���Ǳ�֤Ԫ�ص�Ψһ��
 *  �����Ǳ�֤Ԫ�ص�������
 *  
 */
public class LinkedHashSetDemo {
		public static void main(String[] args) {
			//�������϶���
			LinkedHashSet<String> hs=new LinkedHashSet<String>();
			
			//�������Ԫ��
			hs.add("hello");
			hs.add("world");
			hs.add("java");
			for(String s:hs) {
				System.out.println();
			}
			
		}
}
