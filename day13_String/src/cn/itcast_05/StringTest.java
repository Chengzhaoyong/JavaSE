package cn.itcast_05;

public class StringTest {
		public static void main(String[] args) {
			String s="helloWORLD";
			
			String s1=s.substring(0,1);//获取第一个字符
			String s2=s.substring(1);//获取除了第一个字符的字符串
			
			String s3=s1.toUpperCase();//把第一个字符转换大写
			String s4=s2.toLowerCase();//换小写
			String s5=s3.concat(s4);//连接
			System.out.println(s5+s5);
		}
}
