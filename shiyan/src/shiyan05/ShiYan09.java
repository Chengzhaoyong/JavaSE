package shiyan05;
import java.util.Scanner;
public class ShiYan09 {
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("������뾶��");
			double r;
			try {
				  r = Double.parseDouble(s.next());
				System.out.println(3.14*r*r);
			}catch(NumberFormatException e) {
				System.out.println("����ֵ�쳣");
			}
		}
}
