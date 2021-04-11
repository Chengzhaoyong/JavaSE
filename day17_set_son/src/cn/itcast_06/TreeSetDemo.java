package cn.itcast_06;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
 *   ����¼�����ѧ�������֣����ĳɼ�����ѧ�ɼ���Ӣ��ɼ����ָܷߵ������������̨
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
			
			System.out.println("�������"+i+"��ѧ�������֣�");
			String name=sc.nextLine();
			System.out.println("�������"+i+"��ѧ�������ĳɼ���");
			String chineseScore=sc.nextLine();
			System.out.println("�������"+i+"��ѧ�������ѧ�ɼ���");
			String mathScore=sc.nextLine();
			System.out.println("�������"+i+"��ѧ����Ӣ��ɼ���");
			String englishScore=sc.nextLine();
			
			Student s=new Student();
			s.setName(name);
			s.setChineseScore(Integer.parseInt(chineseScore));
			s.setMathScore(Integer.parseInt(mathScore));
			s.setEnglishScore(Integer.parseInt(englishScore));
			
			ts.add(s);
			
		}
		System.out.println("ѧ���ĳɼ�¼�����");
		System.out.println("����"+"\t"+"���ĳɼ�"+"\t"+"��ѧ�ɼ�"+"\t"+"Ӣ��ɼ�");
		for(Student s:ts) {
			System.out.println(s.getName()+"\t"+s.getChineseScore()+"\t"+s.getMathScore()+"\t"+s.getEnglishScore()+"\t");
		}
		}
}
