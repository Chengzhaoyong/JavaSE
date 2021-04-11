package cn.itcast.day05.demo01;
/*
 * 
 */
public class Demo01MethodOverload {
		public static void main(String[] args) {
			sum(12,43);
			System.out.println(sum(12,43.7));
		}
		public static int sum(int a,int b) {
			System.out.println("有两个int参数执行");
			return a+b;
		}
		public static double sum(double a,double b) {
			System.out.println("有两个double参数执行");
			return a+b;
		}
		public static double sum(int a,double b) {
			System.out.println("先int后double执行");
			return a+b;
		}
		public static int sum(int a,int b,int c) {
			System.out.println("有三个int参数执行");
			return a+b;
		}	
		public static int sum(int a,int b,int c,int d) {
			System.out.println("有四个int参数执行");
			return a+b+c+d;
		}
}
