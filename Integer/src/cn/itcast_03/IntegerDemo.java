package cn.itcast_03;
/*
 * int和String的相互转换
 * 
 */
public class IntegerDemo {
		public static void main(String[] args) {
			int number=100;
			String s1=String.valueOf(number);
			System.out.println(s1);
	
		//String--int
			String s="100";
			Integer s2=new Integer(s);
			int s4=s2.intValue();
			System.out.println(s4);
			//public static int parsrInt(String s)
			int y=Integer.parseInt(s);
			System.out.println(y);
			
		}	
}
