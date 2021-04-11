package cn.itcast.day04.demo03;
/*
 * 如何调用一个定义好的方法
 *
 * 1单独调用
 * 格式：方法名称（参数值）
 * 在使用单独调用的时候，无法使用方法的返回值
 * 
 * 2.打印调用
 * 格式：System.out.println(方法名称（参数值）)
 * 
 * 3.赋值调用
 * 格式：数据类型 变量名称=方法名称（参数值）
 * 
 */
public class Demo01Methodinvoke {
		public static void main(String[] args) {
	//	sum(12,443);
		System.out.println(sum(12,443));
		int num=sum(232,234);
		num+=233;
		System.out.println(num);
		}
		public static int sum(int a,int b) {
			int result=a+b;
			return result;
		}
		
}
