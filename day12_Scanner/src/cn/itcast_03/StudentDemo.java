package cn.itcast_03;
import java.util.Scanner;
/*
 *     ���õ�����������
 *     public int nextInt();��ȡһ��int���͵���
 *     public String nextline():��ȡһ��String���͵���
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
