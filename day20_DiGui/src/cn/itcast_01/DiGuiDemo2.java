package cn.itcast_01;

public class DiGuiDemo2 {
		public static void main(String[] args) {
			//ѭ����
			int sum=1;
			for(int i=1;i<=5;i++) {
				sum*=i;
			}
			System.out.println(sum);
			System.out.println(jieCheng(5));
			
			//�ݹ鷨
		
		}
		public static int jieCheng(int n) {
			if(n==1) {
				return 1;
			}
			else {
				return n*jieCheng(n-1);
			}
		}
}
