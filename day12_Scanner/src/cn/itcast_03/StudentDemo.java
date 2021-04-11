package cn.itcast_03;
import java.util.Scanner;
/*
 *     常用的两个方法；
 *     public int nextInt();获取一个int类型的数
 *     public String nextline():获取一个String类型的数
 */
public class StudentDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s1=sc.nextInt();
		Scanner sc1=new Scanner(System.in);
		String s2=sc1.nextLine();
		System.out.println("s1="+s1+",s2="+s2);
	}

}
