package cn.itcast_04;
import java.util.Arrays;

/*
 *   Arrays:针对数组进行操作的工具类，比如说排序和查找
 *   1.public static String toString()int[] a):把数组转成字符串
 *   2.public static void sort(int[] a):对数组进行排序
 *   3.public static int binarySearch(int[] a,int key):二分法查找
 *   
 *   
 *    
 *    */
public class ArrayDemo {
		public static void main(String[] args) {
			int[] arr= {12,34,23,44,33,22};
			System.out.println(Arrays.toString(arr));
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));
			
			System.out.println(Arrays.binarySearch(arr, 44));
		}
}
