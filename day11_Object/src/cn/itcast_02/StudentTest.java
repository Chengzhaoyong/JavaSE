/**
 * 
 */
package cn.itcast_02;

/**
 * @author 阳光小伙
 *  public String toString()：返回该对象的字符串表示
 *  
 *  Integer类下的静态方法：
 *     public static String toHexString(int i):把一个整数专转成一个十六进制表示的字符串
 *
 *   但是这个信息没有意义，所以建议子类重写该方法
 *   怎么重写呢
 *      把该类的所有成员变量值返回即可
 *      
 */

public class StudentTest {
	public static void main(String[] args) {
		Student s=new Student("林青霞",39);
		System.out.println(s.hashCode());
		System.out.println(s.getClass().getName());
		System.out.println("===============");
	     
		System.out.println(s.toString());
		System.out.println(s);//打印对象时，相当调用toString()
		//toString()方法的值等价于
	//	getClass().getName()+'@'+Integer.toHexString(hashcode())
	}

}
