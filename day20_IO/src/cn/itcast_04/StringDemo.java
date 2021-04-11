package cn.itcast_04;

import java.util.Arrays;

/*
 *   计算机是如何识别什么时候把两个字节转换为一个中文呢
 *     在计算及中文的存储分为两个字节 
 *         第一个字节肯定是负数
 *         第二个数字常见是负数，可能有正数，但是没影响
 */
public class StringDemo {
		public static void main(String[] args) {
//			String s="abcde";
//			//[97, 98, 99, 100, 101]
//			byte[] bys=s.getBytes();
//			System.out.println(Arrays.toString(bys));
			
			String s="我爱中国";
			//[-50, -46, -80, -82, -42, -48, -71, -6]
			byte[] bys=s.getBytes();
			System.out.println(Arrays.toString(bys));
		}
}
