package cn.itcast_08;
import java.util.Scanner;
public class StudentDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入学生成绩：");
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
