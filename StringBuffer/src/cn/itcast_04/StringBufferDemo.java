package cn.itcast_04;
/*
 *   StringBuffer的替换功能；
 *   public StringBuffer replace(int start,int end,String str):
 *                从start开始到end用str替换
 *                
 *   
 */
public class StringBufferDemo {
		public static void main(String[] args) {
			StringBuffer sb=new StringBuffer();
			
			sb.append("hello").append("world").append("java");
			sb.replace(5,10,"节日快乐");
			System.out.println(sb);
		}
}
