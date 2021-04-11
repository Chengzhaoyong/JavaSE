package cn.itcast.day04.demo03;
/*
 * 关于名称的两个问题
 * 1.变量的名称可以相同
 * 2.如果有两个方法，每个方法当中都有一个同名的变量？可以
 */
public class Demo02Names {
	public static void main(String[] args) {
		int result = 100;
		System.out.println("main当中的result:" + result);
		int sum = sum(10, 20);
		System.out.println(sum);
	}

	public static int sum(int a, int b) {
		int result = a + b;
		System.out.println("sum当中的result:" + result);
		return result;
	}
}
