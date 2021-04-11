package cn.itcast.day06.demo06;

public class Demo01Person {
	public static void main(String[] args) {
	    	Person yase=new Person();
	    	yase.setName("亚瑟");
	    	yase.setAge(32);
	    	Person houyi=new Person("后羿",12);
	    	yase.sayHello(houyi.getName());//亚瑟和后羿打招呼
	    	houyi.sayHello(yase.getName());
		}
}
