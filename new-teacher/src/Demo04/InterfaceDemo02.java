package Demo04;
/*
 * 类与类：
 *    继承关系，只能单继承，可以多层继承
 * 类与接口；
 *    实现关系，可以单实现，也可以多实现
 *    并且还可以在继承一个类的同时实现多个接口
 * 接口与接口：
 *    继承关系可以单继承，也可以多继承。
 */
interface Father{
	public abstract void show();
}
interface Mother{
	public abstract void show2();
}

interface Sister extends Father,Mother{//接口与接口：
	//   继承关系可以单继承，也可以多继承。
	
	
}
class Son extends Object implements Father,Mother{//类与接口；
	  //  实现关系，可以单实现，也可以多实现
	    // 并且还可以在继承一个类的同时实现多个接口
	public  void show() {;
	System.out.println("show1 Son ");
	}
	public  void show2() {;
	System.out.println("show2 Son");
	}
}
public class InterfaceDemo02 {
			public static void main(String[] args) {
				Father s=new Son();
				s.show();
				Mother s1=new Son();
				s1.show2();
			}
}
