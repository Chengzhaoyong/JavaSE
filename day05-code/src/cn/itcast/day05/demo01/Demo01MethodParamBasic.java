package cn.itcast.day05.demo01;
/*
 * 什么叫参数传递
 * 也就是在调用方法的时候，向方法内传入一些数据的动作。
 * 
 * 【形式参数】，在定义方法的时候，写在小括号内的参数
 * 
 */
public class Demo01MethodParamBasic {
		public static void main(String[] args) {
			int a=10;
			int b=20;
			System.out.println("a="+a);
			System.out.println("b="+b);
			change(a,b);
			System.out.println("==========");
			System.out.println("a="+a);
			System.out.println("b="+b);
		}
		public static void change(int x,int y) {
			x*=10;
			y*=10;
			System.out.println("x="+x);
			System.out.println("y="+y);
			
		}
}
