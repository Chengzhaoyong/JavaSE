package cn.itcast_01;

public class ReflectDemo {
	
	public static void main(String[] args) throws ClassNotFoundException {
		//��ʽ1
		Person p=new Person();
		Class p1=p.getClass();
		
		//��ʽ2
		Class p2=Person.class;
//		System.out.println(p1==p2);
		
		//��ʽ3
		Class p3=Class.forName("cn.itcast_01.Person");
		System.out.println(p1==p3);
		
		
		
		
	}

}
