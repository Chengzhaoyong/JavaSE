package cn.itcast_01;
/*
 *    100变成二进制，八进制，十六进制
 */
public class IntegerDemo {
		public static void main(String[] args) {
			System.out.println(Integer.toBinaryString(100));//二进制
			System.out.println(Integer.toOctalString(100));//八进制
			System.out.println(Integer.toHexString(100));//十六进制
			
			//pubic static final int MAX_VALUE
			System.out.println(Integer.MAX_VALUE);
			System.out.println(Integer.MIN_VALUE);
		}		}