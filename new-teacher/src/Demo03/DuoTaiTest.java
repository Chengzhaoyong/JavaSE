package Demo03;

class Animal1{
	public void eat() {
		System.out.println("�Զ���");
	}
}
class Cat1 extends Animal1{
	public void eat() {
		System.out.println("è����");
	}
	public void playGame() {
		System.out.println("è׽�Բ�");
	}
}

class Dog1 extends Animal1{
	public void eat() {
		System.out.println("������");
	}
	public void lookDoor() {
		System.out.println("����");
	}
}
public class DuoTaiTest {
	public static void main(String[] args) {
		Animal1 d = new Dog1();
		d.eat();
		System.out.println("----------");
		Dog1 a = (Dog1) d;
		a.eat();
		a.lookDoor();
		System.out.println("----------");
		d = new Cat1();// ���è

		d.eat();
		Cat1 c = (Cat1)d;
		c.playGame();

	}
}
