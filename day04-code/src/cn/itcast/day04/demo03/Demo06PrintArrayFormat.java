package cn.itcast.day04.demo03;
/*
 * [10,20,30,40,50]
 * 怎样不换行
 * println去掉ln,就是不换行
 */
public class Demo06PrintArrayFormat {
		public static void main(String[] args) {
			int[] array= {10,20,30,40,50};
			printArrayFormat(array);
			
		

		}
		public static void printArrayFormat(int[] array) {
			System.out.print("[");
			for(int i=0;i<array.length;i++) {
				if(i==array.length-1) {
					System.out.println(array[i]+"]");
				}
				else {
				System.out.print(array[i]+",");
			}
}
		}
}
