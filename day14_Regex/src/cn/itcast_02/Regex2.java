package cn.itcast_02;

import java.util.Arrays;

public class Regex2 {
		public static void main(String[] args) {
			//定义一个字符串数组
			String s="32 34 54 3434 38 5 9";
			//把字符串进行分割，得到一个字符串数组
			String[] strArray=s.split(" ");
			//把字符串数组转换成int数组
			int[] arr=new int[strArray.length];
			for(int i=0;i<arr.length;i++) {
				arr[i]=Integer.parseInt(strArray[i]);
				
			}
			//对int数组进行排序
			Arrays.sort(arr);
			//把排序后的数组组装成一个字符串
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
				
			}
		}
}
