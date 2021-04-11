package Demo01;
/*
 * Java中继承的特点：
 * 1.Java只支持单继承，不支持多继承。
 * 有些语言是支持多继承的，格式：extends 类1，类2，....
 * 
 * 2.Java支持多层继承（继承体系）
 */
class GrandFather{
	public void show() {
		System.out.println("我是爷爷");
	}
}
class Father extends GrandFather{
	public void Method() {
		System.out.println("我是爸爸");
	}
}
class Son extends Father{
	
}

class ExtendsDemo01 {
		public static void main(String[] args) {
			Son s=new Son();
			s.Method();
			s.show();
			
		}
}
