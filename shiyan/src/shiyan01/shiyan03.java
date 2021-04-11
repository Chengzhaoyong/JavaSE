package shiyan01;

public class shiyan03 {
		public static void main(String[] args) {
			int i,j;
			for(i=2;i<1000;i++) {
				int sum=0;        //每次求完一个数，sum要初始化
				for(j=1;j<i;j++) {
					
					if(i%j==0) {
						sum=sum+j;
					}
				}
				if(i==sum) {
					System.out.println(i);
				}
			}
		}
}
