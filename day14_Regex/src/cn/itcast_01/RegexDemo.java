package cn.itcast_01;
import java.util.Scanner;
public class RegexDemo {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("«Î ‰»ÎQQ√‹¬Î£∫");
			String qq=sc.nextLine();
			System.out.println("checkQQ:"+checkQQ(qq));
		
		}
		public static boolean checkQQ(String QQ) {
//			String regex="[1-9] [0-9] [4,14]";
			return QQ.matches("[1-9][0-9]{4,14}");
			
		}
}
