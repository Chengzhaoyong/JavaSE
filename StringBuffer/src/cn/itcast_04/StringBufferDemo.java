package cn.itcast_04;
/*
 *   StringBuffer���滻���ܣ�
 *   public StringBuffer replace(int start,int end,String str):
 *                ��start��ʼ��end��str�滻
 *                
 *   
 */
public class StringBufferDemo {
		public static void main(String[] args) {
			StringBuffer sb=new StringBuffer();
			
			sb.append("hello").append("world").append("java");
			sb.replace(5,10,"���տ���");
			System.out.println(sb);
		}
}
