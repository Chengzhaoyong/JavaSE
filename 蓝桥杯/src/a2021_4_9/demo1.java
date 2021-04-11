package a2021_4_9;
import java.math.BigInteger;
import java.util.*;
public class demo1 {
	public static void main(String[] args) {
//		Calendar c=Calendar.getInstance();
//		c.set(2000,1,1);
//		c.add(Calendar.DATE, -1);
//		System.out.print(c.get(Calendar.DATE));
		
		
		BigInteger bigA=new BigInteger("2");
		BigInteger bigB=new BigInteger("3");
		BigInteger bigC=new BigInteger("2");
		BigInteger bigD=new BigInteger("3");
		
		BigInteger sb=new BigInteger("0");
		BigInteger xb=new BigInteger("0");
		
		int count=1;
		while(count<123456) {
			sb=(bigA.multiply(bigC)).subtract(bigB.multiply(bigD));
			xb=(bigA.multiply(bigD)).add(bigB.multiply(bigC));
			bigC=sb;
			bigD=xb;
			count++;
		}
		
		System.out.println(sb+"+"+xb+"i");
		
		
	}
	
	
	
	

}
