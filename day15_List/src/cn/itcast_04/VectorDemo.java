package cn.itcast_04;

import java.util.Enumeration;
import java.util.Vector;

/*
 *      Vector的特有功能：
 *          1:添加功能：public void addElement(Object obj):--------add
 *          2.获取功能：public Object elementAt(int index):   ----get()
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
				
				//第一种
				Enumeration en=v.elements();
				while(en.hasMoreElements()) {
					String s=(String)en.nextElement();
					System.out.println(s);
				}
				
				System.out.println("============");
				
				//第二种
				for(int i=0;i<v.size();i++) {
					String s=(String)v.get(i);
					System.out.println(s);
				}
				
				
				
			}
}
