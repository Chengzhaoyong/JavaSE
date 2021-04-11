package cn.itcast_07;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
  public static void main(String[] args) {
	ArrayList array=new ArrayList();
	StudentDemo s1=new StudentDemo(12,"车");
	StudentDemo s2=new StudentDemo(12,"哈 ");
	StudentDemo s3=new StudentDemo(144,"方法");
	StudentDemo s4=new StudentDemo(122,"据");
	StudentDemo s5=new StudentDemo(12,"扶额");
	StudentDemo s6=new StudentDemo(12,"扶额");
	
	array.add(s1);
	array.add(s2);
	array.add(s3);
	array.add(s4);
	array.add(s5);
	array.add(s6);
	
	ArrayList newArray=new ArrayList();
	Iterator i=array.iterator();
	while(i.hasNext()) {
		StudentDemo s=(StudentDemo)i.next();
		if(!newArray.contains(s)) {//学生类对象没有equals方法，只能从超类Object继承，而Object的equals方法是比较地址值的
			//contains是依赖于equals方法判断的
			newArray.add(s);
		}
	
		
		
	}
	for(int j=0;j<newArray.size();j++) {
		StudentDemo s=(StudentDemo)newArray.get(j);
		System.out.println(s.getName()+"----"+s.getAge());
		
	}
}
}
