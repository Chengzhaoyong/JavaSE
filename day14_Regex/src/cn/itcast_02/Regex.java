package cn.itcast_02;
/*
 *   判断动能：
 *   String 类的public boolean matches（String regex）
 *   需求：判断手机号码是否满足要求
 *      A：键盘录入手机号码：
 *      B：定义手机号码的规则
 *         134008084034
 *         135894859589
 *         138958495894
 *         131849589455
 *         183493958495
 */
import java.util.Scanner;
public class Regex {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入你的手机号码：");
		
		String phone=sc.nextLine();
		//定义手机规则
		String regex="1[38]\\d{9}";
		boolean flag=phone.matches(regex);
		System.out.println(flag);;
	}
}
