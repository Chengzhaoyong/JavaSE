package cn.itcast_02;
/*
 *   Stringbuffer����ӹ���
 *   public StringBuffer append(String str):���԰�����������ӵ��ַ������������������ַ�������������
 *   public StringBuffer insert(int num,String str)
 */
public class StringDemo {
		public static void main(String[] args) {
			StringBuffer sb=new StringBuffer();//�����ַ�������������
//			
//			StringBuffer sb2=sb.append("hello");
//			System.out.println(sb);
//			System.out.println(sb2);
//			System.out.println(sb==sb2);
			sb.append("hello");
			System.out.println(sb);
			
			
			//��ʽ���
			sb.append("world").append(true).append(27387);
			System.out.println(sb);
			sb.insert(5, "world");
			System.out.println(sb);
			
		}
}
