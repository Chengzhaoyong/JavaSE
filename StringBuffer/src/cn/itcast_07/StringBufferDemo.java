package cn.itcast_07;
/*
 *   String��StringBuffer��ת��
 *   
 */
public class StringBufferDemo {
		public static void main(String[] args) {
			//String--StringBuffer
			String s="hello";
			//1.ͨ�����췽��
			StringBuffer sb=new StringBuffer(s);
			System.out.println(sb);
			//2.append
			StringBuffer sb2=new StringBuffer();
			sb2.append(s);
			System.out.println(sb2);
			
			//StringBuffer--String
			StringBuffer buffer=new StringBuffer("java");
			//1.ͨ�����췽��
			String str=new String(buffer);
			System.out.println(str);
			//2.toString()
			String str2=buffer.toString();
			System.out.println(str2);
		}
}
