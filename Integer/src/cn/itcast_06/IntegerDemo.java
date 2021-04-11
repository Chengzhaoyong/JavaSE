package cn.itcast_06;

public class IntegerDemo {
	public static void main(String[] args) {
		Integer i1=new Integer(127);
		Integer i2=new Integer(127);
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
		System.out.println("------------");
		
		Integer i3=new Integer(128);
		Integer i4=new Integer(128);
		System.out.println(i3==i4);
		System.out.println(i3.equals(i4));
		System.out.println("------------");
		
		Integer i5=127;
		Integer i6=127;
		System.out.println(i5==i6);
		System.out.println(i5.equals(i6));
		System.out.println("---------------");
		
		Integer i7=128;
		Integer i8=128;
		System.out.println(i7==i8);
		System.out.println(i7.equals(i8));
		System.out.println("---------------");
		//通过查看源码：针对-128-127的数据，做了个数据缓冲池，如果数据是该范围的，每次并不创建新的空间
//		Integer ii=Integer.valueOf(100);
		
		
	}
}
