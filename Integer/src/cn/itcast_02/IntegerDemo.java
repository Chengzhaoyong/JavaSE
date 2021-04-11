package cn.itcast_02;
/*
 *   Integer的构造方法：
 *   public Integer(int value)
 *   public Integer(String s):
 *   这个字符串必须是数字组成
 */
public class IntegerDemo {
			public static void main(String[] args) {
				int i=100;
				Integer ii=new Integer(i);
				System.out.println(ii);
				
				String s="100";
				Integer ss=new Integer(100);
				System.out.println(ss);
			}
}
