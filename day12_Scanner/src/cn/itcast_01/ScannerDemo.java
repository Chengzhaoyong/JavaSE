package cn.itcast_01;
/*
 *   Scanner:用于接收键盘录入的数据
 *   
 *   System类下有一个静态字段：
 *   public static final Inputstream in;标准的输入流，对应着键盘录入
 *   
 *   InputStream is=System.in;
 *   
 *   
 *   构造方法：
 *   public Scanner（InputStream source）
 *   
 *   
 */
import java.util.Scanner;
public class ScannerDemo {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int x=sc.nextInt();
			System.out.println(x);
			
		}
}
