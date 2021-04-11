package Demo03;
/*
 * 
 * 多态的好处：
 * A：提高了代码的维护性（继承保证）
 * 
 * B：提高了代码的扩展性
 * 
 * 猫狗案例代码
 */

class Animal{
	
	public void eat() {
		System.out.println("eat");
	}
	public void sleep() {
		System.out.println("sleep");
	}
}
class Dog extends Animal{
	public void eat() {
		System.out.println("狗吃肉");
	}
	public void sleep() {
		System.out.println("狗站着睡觉");
	}
}
class Cat extends Animal{
	public void eat() {
		System.out.println("猫吃鱼");
	}
	
	public void sleep() {
		System.out.println("猫趴着睡觉");
	}
}
public class DuoTai02 {
	public static void main(String[] args) {
		
	}

}
