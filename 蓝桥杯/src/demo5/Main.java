package demo5;
//2021/2/13
import java.util.Collections;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		//特殊回文数
//		 Scanner input = new Scanner(System.in);  
//		 int n=input.nextInt();  
//		for(int i=10000;i<=999999;i++) {
//			StringBuilder sb=new StringBuilder(i+"");
//			int num=0;
//			if(sb.toString().equals(sb.reverse().toString())) {
//				for(int j=0;j<sb.toString().length();j++) {
//					num += new Integer(sb.charAt(j)-48);
//					//num+=Integer.valueOf(sb.toString().charAt(j));
//				}
//			}
//			
//			if(num==n) {
//				System.out.println(i);
//			}
//		}

		
	//回文数	
//		for(int i=1000;i<10000;i++) {
//			StringBuilder sb=new StringBuilder(i+"");
//			
//			if(sb.toString().equals(sb.reverse().toString())) {
//				System.out.println(i);
//			
//			}
//		}

		//水花仙数
//		for(int i=101;i<1000;i++) {
//			int s1=i/100;
//			int s2=i/10%10;
//			int s3=i%10;
//			if(i==(s1*s1*s1+s2*s2*s2+s3*s3*s3)) {
//				System.out.println(i);
//			}
//		}
		
		//杨辉三角形
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int[][] ints=new int[n][n];
//		for(int i=0;i<n;i++) {
//			ints[i][0]=1;
//		}
//		for(int i=1;i<n;i++) {
//			for(int j=1;j<=i;j++) {
//				ints[i][j]=ints[i-1][j-1]+ints[i-1][j];
//			}
//		}
//		
//		for(int k=0;k<n;k++) {
//			for(int j=0;j<=k;j++) {
//				System.out.print(ints[k][j]+" ");
//			}
//			System.out.println();
//		}
//		
		
		
		//查找整数
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int[] ints=new int[n];
//		for(int i=0;i<n;i++) {
//			ints[i]=sc.nextInt();
//		}
//		int s=sc.nextInt();
//		int j;
//	for(j=0;j<n;j++) {
//		if(ints[j]==s) {
//			System.out.println(j+1);
//			break;
//		}
//	}
//	if(j==n) {
//		System.out.println(-1);
//	}
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] ints=new int[n];
		for(int i=0;i<n;i++) {
			ints[i]=sc.nextInt();
		}
		
		int min=ints[0];
		int max=ints[0];
		int sum=0;
		for(int i=0;i<ints.length;i++) {
			sum+=ints[i];
			if(min>ints[i]) {
				min=ints[i];
			}
			if(max<ints[i]) {
				max=ints[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum);
		
}
}