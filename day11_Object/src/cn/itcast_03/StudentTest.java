package cn.itcast_03;
/*
 *   public boolean equals(Object obj):ָʾ���������Ƿ���˶�����ȡ�
 *   ��Դ�룺
 *      public boolean equals(Object obj){
			return (s1==s2);
	"=="
	��������:�Ƚϵľ���ֵ�Ƿ���ͬ
	�������ͣ��Ƚϵľ��ǵ�ֵַ�Ƿ���ͬ
		
}
 */
public class StudentTest {
			public static void main(String[] args) {
				Student s1=new Student("����ϼ",27);
				Student s2=new Student("����ϼ",27);
			
				System.out.println(s1==s2);
				Student s3=s1;
				System.out.println(s1==s3);
				System.out.println("============");
				Student s4=new Student("������",20);
				System.out.println(s1.equals(s2));
				System.out.println(s1.equals(s1));
				System.out.println(s1.equals(s3));
				System.out.println(s1.equals(s4));
			}
}
