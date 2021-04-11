package Demo01;
/*
 * 继承中的构造方法的关系
 * 1.子类中的所有构造方法默认都会访问父类中的构造方法
 * 2.为什么呢
 *    因为子类会继承父类中的数据，可能还会使用父类的数据
 *    所以，子类初始化之前，一定要先完成父类数据的初始化。
 *    
 *    注意：子类每一个构造方法的第一条语句都会默认都是：super（）；
 * 
 */
class a{
	public a() {
		System.out.println("a的无参数构造方法");
	}
	public a(String name) {
		System.out.println("a的带参数构造方法");
	}
}

class b extends a{
	public b() {
		System.out.println("b的无参数构造方法");
	}
	public b(String name) {
		System.out.println("b的带参数构造方法");
	}
}
public class ExtendsDemo05 {
	public static void main(String[] args) {
		b s=new b("林青霞");
		
	}

}
