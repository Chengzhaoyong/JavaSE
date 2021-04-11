package cn.itcast_03;
/*
 *   public boolean equals(Object obj):指示其他对象是否与此对象“相等”
 *   看源码：
 *      public boolean equals(Object obj){
			return (s1==s2);
	"=="
	基本类型:比较的就是值是否相同
	引用类型：比较的就是地址值是否相同
		
}
 */
public class StudentTest {
			public static void main(String[] args) {
				Student s1=new Student("林青霞",27);
				Student s2=new Student("林青霞",27);
			
				System.out.println(s1==s2);
				Student s3=s1;
				System.out.println(s1==s3);
				System.out.println("============");
				Student s4=new Student("风清扬",20);
				System.out.println(s1.equals(s2));
				System.out.println(s1.equals(s1));
				System.out.println(s1.equals(s3));
				System.out.println(s1.equals(s4));
			}
}
