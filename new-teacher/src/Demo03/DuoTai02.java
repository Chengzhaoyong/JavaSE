package Demo03;
/*
 * 
 * ��̬�ĺô���
 * A������˴����ά���ԣ��̳б�֤��
 * 
 * B������˴������չ��
 * 
 * è����������
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
		System.out.println("������");
	}
	public void sleep() {
		System.out.println("��վ��˯��");
	}
}
class Cat extends Animal{
	public void eat() {
		System.out.println("è����");
	}
	
	public void sleep() {
		System.out.println("èſ��˯��");
	}
}
public class DuoTai02 {
	public static void main(String[] args) {
		
	}

}
