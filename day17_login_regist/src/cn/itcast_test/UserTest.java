package cn.itcast_test;

import java.util.Scanner;

import cn.itcast_dao.UserDao;
import cn.itcast_dao.impl.UserDaoImpl;
import cn.itcast_pojo.User;

/**
 *    用户测试类
 * @author 阳光小伙
 *
 */
public class UserTest {
		public static void main(String[] args) {
			while(true) {
			System.out.println("-----欢迎光临-----");
			System.out.println("1e3.登陆");
			System.out.println("2.注册");
			System.out.println("3.退出");
			System.out.println("请输入你的选择：");
			Scanner sc=new Scanner(System.in);
			UserDao ud=new UserDaoImpl();
			String s=sc.nextLine();
			switch(s) {
			case "1":
				//登陆界面
				System.out.println("------登陆界面-------");
				System.out.println("请输入你的用户名");
				String username=sc.nextLine();
				System.out.println("请输入你的密码：");
				String password=sc.nextLine();
				
				boolean flag=ud.isLogin(username, password);
				if(flag) {
					System.out.println("登陆成功");
					//break;//只能结束switch
				//	System.exit(0);
					//玩游戏
					int number=(int)(Math.random()*100)+1;
					int count=0;
					while(true) {
					count++;
				
					System.out.println("请输入1-100的数字：");
					int guessNumber=sc.nextInt();
					if(number<guessNumber) {
						System.out.println("你猜的数字太大了");
					}
					if(number>guessNumber) {
						System.out.println("你猜的数字太小了");
					}
					if(number==guessNumber) {
						System.out.println("恭喜你猜对了,花了"+count+"次");
						System.out.println("还有继续玩吗，Yes or No");
						count=0;
						Scanner sc1=new Scanner(System.in);
						String ss=sc1.nextLine();
						if(ss.equalsIgnoreCase("No")) {
							break;//循环里如果有switch，并且里面有break，结束的是switch语句，不是循环
						}
					}
					
					}
				}
				else{
				  System.out.println("用户名或密码错误，登陆失败");
				}
				
				
		
			case "2":
				//欢迎界面
				System.out.println("------欢迎光临-------");
				System.out.println("------注册界面-------");
				System.out.println("请输入你的用户名");
				String newUsername=sc.nextLine();
				System.out.println("请输入你的密码：");
				//String newUsername=sc.nextLine();
				String newPassword=sc.nextLine();
				User user=new User();
				user.setUsername(newUsername);
				user.setPassword(newUsername);
				
				//调用注册功能
				//多态
			//	UserDao ud=new UserDaoImpl();
				ud.regist(user);
				System.out.println("注册成功");
				break;
			case "3":
				System.exit(0);
			
				
		}	
			
		}}
}
