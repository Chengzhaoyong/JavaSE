package cn.itcast_06;

import java.util.HashSet;
import java.util.Random;

/*
 *   随机产生10个1到20的随机数，并存到集合中
 */
public class HashSetDemo {
		public static void main(String[] args) {
			Random r=new Random();
			HashSet<Integer> hs=new HashSet<Integer>();
			
			
			while(hs.size()<10) {
				Integer i=r.nextInt(20)+1;
				hs.add(i);
				
			}
			
			
			for(Integer i:hs) {
				System.out.println(i);
			}
		}
}
