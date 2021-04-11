package Demo03;
/*
 * 多态的弊端：
 *    不能使用子类的特有功能
 *    
 *    我就想使用子类的特有功能。
 *    怎么用呢；
 *    1.创建子类对象调用方法即可，（可以，但是很多时候不合理，而且，太占内存了）
 *    
 *    2.把父类的引用强制转换为子类的引用（向下转型）
 *    e
 *    对象间的转型问题：
 *    向上转型：
 *    Fu  f=new Zi();
 *    向下转型：
 *    Zi z=(zi)f;//要求该f必循能够转换Zi的
 *    
 *    
 *   
 */

class ff{
	int num=10;
	public void show() {
		System.out.println("show Fu");
	}

}
class zz extends ff{
	int num=100;
	public void show() {
		System.out.println("show Zi");
	}
	public  void method() {
		System.out.println("show method");
	}
}
public class DuoTaiBiDuan {
public static void main(String[] args) {
	
//向上转型
		ff f=new zz();
	      f.show();
	   System.out.println(f.num);
//	      f.method();
//怎么样调用子类特有的功能呢	
	      //向下转型
	      zz z=(zz)f;
	      z.method();
	      
	      
	      
	      
	      
	}	    	
	
}
