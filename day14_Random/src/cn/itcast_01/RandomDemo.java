package cn.itcast_01;

import java.util.Random;

/*
 *   Random:�������������
 *   
 *   ���췽����
 *   public Random():û�����ӣ��õ���Ĭ�����ӣ��ǵ�ǰʱ��ĺ���ֵ
 *   public Random(long seed):����ָ��������
 *   
 *   ��Ա������
 *     public int nextInt():����ʱint��Χ�������
 *     public int nextInt(int n):�����ǡ�0��n��de �����
 */
public class RandomDemo {
		public static void main(String[] args) {
		//	Random r=new Random(232434);//ʹ�ô������Ĺ��죬ÿ�����������ͬ��
			Random r=new Random(4232322);
			for(int i=0;i<10;i++) {
				int num=r.nextInt(100)+1;
				System.out.println(num);
			}
		}
}
