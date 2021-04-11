package cn.itcast_07;

import java.io.Serializable;

/*
 *   NotserializableException:未序列化异常
 *   类通过实现java.io.Serializable接口以启用其序列化功能。未实现此接口的类将无法使其任何状态序列化或反序列化
 *   该接口居然没有任何方法，类似于这种方法的接口被标记接口
 *   
 *   当改动Person类中的成员后，就会有问题
 *   为什么会有问题呢
 *     Person类实现了序列化接口，那么它本身也应该有一个标记值
 *     
 *     原因是他们的id值不匹配
 *     每次修改文件的时候，会和class文件中的id值匹配，所以就会出现问题
 *     
 *     但是呢，如果我们有办法将id值变为一个固定的值，这样，你修改文件的时候，这个id值就不会改变了
 *     方法：点击黄色警告线，生成    private static final long serialVersionUID = 1L;
 *   
 *   注意：
 *      一个类可能有很多成员变量，有些我不想进行序列化，
 *      使用transient关键字声明不需要序列化的成员变量
 *   
 */
public class Person implements Serializable {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	 private transient int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
}

