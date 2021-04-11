package cn.itcast.day04.demo03;

public class Demo05PrintArray {
		public static void main(String[] args) {
			int[] array= {323,43,45,23,232,
		};
			printArray(array);
			
}
		public static void printArray(int[] array){
			for(int i=0;i<array.length;i++) {
				System.out.println(array[i]);
			}
		}
}