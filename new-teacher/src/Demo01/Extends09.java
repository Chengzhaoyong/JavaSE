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
		System.out.println("�óԷ��ˣ���Ҫ˯��");
	}
	
}

class Cat extends Animal{
	public Cat() {
		
	}
	public Cat(int age,String name,String color) {
		super(age,name,color);
	}
	public void playGame() {
		System.out.println("è����Ϸ");
	}
}

class Dog extends Animal{
	public Dog() {
}
	public Dog(int age,String name,String color) {
		super(age,name,color);
	}
	public void lookDoor() {
		System.out.println("������");
	}
	
}
public class Extends09 {
	
	public static void main(String[] args) {
		Cat c1=new Cat();
		c1.setName("Tom");
		c1.setColor("��ɫ");
		c1.setAge(2);
		c1.playGame();
		c1.eat();
		System.out.println("è�����֣�"+c1.getName()+"  �����ǣ�"+c1.getAge()+"   ��ɫ�ǣ�"+c1.getColor());
	}

}
