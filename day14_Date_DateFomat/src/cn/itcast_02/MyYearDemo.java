package cn.itcast_02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class MyYearDemo {
		public static void main(String[] args) throws ParseException {
			Scanner sc=new Scanner(System.in);//����������ĳ�������
			System.out.println("��������ĳ������ڣ�");
			
			String s=sc.nextLine();
			
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");//���ڸ�ʽ����
			Date d=sdf.parse(s);
			//�Ժ���ֵ����λ
			long myTime=d.getTime();
			long nowTime=System.currentTimeMillis();
			System.out.println((nowTime-myTime)/1000/60/60/24);
		}
}
