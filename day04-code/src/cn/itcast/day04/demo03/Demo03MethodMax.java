package cn.itcast.day04.demo03;
/*
 * 
 * ���������������֣������ֵ
 */
import java.util.Scanner;
public class Demo03MethodMax {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("�������һ�����֣�");
			int a=sc.nextInt();
			System.out.println("������ڶ������֣�");
			int b=sc.nextInt();
			int max=getMax(a,b);
			System.out.println("���ֵ��"+max);
		}
		public static int getMax(int x,int y) {
			int max;
			if(x>y) {
				max=x;

			}
			else {
				max=y;
			}
			return max;
		}
}
