package cn.itcast_05;
/*
 *   StringBuffer�ķ�ת����
 *   public StringBuffer reverse()
 */
public class StringBufferDemo {
			public static void main(String[] args) {
				StringBuffer sb=new StringBuffer();
				sb.append("hello");
				sb.reverse();
				System.out.println(sb);
			}
}
