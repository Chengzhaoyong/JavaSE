package cn.itcast_01;

public class Person {
  private int age;
  private String name;
  public Person() {
	  super();
  }
public Person(int age, String name) {
	super();
	this.age = age;
	this.name = name;
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
@Override
public String toString() {
	return "Person [age=" + age + ", name=" + name + "]";
}
  protected void finalize() throws Throwable{
	  System.out.println("当前的对象被回收了"+this);
	  super.finalize();
  }
}
