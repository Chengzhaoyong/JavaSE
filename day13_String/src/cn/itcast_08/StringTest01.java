package cn.itcast_08;
import java.util.Scanner;
public class StringTest01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] s1=s.toCharArray();
		String result="";
		for(int i=s1.length-1;i>=0;i--) {
			result+=s1[i];
			
		}
		System.out.println(result);
	}

}
