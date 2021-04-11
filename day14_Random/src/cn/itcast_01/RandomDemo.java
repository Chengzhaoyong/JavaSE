package cn.itcast_01;

import java.util.Random;

/*
 *   Random:产生随机数的类
 *   
 *   构造方法：
 *   public Random():没有种子，用的是默认种子，是当前时间的毫秒值
 *   public Random(long seed):给出指定的种子
 *   
 *   成员方法：
 *     public int nextInt():返回时int范围的随机数
 *     public int nextInt(int n):返回是【0，n）de 随机数
 */
public class RandomDemo {
		public static void main(String[] args) {
		//	Random r=new Random(232434);//使用带参数的构造，每次随机数是相同的
			Random r=new Random(4232322);
			for(int i=0;i<10;i++) {
				int num=r.nextInt(100)+1;
				System.out.println(num);
			}
		}
}
