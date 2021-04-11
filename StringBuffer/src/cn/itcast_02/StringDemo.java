package cn.itcast_02;
/*
 *   Stringbuffer的添加功能
 *   public StringBuffer append(String str):可以把任意类型添加到字符串缓冲区，并返回字符串缓冲区本身
 *   public StringBuffer insert(int num,String str)
 */
public class StringDemo {
		public static void main(String[] args) {
			StringBuffer sb=new StringBuffer();//创建字符串缓冲区对象
//			
//			StringBuffer sb2=sb.append("hello");
//			System.out.println(sb);
//			System.out.println(sb2);
//			System.out.println(sb==sb2);
			sb.append("hello");
			System.out.println(sb);
			
			
			//链式编程
			sb.append("world").append(true).append(27387);
			System.out.println(sb);
			sb.insert(5, "world");
			System.out.println(sb);
			
		}
}
