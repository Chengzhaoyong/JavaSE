package cn.itcast.day05.demo01;
/*
 * ʲô�в�������
 * Ҳ�����ڵ��÷�����ʱ���򷽷��ڴ���һЩ���ݵĶ�����
 * 
 * ����ʽ���������ڶ��巽����ʱ��д��С�����ڵĲ���
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
