package a2021_4_9;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class a2021_4_10 {
	public static void main(String[] args) {
		   Scanner input=new Scanner(System.in);
	        String arr=input.next();
	        Set<String> set=new HashSet<String>();
	        for(int i=0;i<arr.length();i++){
	            //以i为开头的所有可能结果所以j必须大于i
	            for(int j=i+1;j<=arr.length();j++){
	            //虽然substring 下标i~j的时候是不包含j的
	            //每个数字开头本身也是个非空子串，也符合题意
	            //所以不需要变成substring(i,j+1)，
	            //由于需要包含到最后一个字符所以j最大值为arr,length();
	                String temp=arr.substring(i,j);
	                set.add(temp);
	            }
	        }
	        System.out.println(set.size());
	    }
	

}
