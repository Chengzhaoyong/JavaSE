package cn.itcast_01;
/*
 * Object：类Object  是类层次的根类，每个类都使用Object作为超类
 * 
 * 每个类都直接或者间接的继承Object类
 * 
 * Object类的方法：
 *    public int hashCode():返回该对象的哈希码值
 *      注意：哈希码值是根据哈希算法计算出来的一个值，这个值和地址值有关，但是不是实际地址值
 *      你可以理解是地址值
 *      
 *      public final class getClass():返回Object的运行时类
 *      
 *      class类的方法
 *      public String getName():以String的形式返回此Class对象所表示的类名
 *       
 *       */
public class StudentTest {
	public static void main(String[] args) {
		Student s=new Student();
		System.out.println(s.hashCode());
		Student s1=new Student();
		System.out.println(s1.hashCode());
		
		System.out.println("===========");
		Student s2=new Student();
		Class c=s.getClass();
		String str=c.getName();
		System.out.println(str);
		System.out.println("============");
		//链式编程
		String str2=s2.getClass().getName();
		System.out.println(str2);
		
		
	}

}
