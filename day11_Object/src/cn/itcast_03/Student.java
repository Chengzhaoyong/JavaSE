package cn.itcast_03;

public class Student {
	private String name;
	private int age;
	public Student() {
		super();
	}
	public Student(String name, int age) {
		super();
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
	public String toString() {
		return "������"+name+",���䣺"+age;
	}
	public boolean equals(Object obj) {
//		return true;Ҫ�Ľ�
		//String��equals()��������дObject��ģ��Ƚϵ����ַ����������Ƿ���ͬ
		
	//	Student s=(Student)obj;//������Ҫʹ��ѧ�����еĳ�Ա����������Ҫ����ת��
//		if(this.name.equals(s.name)&&(this.age==s.age)) {
//			return true;
//		}
//		else {
//			return false;
//		}
		
		if(obj==this) {
			return true;//Ϊ�����Ч��
		}
	 /*
	  * �ж�һ�£�obj�ǲ���ѧ����һ����������ǣ�����ת�ͣ����Ƿ���false
	  * ��ʽ:������  instance  ����
	  * 
	  * 
	  */
		if(!(obj instanceof Student)) {
			return false;
			
		}
		   //����Ǿͼ���
		Student s=(Student)obj;//����ת��
		return this.name.equals(s.name)&&this.age==age;
		
		
		
	}

}
