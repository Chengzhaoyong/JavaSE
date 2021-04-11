package a2021_4_10;

import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
	        Scanner input=new Scanner(System.in);
	        String x=input.next();
	        String y=input.next();
	        Long x1=Long.parseLong(x);
	        Long y1=Long.parseLong(y);
	        
	        long N=Math.max(Math.abs(x1),Math.abs(y1));
	        
//	       String s=4*N*(N-1)+"";
//	        long sum=Long.parseLong(s);
	        long sum=4*N*(N-1);
	        
	    
	        if(x1<=y1){
	            sum+=(x1-(-N))+y1-(-N);

	        }
	        else 

	        {
	            sum+=(8*N-((x1-(-N))+y1-(-N)));
	        }
	        System.out.println(sum);
	    }

}
