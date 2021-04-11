package Demo03;
/*
 * final修饰变量的初始化
 * 1.final修饰的变量只能赋值一次
 * 2.在构造方法完毕前（非静态的常量）
 */
class Demo{
	final int num=10;
	
	public Demo(){
//		num=200;//无法第二次赋值
	}
}
public class final02 {
		public static void main(String[] args) {
			Demo s=new Demo();
			System.out.println(s.num);
		}
}
