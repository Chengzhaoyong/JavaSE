package Demo07;


/*
 * 成员内部类：
 * 如何直接访问内部类的成员
 *    外部类名.内部类名 对象名=外部类对象.内部类对象；
 *   
 */

class Outer1{
	private int num = 10;

	class Inter {
		public void show() {
			System.out.println(num);
		}
	}
}
public class ChengYuanNeiBuLei {
	public static void main(String[] args) {
		// 外部类名.内部类名 对象名=外部类对象.内部类对象；
		Outer1.Inter oi = new Outer1().new Inter();
		oi.show();
	}
}
