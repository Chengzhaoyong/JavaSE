package cn.itcast_05;

import java.util.Comparator;

public class MyComparator implements Comparator<Student> {
public int compare(Student s1,Student s2) {
	int num=s1.getName().length()-s2.getName().length();
	int num2=num==0?s1.getName().compareTo(s2.getName()):num;
	int num3=num2==0?s1.getAge()-s2.getAge():num2;
	return num3;
}
}
