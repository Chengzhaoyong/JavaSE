package cn.itcast_03;

import java.util.ArrayList;
import java.util.Collection;
/*
 * import cn.itcast_02.StudentDemo;
 *    ���ƴ���ʱ�����װѰ�Ҳ���Ƹ��ƹ���
 */
import java.util.Iterator;


public class IteratorDemo2 {
		public static void main(String[] args) {
			Collection c=new ArrayList();
			StudentDemo s1=new StudentDemo(23,"��0");
			StudentDemo s2=new StudentDemo(28,"��1");
			StudentDemo s3=new StudentDemo(20,"��2");
			StudentDemo s4=new StudentDemo(20,"��3");
			StudentDemo s5=new StudentDemo(23,"��4");
			c.add(s1);
			c.add(s2);
			c.add(s3);
			c.add(s4);
			c.add(s5);
		
			
		    Iterator i=c.iterator();
			while(i.hasNext()) {
				StudentDemo s=(StudentDemo)i.next();//����ת��Ϊѧ������
				System.out.println(s.getName()+"-----"+s.getAge());
			}
//			
//			//forѭ��Ҳ���ԣ�Ч�ʸ���
//			for(Iterator a=c.iterator();a.hasNext();) {
//				StudentDemo s=(StudentDemo)a.next();//����ת��Ϊѧ������
//				System.out.println(s.getName()+"-----"+s.getAge());
//			}
			
		}
}
