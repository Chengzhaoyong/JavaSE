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
			System.out.println("������int����ִ��");
			return a+b;
		}
		public static double sum(double a,double b) {
			System.out.println("������double����ִ��");
			return a+b;
		}
		public static double sum(int a,double b) {
			System.out.println("��int��doubleִ��");
			return a+b;
		}
		public static int sum(int a,int b,int c) {
			System.out.println("������int����ִ��");
			return a+b;
		}	
		public static int sum(int a,int b,int c,int d) {
			System.out.println("���ĸ�int����ִ��");
			return a+b+c+d;
		}
}
