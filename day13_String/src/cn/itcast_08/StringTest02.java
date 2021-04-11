package cn.itcast_08;


public class StringTest02 {
	public static void main(String[] args) {
		String maxString = "woaijavawozhendeaijavawozhendehenjavaaijavaava";
		String minString = "java";
		int s=getCount(maxString,minString);
		System.out.println("java出现了"+s+"次");
		
	}
	public static int getCount(String maxString,String minString) {
		int count=0;
		int index=maxString.indexOf(minString);
		while(index!=-1) {
			count++;
			int startIndex=index+minString.length();
			maxString=maxString.substring(startIndex);
			index=maxString.indexOf(minString);
			
		}
		return count;
	}
}
