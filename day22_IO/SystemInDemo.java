package cn.itcast_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *  键盘录入数据；
 *  通过字符缓冲流包装标准输入流实现
 *      
 */
public class SystemInDemo {
		public static void main(String[] args) throws IOException {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("请输入一个字符串：");
			String s=br.readLine();
			System.out.println("你输入的字符串是"+s);
			System.out.println("请输入一个整数：");
			String s1=br.readLine();
			int i=Integer.parseInt(s1);
			System.out.println("你输入的整数是："+i);
		}
}
