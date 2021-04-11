package Demo02;
/*	方法重写的注意事项：
	1.父类中的私有方法不能被重写
	  因为父类私有方法子类根本就无法继承
	  2.子类重写父类方法时，访问权限不能更低
	  最好一致
	  3.父类静态方法，子类也必须静态方法重写
8*/
class Father{
	public void show() {
		System.out.println("show Father");
	}
}
class Son extends Father{
	public void show() {
		System.out.println("show Son");
	}
}
public class fangfachongxie02 {
		public static void main(String[] args) {
			Son s=new Son();
			s.show();
		}
}
