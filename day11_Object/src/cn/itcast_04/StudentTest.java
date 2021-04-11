package cn.itcast_04;
/*
 * protect void finalize():  当垃圾回收器确定不存在对该对象的更多引用时，
 * 							由对象的垃圾回收器调用此方法。
 * protect Object clone():创建并返回此对象的一个副本。
 * A:重写该方法
 * 
 * Cloneable :此类实现了Cloneable接口，以指示Object。clone()方法可以合法的对该类进行按字段
 * 复制，这个接口是标记接口，告诉我们实现该接口的类就可以实现对象复制了
 */



public class StudentTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		//创建学生对象
		Student s1=new Student();
		s1.setAge(27);
		s1.setName("林青霞");
		//克隆学生对象
		Object obj=s1.clone();
		Student s2=(Student)obj;

		
		//以前的做法
		Student s3=s1;
		System.out.println(s3.getName()+"----"+s3.getAge());
		System.out.println("===========");
		s3.setName("刘意");
		s3.setAge(30);
		System.out.println(s1.getName()+"----"+s1.getAge());
		System.out.println(s2.getName()+"----"+s2.getAge());
		System.out.println(s3.getName()+"----"+s3.getAge());
		
		
	}

}
