package shiyan04;
import java.util.Scanner;
public class ShiYan11 {
	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				String s1=sc.nextLine();
				String s2=sc.nextLine();
				char[] arr=s1.toCharArray();
				int count=0;
				int index=s1.indexOf(s2);
				while(index!=-1) {
					count++;
					int startIndex=index+1;
					s1=s1.substring(startIndex);
					index=s1.indexOf(s2);
					
				}
			System.out.println(count);
		   
			}
	}


