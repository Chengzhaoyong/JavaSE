package shiyan01;

public class shiyan05 {
		public static void main(String[] args) {
			int n=100,a,b,c;
		   while(n<1000) {	
			   a=n/100;
			   b=n%100/10;
			   c=n%10;
			   if(n==a*a*a+b*b*b+c*c*c) {
				   System.out.println(n);
			   }
			   n++;
		   }
		}
}
