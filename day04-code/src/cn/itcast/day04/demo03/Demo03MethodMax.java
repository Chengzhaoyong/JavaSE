package cn.itcast.day04.demo03;
/*
 * 
 * 键盘输入两个数字，求最大值
 */
import java.util.Scanner;
public class Demo03MethodMax {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入第一个数字：");
			int a=sc.nextInt();
			System.out.println("请输入第二个数字：");
			int b=sc.nextInt();
			int max=getMax(a,b);
			System.out.println("最大值："+max);
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
