package a2021_4_9;

import java.util.Scanner;

public class egg {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int n=sc.nextInt();
		
		int[][] f=new int[n+1][k+1];
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=k;j++) {
				f[i][j]=f[i-1][j]+f[i-1][j-1]+1;
		}
			if(f[i][k]>=n) {
				System.out.println(i);
				break;
			}
		}
		
	}

}
