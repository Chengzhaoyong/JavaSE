package cn.itcast_test;

import java.util.Scanner;

import cn.itcast_dao.UserDao;
import cn.itcast_dao.impl.UserDaoImpl;
import cn.itcast_pojo.User;

/**
 *    �û�������
 * @author ����С��
 *
 */
public class UserTest {
		public static void main(String[] args) {
			while(true) {
			System.out.println("-----��ӭ����-----");
			System.out.println("1e3.��½");
			System.out.println("2.ע��");
			System.out.println("3.�˳�");
			System.out.println("���������ѡ��");
			Scanner sc=new Scanner(System.in);
			UserDao ud=new UserDaoImpl();
			String s=sc.nextLine();
			switch(s) {
			case "1":
				//��½����
				System.out.println("------��½����-------");
				System.out.println("����������û���");
				String username=sc.nextLine();
				System.out.println("������������룺");
				String password=sc.nextLine();
				
				boolean flag=ud.isLogin(username, password);
				if(flag) {
					System.out.println("��½�ɹ�");
					//break;//ֻ�ܽ���switch
				//	System.exit(0);
					//����Ϸ
					int number=(int)(Math.random()*100)+1;
					int count=0;
					while(true) {
					count++;
				
					System.out.println("������1-100�����֣�");
					int guessNumber=sc.nextInt();
					if(number<guessNumber) {
						System.out.println("��µ�����̫����");
					}
					if(number>guessNumber) {
						System.out.println("��µ�����̫С��");
					}
					if(number==guessNumber) {
						System.out.println("��ϲ��¶���,����"+count+"��");
						System.out.println("���м�������Yes or No");
						count=0;
						Scanner sc1=new Scanner(System.in);
						String ss=sc1.nextLine();
						if(ss.equalsIgnoreCase("No")) {
							break;//ѭ���������switch������������break����������switch��䣬����ѭ��
						}
					}
					
					}
				}
				else{
				  System.out.println("�û�����������󣬵�½ʧ��");
				}
				
				
		
			case "2":
				//��ӭ����
				System.out.println("------��ӭ����-------");
				System.out.println("------ע�����-------");
				System.out.println("����������û���");
				String newUsername=sc.nextLine();
				System.out.println("������������룺");
				//String newUsername=sc.nextLine();
				String newPassword=sc.nextLine();
				User user=new User();
				user.setUsername(newUsername);
				user.setPassword(newUsername);
				
				//����ע�Ṧ��
				//��̬
			//	UserDao ud=new UserDaoImpl();
				ud.regist(user);
				System.out.println("ע��ɹ�");
				break;
			case "3":
				System.exit(0);
			
				
		}	
			
		}}
}
