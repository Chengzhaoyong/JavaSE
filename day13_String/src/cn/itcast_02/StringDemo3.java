package cn.itcast_02;
/*
 *    ������д���
 *    �ַ�������Ǳ�����ӣ��ȿ��ռ䣬��ƴ��
 *    �ַ�������ǳ�����ӣ�����ӣ�Ȼ���ڳ������ң�����о�ֱ�ӷ��أ����򣬾ʹ���
 *    
 */
public class StringDemo3 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "world";
		String s3 = "helloworld";
		// �ַ�������Ǳ�����ӣ��ȿ��ռ䣬��ƴ��
		System.out.println(s3 == s1 + s2);
		System.out.println(s3.equals((s1 + s2)));
		// �ַ�������ǳ�����ӣ�����ӣ�
		//Ȼ���ڳ������ң�����о�ֱ�ӷ��أ����򣬾ʹ���
		System.out.println(s3 == "hello" + "world");
		System.out.println(s3.equals("hello" + "world"));

	}
}
