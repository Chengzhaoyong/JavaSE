package cn.itcast_02;
/*
 * 
 *  有一个兔子，从出生第三个月每个月就生一对兔子，小兔子长到第三个月每个月又生一对兔子，假如兔子不死，问第二十个月的兔子的对数为多少
 *      月      对数
 *  1：1
 *  2：1
 *  3：2
 *  4：3
 *  5：5
 *  6：8
 *  7：13
 */
public class DiGuiDemo {
	public static void main(String[] args) {
		//数组法
		
		int[] arr=new int[20];
		arr[0]=1;
		arr[1]=1;
		for(int i=2;i<arr.length;i++) {
			arr[i]=arr[i-1]+arr[i-2];
			
		}
		System.out.println(arr[19]);
		System.out.println(fib(20));
		
	}
	public static int fib(int n) {
		if(n==1||n==2) {
			return 1;
		}
		else {
			return fib(n-1)+fib(n-2);
		}
	}
}
