package cn.itcast_03;
import java.util.Arrays;
/*
 *   public static void arraycopy(Object src, int srcPos,Object dest, 
 *     int destPos, int length)
 */
public class SystemDemo {
		public static void main(String[] args) {
			int[] arr= {23,545,65,5,6,3};
			int[] arr1= {232,344,45,56,67,67,76};
			System.arraycopy(arr,2,arr1,2,4);
		
			System.out.println(Arrays.toString(arr));//ԭ���鸴�ƺ󲻱�
			System.out.println(Arrays.toString(arr1));
		}
}
