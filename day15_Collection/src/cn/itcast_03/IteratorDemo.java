package cn.itcast_03;
import java.util.*;
/*
 *   Iterator iterator():�����������ϵ�ר�ñ�����ʽ
 *     ��ȡԪ�أ�object next(),���ƶ�����һ��Ԫ��λ��
 *     
 *     boolean hasNext():��������Ե������ͷ���true
 */
public class IteratorDemo {
		public static void main(String[] args) {
			Collection c=new ArrayList();
			c.add("hello");
			c.add("world");
			c.add("java");
			
			
			Iterator i=c.iterator();
//			Object obj=i.next();
//			System.out.println(obj);
          
			while(i.hasNext()) {
				System.out.println(i.next());
			}
		}
}
