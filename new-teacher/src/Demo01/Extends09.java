package Demo01;
class Animal{
	private int age;
	private String name;
	private String color;
	public  Animal(){
		
	}
	public Animal(int age, String name, String color) {
		super();
		this.age = age;
		this.name = name;
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void eat() {
		System.out.println("该吃饭了，不要睡了");
	}
	
}

class Cat extends Animal{
	public Cat() {
		
	}
	public Cat(int age,String name,String color) {
		super(age,name,color);
	}
	public void playGame() {
		System.out.println("猫玩游戏");
	}
}

class Dog extends Animal{
	public Dog() {
}
	public Dog(int age,String name,String color) {
		super(age,name,color);
	}
	public void lookDoor() {
		System.out.println("狗看家");
	}
	
}
public class Extends09 {
	
	public static void main(String[] args) {
		Cat c1=new Cat();
		c1.setName("Tom");
		c1.setColor("白色");
		c1.setAge(2);
		c1.playGame();
		c1.eat();
		System.out.println("猫的名字："+c1.getName()+"  年龄是："+c1.getAge()+"   颜色是："+c1.getColor());
	}

}
