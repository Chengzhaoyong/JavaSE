package cn.itcast_01;

public class ArrayDemo {
		public static void main(String[] args) {
			int[] arr={23,434,232,4,3,2,4,23};
		    printArray(arr);
			for(int i=0;i<arr.length-1;i++) {
				for(int j=0;j<arr.length-i-1;j++) {
					if(arr[j]>arr[j+1]) {
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
			printArray(arr);

		
		}
		public static void printArray(int[] arr) {
			System.out.print("[");
			for(int x=0;x<arr.length;x++) {
				if(x==arr.length-1) {
					System.out.print(arr[x]);
				}
				else {
					System.out.print(arr[x]+",");
				}
			}
			System.out.println("]");
		
		
		}
}
