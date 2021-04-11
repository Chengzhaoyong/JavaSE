package cn.itcast_02;

import java.util.ArrayList;
import java.util.Random;
/*
 *   产生10个随机数，要求不能重复
 */
public class RandomDemo {
		public static void main(String[] args) {
			ArrayList<Integer> array=new ArrayList<Integer>();
			Random r=new Random();
			int count=0;
			while(count<10) {
				int number=r.nextInt(20)+1;
				if(!array.contains(number)) {
					array.add(number);
					count++;
				}
			}
			for(Integer i:array) {
				System.out.println(i);
			}
		}
}
