package cn.itcast_02;
/*
 *   ������ʽ��
 *   public boolean hasNextxxx():�ж��Ƿ�ĳ�����͵�Ԫ��
 *   public Xxx nextInt(Xxx):��ȡ��Ԫ��
 *   
 *   ������
 *   ��int���͵ķ�������
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
