package cn.itcast_01;

import java.util.ArrayList;
import java.util.Collection;

/*|
 *  ���ϵı�������ʵ�������λ�ȡ�����е�ÿ��Ԫ��
 *  Object[] toArray():�Ѽ���ת��Ϊ���飬����ʵ�ּ��ϵı���
 */
public class CollectionDemo4 {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		c.add("hello");
		c.add("world");
		c.add("java");
		
		//����
		// Object[] toArray():�Ѽ���ת��Ϊ���飬����ʵ�ּ��ϵı���
		Object[] objs=c.toArray();
		for(int x=0;x<objs.length;x++) {
			//System.out.println(objs[x]);
			//��֪��Ԫ�����ַ�������ȡԪ�ص�ͬʱ������֪��Ԫ�صĳ���
			//��Ԫ��ת��Ϊ�ַ���������ת��
			String s=(String)objs[x];
			System.out.println(s+"------"+s.length());
		}
	}

}
