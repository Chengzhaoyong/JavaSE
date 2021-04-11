package Demo01;
/*
 *   类的组成：
 *   成员变量、构造方法、成员方法
 *   而我们又讲到了继承，所以我们应该考虑一下，类的组成部分的各自的关系：
 *   
 *   继承中成员变量的关系：
 *    1.子类中的成员变量和父类中的成员变量名称不一样，这个太简单
 *   2.子类中的成员变量哥父类中的成员变量名称一样,这怎么玩
 *   在子类方法中访问一个变量的查找顺序：
 *   a:在子类方法的局部范围找，有就使用
 *   b:在子类的成员变量范围找，有就使用
 *   c:在父类的局部范围找
 *   d:没有找到就报错
 */


class Baba{
	public int num=10;
}

class Zizi extends Baba{
	public int num2=20;
	public int num=30;//子类中的成员变量哥父类中的成员变量名称一样
	public void show() {
		 int num=40;
		System.out.println(num);
		System.out.println(num2);
	}
}
public class ExtendsDemo03 {
			public static void main(String[] args) {
				Zizi s=new Zizi();
				s.show();
			}
}
