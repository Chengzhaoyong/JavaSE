package cn.itcast_07;

import java.io.Serializable;

/*
 *   NotserializableException:δ���л��쳣
 *   ��ͨ��ʵ��java.io.Serializable�ӿ������������л����ܡ�δʵ�ִ˽ӿڵ��ཫ�޷�ʹ���κ�״̬���л������л�
 *   �ýӿھ�Ȼû���κη��������������ַ����Ľӿڱ���ǽӿ�
 *   
 *   ���Ķ�Person���еĳ�Ա�󣬾ͻ�������
 *   Ϊʲô����������
 *     Person��ʵ�������л��ӿڣ���ô������ҲӦ����һ�����ֵ
 *     
 *     ԭ�������ǵ�idֵ��ƥ��
 *     ÿ���޸��ļ���ʱ�򣬻��class�ļ��е�idֵƥ�䣬���Ծͻ��������
 *     
 *     �����أ���������а취��idֵ��Ϊһ���̶���ֵ�����������޸��ļ���ʱ�����idֵ�Ͳ���ı���
 *     �����������ɫ�����ߣ�����    private static final long serialVersionUID = 1L;
 *   
 *   ע�⣺
 *      һ��������кܶ��Ա��������Щ�Ҳ���������л���
 *      ʹ��transient�ؼ�����������Ҫ���л��ĳ�Ա����
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

