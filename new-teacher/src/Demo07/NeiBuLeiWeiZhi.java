package Demo07;
/*
 *   内部类的位置
 *      成员位置：在成员位置定义的类，就叫成员内部类。
 *      局部位置：在局部位置定义的类，就叫局部内部类
 *      
 */

class Outer4{
	private int num=10;
	/*class Inter{     //成员位置：在成员位置定义的类，就叫成员内部类。
		
	}*/
	
	public void method() {
		class Inter{          //   局部位置：在局部位置定义的类，就叫局部内部类
		}
	}
}
public class NeiBuLeiWeiZhi {

}
