package cn.itcast.day06.demo01;

import java.util.Arrays;

public class Demo01PrintArray {
		public static void main(String[] args) {
			int[] array= {12,24,434,32,32
		};//首先面向过程的思想，每个步骤细节都要亲自处理
			System.out.print("[");
			for(int i=0;i<array.length;i++) {	
				if(i==array.length-1) {
					System.out.println(array[i]+"]");
				}			
				else {
					System.out.print(array[i]+",");
	}
	}
			
			System.out.println("=============");
			//面对对象的思想，达到同样的效果。
			//自己不处理详细的步骤，而是找人帮我做事。
			//在JDK中已经给我们提供了一个工具，叫做Arrays。
			//通过这个工具就可以将数组转换成为指定格式的字符串
			System.out.println(Arrays.toString(array));
	}
		
				
			
	}

