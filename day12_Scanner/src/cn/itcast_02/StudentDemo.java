package cn.itcast_02;
/*
 *   基本格式：
 *   public boolean hasNextxxx():判断是否某种类型的元素
 *   public Xxx nextInt(Xxx):获取该元素
 *   
 *   举例：
 *   用int类型的方法举例
 *   public boolean hasNextInt()
 *   public int nextInt()
 */
import java.util.Scanner;
public class StudentDemo {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
		   int[] arr=new int[2];
		   int[] arr1=new int[2];
		   for(int i=0;i<2;i++) {
			 
			   arr[i]=sc.nextInt();
			   arr1[i]=sc.nextInt();
		   }
		   for(int k=0;k<arr.length;k++) {
			   System.out.print(arr[k]+" ");
		   }
		  
		}
}
