package cn.itcast_05;

public class StringTest {
		public static void main(String[] args) {
			String s="helloWORLD";
			
			String s1=s.substring(0,1);//��ȡ��һ���ַ�
			String s2=s.substring(1);//��ȡ���˵�һ���ַ����ַ���
			
			String s3=s1.toUpperCase();//�ѵ�һ���ַ�ת����д
			String s4=s2.toLowerCase();//��Сд
			String s5=s3.concat(s4);//����
			System.out.println(s5+s5);
		}
}
