package shiyan03;
import java.util.Scanner;
public class shiyan {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String s= s1.replace(s2,"");
     	System.out.println(s);
	}
}

