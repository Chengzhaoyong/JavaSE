package cn.itcast_03;
/*
 *   StringBuffer��ɾ�����ܣ�
 *   public StringBuffer deleteCharAt(int index):ɾ��ָ��λ�õ��ַ������ر���
 *   public StringBuffer delete(int start,int end):
 */
public class StringBufferDemo {
		public static void main(String[] args) {
			StringBuffer sb=new StringBuffer();
			//��������
			//��ӹ���
			sb.append("hello").append("world").append("java");
			System.out.println(sb);
	// public StringBuffer deleteCharAt(int index):ɾ��ָ��λ�õ��ַ������ر���
//			sb.deleteCharAt(1);
//			sb.deleteCharAt(1);
//			System.out.println(sb);
			
//		//public StringBuffer delete(int start,int end):
			sb.delete(5, 10);
			System.out.println(sb);
			//ɾ����������
			sb.delete(0, sb.length());
			System.out.println("sb="+sb);
		}
}
