package cn.itcast_03;
/*
 *   StringBuffer的删除功能：
 *   public StringBuffer deleteCharAt(int index):删除指定位置的字符，返回本身
 *   public StringBuffer delete(int start,int end):
 */
public class StringBufferDemo {
		public static void main(String[] args) {
			StringBuffer sb=new StringBuffer();
			//创建对象
			//添加功能
			sb.append("hello").append("world").append("java");
			System.out.println(sb);
	// public StringBuffer deleteCharAt(int index):删除指定位置的字符，返回本身
//			sb.deleteCharAt(1);
//			sb.deleteCharAt(1);
//			System.out.println(sb);
			
//		//public StringBuffer delete(int start,int end):
			sb.delete(5, 10);
			System.out.println(sb);
			//删除所有数据
			sb.delete(0, sb.length());
			System.out.println("sb="+sb);
		}
}
