package a2021_4_9;

import java.util.Scanner;

public class daoyu {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] chars=new String[n];
	    Scanner sc1=new Scanner(System.in);
		for(int i=0;i<n;i++) {
			String s=sc1.nextLine();
			chars[i]=s;
		}
		int count=0;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1;j++) {
			  if('#'==chars[i].charAt(j)) {
				  if(('#'==chars[i].charAt(j+1))&&('#'==chars[i+1].charAt(j))&&('#'==chars[i+1].charAt(j+1))){
					  count++;
				  }
			  }
			}
		}
		System.out.println(count);
		
		
	}

}
