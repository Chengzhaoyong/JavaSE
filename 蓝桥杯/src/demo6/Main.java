package demo6;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		//��ĸͼ��
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int m=sc.nextInt();
//		for(int i=0;i<n;i++) {
//			char ch1=(char)('A'+i);
//			char ch2='A';
//			for(int k=0;k<m;k++) {
//				if(ch1>'A') {
//					System.out.print(ch1--);   //�ȸ�ֵ��--
//				}else {
//					System.out.print(ch2++);    //�ȸ�ֵ��++
//				}
//			}
//			//����
//			System.out.println();
//		}
		
		
//		for(int i=0;i<32;i++) {
//			String s=Integer.toBinaryString(i);
//			int length=s.length();
//			for(int j=length;j<5;j++) {
//				 s="0".concat(s);
//			}
//			System.out.println(s);
//		}
		
		
		//�����ж�
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%400==0||(n%4==0&&n%100!=0)) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
}
