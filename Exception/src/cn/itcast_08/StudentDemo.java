package cn.itcast_08;
import java.util.Scanner;
public class StudentDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������ѧ���ɼ���");
		int score=sc.nextInt();
		
		Teacher t=new Teacher();
		try {
			t.check(score);
	
		}
		catch(MyException e){
			e.printStackTrace();
		}
	}
}
