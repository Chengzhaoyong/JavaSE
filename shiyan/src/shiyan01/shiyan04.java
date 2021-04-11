package shiyan01;

public class shiyan04 {
		public static void main(String[] args) {
			int n=0,sum=0;
			while(sum<=9999) {
				n++;
				sum=sum+jiecheng(n);
				
			}
			System.out.println(n-1);
			
		}
		public static int jiecheng(int a) {
			int s=1,i;
			for(i=1;i<=a;i++) {
				s*=i;
			}
			return s;
		}
		
}
