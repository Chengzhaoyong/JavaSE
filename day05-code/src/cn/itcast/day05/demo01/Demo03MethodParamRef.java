package cn.itcast.day05.demo01;

public class Demo03MethodParamRef {
	public static void main(String[] args) {
		int[] array= {10,20,30};
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println("===========");
		change(array);
		System.out.println("===========");
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
}
		public static void change(int[] arr) {
			arr[0]*=10;
			arr[1]*=10;
			arr[2]*=10;
			System.out.println(arr[0]);
			System.out.println(arr[1]);
			System.out.println(arr[2]);
			
		}
}