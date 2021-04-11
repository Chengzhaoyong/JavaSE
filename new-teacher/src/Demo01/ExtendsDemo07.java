package Demo01;


class Student{
	private String name;
	private int age;
	public Student() {
		
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
}
class teacher{
	private String name;
	private int age;
	public teacher() {
		
	}
	public teacher(String name, int age) {
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
}
public class ExtendsDemo07 {
		public static void main(String[] args) {
			//方式1创建对象并测试
			Student s1=new Student();
			s1.setName("林青霞");
			s1.setAge(27);
			System.out.println(s1.getName()+"----"+s1.getAge());
			//方式2创建对象并测试
			Student s2=new Student("林青霞",27);
			System.out.println(s1.getName()+"----"+s1.getAge());
					
		}
}
