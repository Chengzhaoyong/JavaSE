package cn.itcast_04;

import java.util.Enumeration;
import java.util.Vector;

/*
 *      Vector�����й��ܣ�
 *          1:��ӹ��ܣ�public void addElement(Object obj):--------add
 *          2.��ȡ���ܣ�public Object elementAt(int index):   ----get()
 *                       public Enumeration elements()			--Iterator iterator
 *                      boolean hasMoreElements()			----hasNext()
 *                      Object nextElement()					---next()
 *                      
 *        
 */
public class VectorDemo {
			public static void main(String[] args) {
				Vector v=new Vector();
				v.addElement("hello");
				v.addElement("world");
				v.addElement("java");
				
				//��һ��
				Enumeration en=v.elements();
				while(en.hasMoreElements()) {
					String s=(String)en.nextElement();
					System.out.println(s);
				}
				
				System.out.println("============");
				
				//�ڶ���
				for(int i=0;i<v.size();i++) {
					String s=(String)v.get(i);
					System.out.println(s);
				}
				
				
				
			}
}
