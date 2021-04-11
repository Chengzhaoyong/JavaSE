package cn.itcast_03;
import java.util.Scanner;
/*
 *   模拟登陆，给三次机会，并提示还有几次
 *   
 *   分析：
 *      A：定义用户和密码
 *      B：键盘输入用户名和密码
 *      C：比较用户名和密码是否相同
 *      
 */
public class StringDemo2 {
	public static void main(String[] args) {
		//定义用户名和密码，已存在的
		
		String username="admin";
		String password="admin";
		for(int x=0;x<3;x++) {
			
			//键盘输入用户名和密码
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入用户名");
			String name=sc.nextLine();
			System.out.println("请输入密码");
			String pwd=sc.nextLine();
			//比较相同不
			if(name.equals(username)&&pwd.equals(password)) {
				System.out.println("登陆成功");
				break;
				
			}
			else {
					System.out.println("登陆失败，还有"+(2-x)+"次机会");
					
				}
			
			
		}
		
	}
}
