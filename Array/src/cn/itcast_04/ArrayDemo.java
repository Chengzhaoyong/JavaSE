package cn.itcast_04;
import java.util.Arrays;

/*
 *   Arrays:���������в����Ĺ����࣬����˵����Ͳ���
 *   1.public static String toString()int[] a):������ת���ַ���
 *   2.public static void sort(int[] a):�������������
 *   3.public static int binarySearch(int[] a,int key):���ַ�����
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
