package Demo01;
/*
 * 问题是：
 * 1，我不仅仅要输出局部范围的num，还会要输出本类成员范围的num，怎么办？
 * 2，我还想输出父类成员范围的num，怎么办？
 * 
 * this和super的区别：
 * this代表本类的引用。
 * super代表的是父类储存空间的标识（可以理解为父类引用，可以操作父类成员）
 * 
 * 怎么用呢
 * 1，调用成员变量
 *   this.成员变量 调用本类的成员变量
 *    super.成员变量  调用父类的成员变量
 *    
 *    2.调用构造方法
 *    this(...)  调用本类的构造方法
 *    super(...)  调用父类的构造方法
 *    
 *    3.调用成员方法
 *    this.成员方法   调用本类的成员方法
 *    super.成员方法   调用本类的成员方法  
 * 
 * 
 * 
 * 
 */

class Bababa{
	public int num=10;
}
class Zizizi extends Bababa{
	public int num=20;
	public void show() {
		int num=30;
		System.out.println(num);
		System.out.println(this.num);//解决了1
		System.out.println(super.num);//解决了2
	}
}
public class ExtendsDemo04 {
		public static void main(String[] args) {
			Zizizi s=new Zizizi();
			s.show();
		}
}
