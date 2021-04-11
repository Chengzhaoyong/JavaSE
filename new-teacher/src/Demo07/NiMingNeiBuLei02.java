package Demo07;

/*
 * 匿名内部类的面试题：
 * 按照要求，补齐代码
 *    interface Inter7{
 *    public absrtact void show();
 *    }
 *    class Outer7{//补全代码}
 *    class OuterDemo{
                 public static void main(String[] args){
                   Outer.method().show();
                 }
}      //要求控制台输出HelloWorld
 */

interface Inter7{
	public abstract void show();
}
class Outer7{
	//补全代码
	public static Inter7 method() {
		return new Inter7() {
			public void show() {
				System.out.println("HelloWorld");
			}
		};
	}
}
public class NiMingNeiBuLei02 {
	public static void main(String[] args) {
		Outer7.method().show();
		//1.Outer.method()可以看出metho()是一个静态方法
//		2.Outer.method.show()可以看出method（)法的返回值是一个对象
		//又由于接口有show(),所以我们可以认为返回的是一个接口
		
	}



}
