package a2021_4_9;

import java.util.Scanner;

public class demo2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int n=sc.nextInt();
        int[][] s=new int[k+1][n+1];
        for(int i=1;i<=k;i++)
            s[i][1]=1;
        for(int j=1;j<=n;j++){
            s[1][j]=j;
        }

        for(int i=2;i<=k;i++){
            for(int j=2;j<=n;j++){
               s[i][j]=s[i-1][j];
                for(int x=1;x<=j;x++){
                	int min=Math.max(1+s[i-1][x-1],1+s[i][j-x]);
                	if(min<s[i][j]) {
                		s[i][j]=min;
                	}
                    
                }
            }
        }
//       for(int i=1;i<=k;i++) {
//    	   for(int j=1;j<=n;j++) {
//    		   System.out.print(s[i][j]+" ");
//    	   }
//    	   System.out.println();
//       }
        System.out.println(s[k][n]);
	}

}
