package Demo07;
/*
 *     局部内部类：
 *      A：可以直接访问外部类的成员
 *      B：在局部位置，可以创建对象，通过对象调用内部类的方法，来使用局部内部类的功能
 *      
 *      面试题：
 *      局部内部类访问局部变量的注意事项
 *      A：局部内部类访问局部变量必须用final修饰
 *      B：为什么呢
 *         局部变量随着方法的调用而调用，随着调用完毕而消失
 *        而 堆内存的内容并不会立即消失。所以，我们加final修饰
 *        加入final修饰后，这个变量就成了常量。既然是常量，你消失了
 *        我在内存中存储的数据是20，所以，我还是有数据在使用
 *        
 */
class Outer5{
	private int num=10;
	public void method() {
		final int num2=20;
		class Inter{
			public void show() {
				System.out.println(num);
				System.out.println(num2);
			}
		}
		Inter i=new Inter();
		i.show();
	}
}
public class JuBuNeiBuLei01 {
	public static void main(String[] args) {
		Outer5 o=new Outer5();
		o.method();
	}


}
