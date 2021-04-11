package cn.itcast_06;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 *   键盘录入五个学生的名字，语文成绩，数学成绩，英语成绩，总分高的排序输出控制台
 */
public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Student> ts=new TreeSet<Student>(new Comparator<Student>() {
			public int compare(Student s1,Student s2) {
				int num=s2.getFinalScore()-s1.getFinalScore();
				int num2=num==0?s1.getChineseScore()-s2.getChineseScore():num;
				int num3=num2==0?s1.getMathScore()-s2.getMathScore():num2;
				int num4=num3==0?s1.getEnglishScore()-s2.getEnglishScore():num3;
				int num5=num4==0?s1.getName().compareTo(s2.getName()):num4;
				return num5;
			}
		});
		
		for(int i=1;i<6;i++) {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("请输入第"+i+"个学生的名字；");
			String name=sc.nextLine();
			System.out.println("请输入第"+i+"个学生的语文成绩：");
			String chineseScore=sc.nextLine();
			System.out.println("请输入第"+i+"个学生你的数学成绩：");
			String mathScore=sc.nextLine();
			System.out.println("请输入第"+i+"个学生的英语成绩：");
			String englishScore=sc.nextLine();
			
			Student s=new Student();
			s.setName(name);
			s.setChineseScore(Integer.parseInt(chineseScore));
			s.setMathScore(Integer.parseInt(mathScore));
			s.setEnglishScore(Integer.parseInt(englishScore));
			
			ts.add(s);
			
		}
		System.out.println("学生的成绩录入完毕");
		System.out.println("姓名"+"\t"+"语文成绩"+"\t"+"数学成绩"+"\t"+"英语成绩");
		for(Student s:ts) {
			System.out.println(s.getName()+"\t"+s.getChineseScore()+"\t"+s.getMathScore()+"\t"+s.getEnglishScore()+"\t");
		}
		}
}
