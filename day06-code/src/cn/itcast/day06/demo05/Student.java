package cn.itcast.day06.demo05;
/*
 * ��ζ���һ������׼���ࡰ
 * 
 * 1.���еĳ�Ա��������Ҫ��private˽�л�
 * 2.Ϊÿ����Ա������дһ��Getter Setter������
 * 3.��дһ���޲����Ĺ��췽����
 * 4.��дһ��ȫ�����Ĺ��췽����
 * POJO��    ��Plain old java object
 * 
 */
public class Student {
	private String name;
	private int age;
	public Student() {
	}

	public Student(String name, int age) {
	    this.name = name;
		this.age = age;
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
