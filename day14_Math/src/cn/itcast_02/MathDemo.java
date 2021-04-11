package cn.itcast_02;
import java.util.Scanner;
public class MathDemo {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入开始数：");
	int start=sc.nextInt();
	System.out.println("请输入结束数：");
	int end=sc.nextInt();
	for(int i=0;i<100;i++) {
		System.out.println(getRandom(start,end));
	}
	
}
  
     public static int getRandom(int start,int end) {
    	 int number=(int)(Math.random()*(end-start+1))+start;
    	 return number;
     }
  
}
