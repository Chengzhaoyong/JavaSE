package cn.itcast_02;

import java.util.ArrayList;
import java.util.Collection;

public class StudentDemoTest {
		public static void main(String[] args) {
			Collection c=new ArrayList();
			StudentDemo s1=new StudentDemo(23,"��0");
			StudentDemo s2=new StudentDemo(23,"��1");
			StudentDemo s3=new StudentDemo(23,"��2");
			StudentDemo s4=new StudentDemo(23,"��3");
			StudentDemo s5=new StudentDemo(23,"��4");
			
			c.add(s1);//Object o=(Object)s1
			c.add(s2);
			c.add(s3);
			c.add(s4);
			c.add(s5);
    
			Object[] objs=c.toArray();
			for(int x=0;x<objs.length;x++) {
				StudentDemo s=(StudentDemo)objs[x];//����ת��
				System.out.println(s.getName()+"-----"+s.getAge());
			}
		}
}
