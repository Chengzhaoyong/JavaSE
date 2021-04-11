package Demo02;
/*
 * 方法重写：子er类中出现了和父类中方法声明一模一样的方法。
 * 
 * 方法重载：
 * 本类中出现的方法名一样，参数列表不同的方法，与返回值无关。
 * 
 * 子类对象调用方法的时候：
 * 先找子类本身，再找父类
 * 
 * 方法重写的应用：
 *   当子类需要父类的功能的时候，而功能主体子类有自己的特有内容，可以重写父类中的方法。
 *   这样，即沿袭了父类的功能，又定义子类特有的内容。
 *   
 *   案例：
 *   
 *   1.定义一个手机类：
 *   2.通过研究，我发明了一个新的手机，这个手机的作用是在打完电话后，可以听天气预报。
 */
class Phone{
	public void call(String name){
		System.out.println("给"+name+"打电话");
	}
}

class NewPhone extends Phone{
	public void call(String name) {
//		System.out.println("给"+name+"打电话");
		super.call(name);//引用父类的功能
		System.out.println("可以听天气预报了");
	}
}
public class fangfachongxie {
		public static void main(String[] args) {
			NewPhone np=new NewPhone();
			np.call("林青霞");
		}
}
