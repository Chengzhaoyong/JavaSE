package Demo07;
/*
 *    面试题： 要求请填空分别输出30，20，10
 *    
 *    注意：1.内部类和外部类没有继承关系
 *        2.通过外部类名限制this对象
 *           Outer.this
 */
class Outer3{
	public int num=10;
	class Inter{
		public int num=20;
		public void show() {
		int num=30;
			System.out.println(num);
			System.out.println(this.num);
			System.out.println(Outer3.this.num);
		}
	}
}
public class ChengYuanNeiBuLei02 {
		public static void main(String[] args) {
			Outer3.Inter oi=new Outer3().new Inter();
			oi.show();
		}
}
