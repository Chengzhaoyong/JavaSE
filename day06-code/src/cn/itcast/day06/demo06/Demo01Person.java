package cn.itcast.day06.demo06;

public class Demo01Person {
	public static void main(String[] args) {
	    	Person yase=new Person();
	    	yase.setName("��ɪ");
	    	yase.setAge(32);
	    	Person houyi=new Person("����",12);
	    	yase.sayHello(houyi.getName());//��ɪ�ͺ�����к�
	    	houyi.sayHello(yase.getName());
		}
}
