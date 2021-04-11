package cn.itcast_02;

public class ArgsDemo {
	public static void main(String[] args) {
		int a=12;
		int b=29;
		int result=sum(a,b);
		System.out.println(result);
		
		System.out.println("----------");
		int c=20;
		int result1=sum(a,b,c);
		System.out.println(result1);
	}

	private static int sum(int...a ) {
		// TODO Auto-generated method stub
		int s=0;
		for(int x:a) {
			s+=x;
		}
		return s;
	}
}
