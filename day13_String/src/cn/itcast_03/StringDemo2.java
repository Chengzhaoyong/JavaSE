package cn.itcast_03;
import java.util.Scanner;
/*
 *   ģ���½�������λ��ᣬ����ʾ���м���
 *   
 *   ������
 *      A�������û�������
 *      B�����������û���������
 *      C���Ƚ��û����������Ƿ���ͬ
 *      
 */
public class StringDemo2 {
	public static void main(String[] args) {
		//�����û��������룬�Ѵ��ڵ�
		
		String username="admin";
		String password="admin";
		for(int x=0;x<3;x++) {
			
			//���������û���������
			Scanner sc=new Scanner(System.in);
			System.out.println("�������û���");
			String name=sc.nextLine();
			System.out.println("����������");
			String pwd=sc.nextLine();
			//�Ƚ���ͬ��
			if(name.equals(username)&&pwd.equals(password)) {
				System.out.println("��½�ɹ�");
				break;
				
			}
			else {
					System.out.println("��½ʧ�ܣ�����"+(2-x)+"�λ���");
					
				}
			
			
		}
		
	}
}
