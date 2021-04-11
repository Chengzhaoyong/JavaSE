package Demo07;
/*
 * 成员内部类的修饰符：
 * private:保护数据的安全性
 * static：为了方便访问数据
 * 注意：静态内部类只能访问
 * 
 * 案例：我有一个人（人有身体，身体内有心脏）
 * 
 * class Body{
 *   private class Heart{//加了private修饰，不能通过对象访问
 *     public void operator{
 *     System.out.println("心脏搭桥");
 *     }
 *   
 *   }
 *   public void method(){
 *   if(如果你是内部医生){
 *     Heart h=new Heart();
 *     h.operator();
 *   }
 *   }
 *   
 *   }
 *   
 *   然后我再:   Body  b=new  Body();
 *     b.operator();
 */

class Outer2{
	private int num=10;
	//内部类用静态是因为内部类可以看出是外部类的成员
	private static int num2=20;
	public static class Inter{
		public static void show() {
			//System.out.println(num);//静态内部类只能访问外部静态的成员
			System.out.println(num2);
		}
	}
}
public class ChengYuanNeiBuLei01 {
		public static void main(String[] args) {
		//	Outer.Inter oi=new Outer().new Inter();
			//oi.show();//类被静态修饰后，不能通过对象访问
			
		//	成员内部类被静态修饰后的访问方式：
	//      格式：外部类名。内部类名 对象名=new 外部类名.内部类名（）
			Outer2.Inter oi=new Outer2.Inter();
			oi.show();
			//show()的另一种调用
			Outer2.Inter.show();
			
		}
}
