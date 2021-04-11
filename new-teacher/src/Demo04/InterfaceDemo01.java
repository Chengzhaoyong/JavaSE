package Demo04;
/*
 * 接口成员特点：
 * 成员变量:只能是常量，并且是静态的
 *    默认修饰符：public static final
 *    建议：自己手动给出。
 * 构造方法:接口没有构造方法
 * 成员方法:只能是抽象方法
 * 默认修饰符：public abstract
 * 建议自己给出
 * 
 *   所有的类都默认继承自一个类：Object
 *   类Object  是类层次的根类。每个类都使用Object作为超类
 */
interface Inter{ 
	public int num=10;
 public final  int num2=20;
	public abstract void show();
	
}
//接口名+Impl这种格式是接口的实现格式
class InterImpl implements Inter{//子类继承object,
  public  void show() {
	   
   }
}
public class InterfaceDemo01 {
		public static void main(String[] args) {
			Inter i=new InterImpl();
			System.out.println(i.num);
			System.out.println(i.num2);
			
			
			System.out.println(Inter.num);//由此可以看出，接口的成员变量是静态常量，
			System.out.println(Inter.num2);//可以用类名调用
		}
}
