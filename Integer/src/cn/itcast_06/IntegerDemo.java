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
		//ͨ���鿴Դ�룺���-128-127�����ݣ����˸����ݻ���أ���������Ǹ÷�Χ�ģ�ÿ�β��������µĿռ�
//		Integer ii=Integer.valueOf(100);
		
		
	}
}
