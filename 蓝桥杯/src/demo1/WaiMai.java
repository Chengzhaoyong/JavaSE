package demo1;

import java.util.Scanner;

public class WaiMai {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int[] ts=new int[a];
		int[] id=new int[a];
		int[] pool=new int[k];
		
		for(int i=0;i<a;i++) {
			ts[i]=sc.nextInt();
			id[i]=sc.nextInt();
		}
		
		int[] flag=new int[k];
		int m=1;
		while(m<=b) {
			for(int i=0;i<a;i++) {
				if(ts[i]==k) {
					int n=id[i]-1;
					pool[n]+=2;
					flag[n]=1;
				}
			}
			for(int i=0;i<flag.length;i++) {
				if(flag[i]==1) {
					flag[i]=0;
				}else {
					if(pool[i]>=1) {
						pool[i]-=1;
					}
				}
			}
			
			m++;
		}
		int count=0;
		
		for(int i=0;i<k;i++) {
			if(pool[i]>3) {
				count++;
			}
		}
		System.out.print(count);
	}
	}
			