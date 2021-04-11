package cn.itcast.day04.demo03;
/*
 * 没有返回值的方法，只能单独调用，不能打印调用和赋值调用。
 */
public class Demo04MethodVoid {
	public static void main(String[] args) {
			printHelloWorld();
	}
		public static void printHelloWorld(){
			for(int i=1;i<=10;i++) {
				System.out.println("Hello,World!");
			}
		}
	
}
