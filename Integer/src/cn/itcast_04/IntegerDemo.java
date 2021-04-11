package cn.itcast_04;
/*
 * 十进制转成其他进制
 * public static String toString(int i,int radix)
 * 由这个可以看到进制的范围：2-36
 */
public class IntegerDemo {
			public static void main(String[] args) {
				//十进制转成其他进制
				System.out.println(Integer.toString(100, 3));
				System.out.println(Integer.toString(100, 5));
				System.out.println(Integer.toString(100, 13));
				System.out.println(Integer.toString(100, 30));
				
				System.out.println("----------");
				//从其他进制转换十进制
				System.out.println(Integer.parseInt("100",3));
				System.out.println(Integer.parseInt("100",13));
				System.out.println(Integer.parseInt("100",31));
			}
}
