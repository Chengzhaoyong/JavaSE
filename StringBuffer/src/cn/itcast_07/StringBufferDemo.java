package cn.itcast_07;
/*
 *   String和StringBuffer的转换
 *   
 */
public class StringBufferDemo {
		public static void main(String[] args) {
			//String--StringBuffer
			String s="hello";
			//1.通过构造方法
			StringBuffer sb=new StringBuffer(s);
			System.out.println(sb);
			//2.append
			StringBuffer sb2=new StringBuffer();
			sb2.append(s);
			System.out.println(sb2);
			
			//StringBuffer--String
			StringBuffer buffer=new StringBuffer("java");
			//1.通过构造方法
			String str=new String(buffer);
			System.out.println(str);
			//2.toString()
			String str2=buffer.toString();
			System.out.println(str2);
		}
}
