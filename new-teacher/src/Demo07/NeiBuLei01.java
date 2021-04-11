package Demo07;
/*
 * 
 * 内部类概述：
 *     把类定义在其他类的内部，这个类就称为内部类
 *     举例：在类A中定义了一个类B，类B就是内部类
 *     内部类的访问特点：
 *       A：内部类可以直接访问外部类的成员，包括私有。
 *       B：外部类要访问内部类的成员必须创建对象
 */

class Outer{
	
	private int num=10;
	class Inter{
		public void show() {
			System.out.println(num); //A：内部类可以直接访问外部类的成员，包括私有。
		}
	}
	public void method() {
		Inter s=new Inter();// B：外部类要访问内部类的成员必须创建对象
		s.show();
	}

}
public class NeiBuLei01 {

}
