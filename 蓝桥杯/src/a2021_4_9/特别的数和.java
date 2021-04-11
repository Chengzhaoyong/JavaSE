package a2021_4_9;

import java.util.Scanner;

public class 特别的数和 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			String s=i+"";
			if(s.contains("1")||s.contains("2")||s.contains("0")||s.contains("9")) {
				sum+=Integer.valueOf(s);
			}
		}
		System.out.println(sum);
	}

}
