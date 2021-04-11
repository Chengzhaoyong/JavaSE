package cn.itcast_03;

import java.util.ArrayList;
import java.util.Collection;
/*
 * import cn.itcast_02.StudentDemo;
 *    复制代码时，容易把包也复制复制过来
 */
import java.util.Iterator;


public class IteratorDemo2 {
		public static void main(String[] args) {
			Collection c=new ArrayList();
			StudentDemo s1=new StudentDemo(23,"程0");
			StudentDemo s2=new StudentDemo(28,"程1");
			StudentDemo s3=new StudentDemo(20,"程2");
			StudentDemo s4=new StudentDemo(20,"程3");
			StudentDemo s5=new StudentDemo(23,"程4");
			c.add(s1);
			c.add(s2);
			c.add(s3);
			c.add(s4);
			c.add(s5);
		
			
		    Iterator i=c.iterator();
			while(i.hasNext()) {
				StudentDemo s=(StudentDemo)i.next();//向下转型为学生对象
				System.out.println(s.getName()+"-----"+s.getAge());
			}
//			
//			//for循环也可以，效率更高
//			for(Iterator a=c.iterator();a.hasNext();) {
//				StudentDemo s=(StudentDemo)a.next();//向下转型为学生对象
//				System.out.println(s.getName()+"-----"+s.getAge());
//			}
			
		}
}
