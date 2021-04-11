package cn.itcast_01;

public class Person {
  private String name;
  private int age;
  private String number;
  public Person() {
	  
  }
  private Person(String name) {
	  this.name=name;
  }
  public Person(String name,int age) {
	  this.name=name;
	  this.age=age;
  }
public Person(String name, int age, String number) {
	super();
	this.name = name;
	this.age = age;
	this.number= number;
}
@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + ", number=" + number + "]";
}
public void show() {
	
	System.out.println("show");
}

public void method(String s) {
	System.out.println("method:"+s);
}



  
}
