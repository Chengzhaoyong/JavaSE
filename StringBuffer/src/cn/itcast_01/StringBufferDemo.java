package cn.itcast_01;
/*
 * 线性安全：（多线程讲解）
 * 安全----同步----数据是安全的
 * 不安全---不同步---效率高一些
 * 
 * StringBuffer:
 *   线性安全的可变的字符串
 *   
 *   StringBuffer和String的区别
 *   前者长度和内容可变，后者不可变
 *   如果使用前者做字符串连接，不会浪费太多的资源
 *   
 *   StringBuffer的构造方法：
 *   public StringBuffer():无参构造
 *   public StringBuffer(int capacity):指定容量的字符串缓冲区对象
 *   public StringBuffer(String str):指定字符串内容的字符串缓冲区对象
 *   
 *   StringBuffer的方法：
 *   public int capacity():返回当前容量，理论
 *   public int length():返回长度（字符数)，实际
 *   
 *   
 */
public class StringBufferDemo {
		public static void main(String[] args) {
			//  public StringBuffer():无参构造
			StringBuffer sb=new StringBuffer();
			System.out.println("sb:"+sb);
			System.out.println("capacity:"+sb.capacity());//初始容量为16
			System.out.println(sb.length());
			System.out.println("-------------");
			// public StringBuffer(int capacity):指定容量的字符串缓冲区对象
			StringBuffer sb2=new StringBuffer(30);
			System.out.println("sb:"+sb2);
			System.out.println("capacity:"+sb2.capacity());//初始容量为16
			System.out.println(sb2.length());
			System.out.println("-------------");
			
			//public StringBuffer(String str):指定字符串内容的字符串缓冲区对象
			StringBuffer sb3=new StringBuffer("hello");
			System.out.println("sb3:"+sb3);
			System.out.println("capacity:"+sb3.capacity());//初始容量为16
			System.out.println(sb3.length());
			
		}
}
