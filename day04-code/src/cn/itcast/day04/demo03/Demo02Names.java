package cn.itcast.day04.demo03;
/*
 * �������Ƶ���������
 * 1.���������ƿ�����ͬ
 * 2.���������������ÿ���������ж���һ��ͬ���ı���������
 */
public class Demo02Names {
	public static void main(String[] args) {
		int result = 100;
		System.out.println("main���е�result:" + result);
		int sum = sum(10, 20);
		System.out.println(sum);
	}

	public static int sum(int a, int b) {
		int result = a + b;
		System.out.println("sum���е�result:" + result);
		return result;
	}
}
