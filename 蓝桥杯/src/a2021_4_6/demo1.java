package a2021_4_6;

public class demo1 {
	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=2020;i++) {
		   String j=String.valueOf(i);
		   if(j.contains("2")){
			   count++;
		   }
		}
		System.out.print(count);
	}
}
