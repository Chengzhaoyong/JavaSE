package cn.itcast_01;

public class AnimalDemo {
	public static void main(String[] args) {
		Animal t = AnimalFactory.creatAnimal("Dog");

		t.eat();
		t= AnimalFactory.creatAnimal("Cat");
		t.eat();
		
		t=AnimalFactory.creatAnimal("Pig");
		if(t!=null) {
			t.eat();
		}

		else {
			System.out.println("�Բ���û�����ֶ���");
		}
	}
}
